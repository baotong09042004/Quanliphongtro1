package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Fomart;
import model.HoaDon;



public class HoaDonSQL {
	public static void insertHoaDon(HoaDon hoaDon) {
		Connection connection = DAO.getConnection();
        String sql = "INSERT INTO tHoaDon(MaHD, MaPhong, NgayThanhToan, TienDien, TienNuoc, TienDichVu) VALUES(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
        	
            statement.setString(1, hoaDon.getMaHoaDon());
            statement.setString(2, hoaDon.getMaPhong());
            statement.setDate(3, Fomart.covertDateToDateSql(hoaDon.getNgayThanhToan()));
            statement.setFloat(4, hoaDon.getTienDien());
            statement.setFloat(5, hoaDon.getTienNuoc());
            statement.setFloat(6, hoaDon.getTienDV());
            
            statement.executeUpdate();
        } catch (SQLException e) {
        }
    }
	
	

	public static void xoaHoaDonTheoMa(String maHoaDon) {
        Connection connection = DAO.getConnection();
        String sql = "DELETE FROM tHoaDon WHERE MaHD = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, maHoaDon);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public static void updateHoaDonVaoCoSoDuLieu(HoaDon hoaDon) {
	    Connection connection = DAO.getConnection();
	    String sql = "UPDATE tHoaDon SET MaPhong = ?, NgayThanhToan = ?, TienDien = ?, TienNuoc = ?, TienDichVu=? WHERE MaHD = ?";
	    
	    try (PreparedStatement statement = connection.prepareStatement(sql)) {
	    	
	            statement.setString(1, hoaDon.getMaPhong());
	            statement.setDate(2, Fomart.covertDateToDateSql(hoaDon.getNgayThanhToan()));
	            statement.setFloat(3, hoaDon.getTienDien());
	            statement.setFloat(4, hoaDon.getTienNuoc());
	            statement.setFloat(5, hoaDon.getTienDV());
	            statement.setString(6, hoaDon.getMaHoaDon());
	            
	            statement.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static List<HoaDon> getAllHoaDon() {
		
		    Connection conn = DAO.getConnection();
		    String sql = "SELECT tHoaDon.MaHD, tHoaDon.MaPhong, NgayThanhToan, tPhong.GiaPhong, TienDien, TienNuoc, TienDichVu " +
		                 "FROM tHoaDon JOIN tPhong ON tHoaDon.MaPhong = tPhong.MaPhong";
		    List<HoaDon> dsHoaDon=new ArrayList<>();
		    try (Statement stmt = conn.createStatement();
		         ResultSet rs = stmt.executeQuery(sql)) {
		        while (rs.next()) {
		            String maHoaDon = rs.getString("MaHD");
		            String maPhong = rs.getString("MaPhong");
		            Date ngayThanhToan = rs.getDate("NgayThanhToan");
		            float giaPhong = rs.getFloat("GiaPhong");
		            float tienDien = rs.getFloat("TienDien");
		            float tienNuoc = rs.getFloat("TienNuoc");
		            float tienDV = rs.getFloat("TienDichVu");

		            HoaDon hoaDon = new HoaDon(maHoaDon, maPhong, ngayThanhToan, tienDien, tienNuoc, giaPhong, tienDV);
		            dsHoaDon.add(hoaDon);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return dsHoaDon;
	}
    public static boolean kiemTraTonTaiHoaDon(String maHoaDon) {
    	for(HoaDon hd : getAllHoaDon())
    		if(maHoaDon.equals(hd.getMaHoaDon()))
    			return true;
    	return false;
    }
	public static HoaDon timHoaDonTheoMaHD(String maHD) {
        HoaDon hd=null;
        Connection connection = DAO.getConnection();
        String sql = "SELECT tHoaDon.MaHD, tHoaDon.MaPhong, NgayThanhToan, tPhong.GiaPhong, TienDien, TienNuoc, TienDichVu " +
                "FROM tHoaDon JOIN tPhong ON tHoaDon.MaPhong = tPhong.MaPhong where tHoaDon.MAHD=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, maHD);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            	String maHoaDon = resultSet.getString("MaHD");
                String maPhong = resultSet.getString("MaPhong");
                Float tienPhong=resultSet.getFloat("GiaPhong");
                Float tienNuoc=resultSet.getFloat("TienNuoc");
                Float tienDien=resultSet.getFloat("TienDien");
                Float tienDichVu=resultSet.getFloat("TienDichVu");
                Date ngayThanhToan = resultSet.getDate("NgayThanhToan");
                hd = new HoaDon(maHoaDon, maPhong, ngayThanhToan, tienDien, tienNuoc, tienPhong, tienDichVu);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return hd;
    }
    
	public static List<HoaDon> timHoaDonTheoMaPhong(String maP) {
        List<HoaDon> dsHoaDon=new ArrayList<>();
        Connection connection = DAO.getConnection();
        String sql = "SELECT tHoaDon.MaHD, tHoaDon.MaPhong, NgayThanhToan, tPhong.GiaPhong, TienDien, TienNuoc, TienDichVu " +
                "FROM tHoaDon JOIN tPhong ON tHoaDon.MaPhong = tPhong.MaPhong where tHoaDon.MaPhong=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, maP);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            	String maHoaDon = resultSet.getString("MaHD");
                String maPhong = resultSet.getString("MaPhong");
                Float tienPhong=resultSet.getFloat("GiaPhong");
                Float tienNuoc=resultSet.getFloat("TienNuoc");
                Float tienDien=resultSet.getFloat("TienDien");
                Float tienDichVu=resultSet.getFloat("TienDichVu");
                Date ngayThanhToan = resultSet.getDate("NgayThanhToan");
                HoaDon hd = new HoaDon(maHoaDon, maPhong, ngayThanhToan, tienDien, tienNuoc, tienPhong, tienDichVu);
                dsHoaDon.add(hd);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return dsHoaDon;
    }

}
