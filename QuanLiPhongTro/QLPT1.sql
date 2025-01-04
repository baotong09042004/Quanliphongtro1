Create database QLPHONGTRO1

create table tPhong(
	MaPhong nvarchar(50),
	Tang int,
	GiaPhong float,
	SoLuongNguoiMax int,
	SoLuongNguoiHienTai int,
	PRIMARY KEY (MaPhong)
	
);
create table tKHachHang(
	MaKH nvarchar(50),
	HoTen nvarchar(50),
	SDT nvarchar(50),
	CCCD nvarchar(50),
	NgaySinh date,
	MaPhong nvarchar(50),
	PRIMARY KEY (MaKH),
	FOREIGN KEY (MaPhong) REFERENCES tPhong(MaPhong)
	ON DELETE CASCADE
);

create table tHoaDon(
	MaHD nvarchar(50),
	MaPhong nvarchar(50),
	NgayThanhToan date,
	TienDien float,
	TienNuoc float,
	TienDichVu float,
	PRIMARY KEY (MaHD),
	FOREIGN KEY (MaPhong) REFERENCES tPhong(MaPhong)
	ON DELETE CASCADE
);
