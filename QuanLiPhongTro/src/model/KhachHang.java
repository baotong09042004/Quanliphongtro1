package model;

import java.util.Date;


public class KhachHang {
	private String MaKH;
	private String HoTen;
	private String SDT;
	private String CCCD;
	private Date NgaySinh;
	private String maPhong;
	public KhachHang(String maKH, String hoTen, String sDT, String cCCD, Date ngaySinh, String maPhong) {
		super();
		MaKH = maKH;
		HoTen = hoTen;
		SDT = sDT;
		CCCD = cCCD;
		NgaySinh = ngaySinh;
		this.maPhong = maPhong;
	}
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getCCCD() {
		return CCCD;
	}
	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
}
