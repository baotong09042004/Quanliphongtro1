package Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Phong;


public class PhongSQL {
	
	public static void insertPhong(Phong phong) {
		Connection connection = DAO.getConnection();
        String sql = "INSERT INTO tPhong(MaPhong, Tang, GiaPhong, SoLuongNguoiMax, SoLuongNguoiHienTai) VALUES(?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, phong.getMaPhong());
            statement.setInt(2, phong.getTang());
            statement.setFloat(3, phong.getGiaPhong());
            statement.setInt(4, phong.getSLNguoiMax());
            statement.setInt(5, phong.getSoLuongHienTai());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public static void xoaPhongTheoMa(String maPhong) {
        Connection connection = DAO.getConnection();
        String sql = "DELETE FROM tPhong WHERE MaPhong = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, maPhong);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public static void updatePhongVaoCoSoDuLieu(Phong phong) {
	    Connection connection = DAO.getConnection();
	    String sql = "UPDATE tPhong SET Tang = ?, GiaPhong = ?, SoLuongNguoiMax = ? WHERE MaPhong = ?";
	    
	    try (PreparedStatement statement = connection.prepareStatement(sql)) {
	        statement.setInt(1, phong.getTang());
	        statement.setFloat(2, phong.getGiaPhong());
	        statement.setInt(3, phong.getSLNguoiMax());
	        statement.setString(4, phong.getMaPhong());
	        statement.executeUpdate();
	        
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public static void updateSoLuongNguoiHienTai() {
		Connection conn=DAO.getConnection();
		String sql="update tPhong set SoLuongNguoiHienTai=(select count(tKHachHang.MaKH)"+
                        "from tPhong  p join tKHachHang on P.MaPhong=tKHachHang.MaPhong where tPhong.MaPhong=p.MaPhong group by p.MaPhong)";
		 try(PreparedStatement stm=conn.prepareStatement(sql)){
			 stm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static boolean kiemTraTonTaiMaPhong(String maPhong) {
		for(Phong phong : getAllPhongSQL()) {
			if(maPhong.equals(phong.getMaPhong()))
				return true;
		}
		return false;
	}
	public static Phong timPhongTheoMa(String maP) {
		for(Phong p : getAllPhongSQL())
			if(p.getMaPhong().equals(maP))
				return p;
		return null;
	}
	public static List<Phong> getAllPhongSQL() {
        List<Phong> danhSachPhong = new ArrayList<>();
        Connection connection = DAO.getConnection();
        String sql = "SELECT * FROM tPhong";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
            	String maPhong = rs.getString("MaPhong");
            	int tang=rs.getInt("Tang");
    			float giaPhong=rs.getFloat("GiaPhong");
    			int soLuongNguoiMax=rs.getInt("SoLuongNguoiMax");
    			int soLuongHienTai=rs.getInt("SoLuongnguoiHienTai");
    			Phong p =new Phong(maPhong, tang, giaPhong, soLuongNguoiMax, soLuongHienTai);
                danhSachPhong.add(p); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachPhong;
    }


}