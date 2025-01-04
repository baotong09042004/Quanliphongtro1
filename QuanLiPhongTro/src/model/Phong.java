package model;

import java.util.Objects;

public class Phong {
	private String maPhong;
	private int tang;
	private float giaPhong;
	private int sLNguoiMax;
	private int soLuongHienTai;
	
	public Phong() {
		
	}

	public Phong(String maPhong, int tang, float giaPhong, int sLNguoiMax, int soLuongHienTai) {
		super();
		this.maPhong = maPhong;
		this.tang = tang;
		this.giaPhong = giaPhong;
		this.sLNguoiMax = sLNguoiMax;
		this.soLuongHienTai = soLuongHienTai;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public int getTang() {
		return tang;
	}

	public void setTang(int tang) {
		this.tang = tang;
	}

	public float getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(float giaPhong) {
		this.giaPhong = giaPhong;
	}

	public int getSLNguoiMax() {
		return sLNguoiMax;
	}

	public void setSLNguoiMax(int sLNguoiMax) {
		this.sLNguoiMax = sLNguoiMax;
	}

	public int getSoLuongHienTai() {
		return soLuongHienTai;
	}

	public void setSoLuongHienTai(int soLuongHienTai) {
		this.soLuongHienTai = soLuongHienTai;
	}

	@Override
	public int hashCode() {
		return Objects.hash(giaPhong, maPhong, sLNguoiMax, soLuongHienTai, tang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phong other = (Phong) obj;
		return Float.floatToIntBits(giaPhong) == Float.floatToIntBits(other.giaPhong)
				&& Objects.equals(maPhong, other.maPhong) && sLNguoiMax == other.sLNguoiMax
				&& soLuongHienTai == other.soLuongHienTai && tang == other.tang;
	}
	
}