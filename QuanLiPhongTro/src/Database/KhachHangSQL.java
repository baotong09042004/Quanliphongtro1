package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Fomart;
import model.KhachHang;

public class KhachHangSQL {
	public static void insertKhachHang(KhachHang kh) {
		Connection connection = DAO.getConnection();
		String sql = "INSERT INTO tKhachHang(MaKH, MaPhong, HoTen, SDT, CCCD, NgaySinh) VALUES(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, kh.getMaKH());
            statement.setString(2, kh.getMaPhong());
            statement.setString(3, kh.getHoTen());
            statement.setString(4, kh.getSDT());
            statement.setString(5, kh.getCCCD());
            statement.setDate(6, Fomart.covertDateToDateSql(kh.getNgaySinh()));
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
      }
	
	public static void capNhatKhachHangSQL(KhachHang kh) {
        Connection connection = DAO.getConnection();
        String sql = "UPDATE tKhachHang SET MaPhong = ?, HoTen = ?, SDT = ?,  CCCD = ?, NgaySinh = ? WHERE MaKH = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, kh.getMaPhong());
            statement.setString(2, kh.getHoTen());
            statement.setString(3, kh.getSDT());
            statement.setString(4, kh.getCCCD());
            statement.setDate(5, Fomart.covertDateToDateSql(kh.getNgaySinh()));
            statement.setString(6, kh.getMaKH());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
	
	public static boolean kiemTraTonTaiKhachHang(String maKH) {
	    for(KhachHang kh : getAllKhachHangSQL())
	    	if(maKH.equals(kh.getMaKH()))
	    		return true;
	    return false;
	}
	
	public static List<KhachHang> getAllKhachHangSQL() {
        List<KhachHang> danhSachKhachHang = new ArrayList<>();
        Connection connection = DAO.getConnection();
        String sql = "SELECT * FROM tKhachHang";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            	String maKH = resultSet.getString("MaKH");
                String maPhong = resultSet.getString("MaPhong");
                String hoTen = resultSet.getString("HoTen");
                String cCCD = resultSet.getString("CCCD");
                String SDT = resultSet.getString("SDT");
                Date ngaySinh = resultSet.getDate("NgaySinh");
                
                KhachHang kh = new KhachHang(maKH, hoTen, SDT, cCCD, ngaySinh, maPhong);
                danhSachKhachHang.add(kh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachKhachHang;
    }
	
	public static KhachHang getKhachHangTheoMaKH(String maKH) {
        KhachHang kh=null;
        Connection connection = DAO.getConnection();
        String sql = "SELECT * FROM tKhachHang WHERE MaKH = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, maKH);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            	String maKhResult = resultSet.getString("MaKH");
                String maPhong = resultSet.getString("MaPhong");
                String hoTen = resultSet.getString("HoTen");
                String cCCD = resultSet.getString("CCCD");
                String SDT = resultSet.getString("SDT");
                Date ngaySinh = resultSet.getDate("NgaySinh");
                kh = new KhachHang(maKhResult, hoTen, SDT, cCCD, ngaySinh, maPhong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kh;
    }
	public static List<KhachHang> getAllKhachHangTheoMaPhong(String maP) {
        List<KhachHang> dskh=new ArrayList<>();
        Connection connection = DAO.getConnection();
        String sql = "SELECT * FROM tKhachHang WHERE MaPhong = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, maP);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            	String maKhResult = resultSet.getString("MaKH");
                String maPhong = resultSet.getString("MaPhong");
                String hoTen = resultSet.getString("HoTen");
                String cCCD = resultSet.getString("CCCD");
                String SDT = resultSet.getString("SDT");
                Date ngaySinh = resultSet.getDate("NgaySinh");
               KhachHang kh = new KhachHang(maKhResult, hoTen, SDT, cCCD, ngaySinh, maPhong);
               dskh.add(kh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dskh;
    }
	


	public void xoaKhachHangTheoMaSQL(String maKH) {
        Connection connection = DAO.getConnection();
        String sql = "DELETE FROM tKhachHang WHERE MaKH = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, maKH);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
}
