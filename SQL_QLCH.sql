CREATE DATABASE		QUANLYCUAHANG
ON PRIMARY
( 
	NAME ='QUANLYCUAHANG_data',
	FILENAME='G:\DataBase\QUANLYCUAHANG.mdf',
	SIZE=5MB,
	MAXSIZE=50MB,
	FILEGROWTH=10%
)
	LOG ON
(
	NAME ='QUANLYCUAHANG_log',
	FILENAME='G:\DataBase\QUANLYCUAHANG_log.ldf',
	SIZE=5MB,
	MAXSIZE=50MB,
	FILEGROWTH=10%
)

CREATE TABLE HangHoa
(
	MaHang varchar(10) not null primary key,
	TenHang nvarchar(50) not null,
	SoLuong int,
	)





CREATE TABLE KHACHHANG
(
	MaKhachHang varchar(12) primary key not null,
	TenKhachHang nvarchar(20),
	DienThoai char(15),
	
)
CREATE TABLE NHANVIEN
(
	MaNhanVien varchar(12) primary key not null,
	TenNhanVien varchar(50),
	DienThoai int,
)

CREATE TABLE DONGIA
(
	MaDonGia varchar(12) primary key not null,
	USD money,
	VNDong money,
	
)
CREATE TABLE HANGVE
(
	MaHangVe varchar(12) primary key not null,
	TenHangVe nvarchar(50),
	SoLuong int,
	
)
CREATE TABLE HOADON
(
	MaHoaDon varchar(12) primary key not null,
	TenNhanVien varchar(50),
	DienThoai int,
	
)
CREATE TABLE CHITIETHOADON
(
	MaHoaDon varchar(12) primary key not null,
	MaKhachHang varchar(12),
	MaHang varchar(10) ,
	MaDonGia varchar(12) ,
	SoLuong int,
	
)