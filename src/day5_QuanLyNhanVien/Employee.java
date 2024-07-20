package day5_QuanLyNhanVien;

import java.util.Scanner;
// quản lý nhân viên 3 phòng ban: Dev, Test, BA
//thuộc tính chung: maNV, hoTen, SDT, ngaySinh, luongCoBan
// có hàm để tính ra lương
// với Dev có thuộc tính riêng là giờ trực => Luong = luongCoBan + giờ trực*300000
//Vơi test có thuộc tính riêng là số bug tìm được => Lương = luongCoBan + bug*60000
//với BA có thuộc tính riêng giờ call khách hàng => Luong = luongCoBan + giờ call*50000
// làm thêm phần bài tập nâng cao: Tìm kiếm và in ra nhân viên có mức lương cao hơn mức lương trung bình của phòng ban
//và tính tổng chi phí trả lương cho nhân viên biết rằng có thêm khoản thưởng trung bình hàng tháng = 10%lương
public abstract class Employee {
	private String maNV;
	private String hoTen;
	private String sdt;
	private String ngaySinh;
	protected double luongCoBan,luong,thuong = 0;
	Scanner scanner = new Scanner(System.in);

	public double getLuong() {
		return luong;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public String getMaNV() {
		return maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public abstract double tinhLuong();
	

	public void nhap() {
		System.out.print("Nhập mã nhân viên: ");
		maNV = scanner.nextLine();
		System.out.print("Nhập họ và tên : ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập số điện thoại: ");
		sdt = scanner.nextLine();
		System.out.print("Nhập ngày sinh : ");
		ngaySinh = scanner.nextLine();
		System.out.print("Nhập lương cơ bản : ");
		luongCoBan = scanner.nextInt();
	}
	public void xuat() {
		System.out.println("Mã nhân viên: " + getMaNV());
		System.out.println("Họ và tên: " + getHoTen());
		System.out.println("Số điện thoại: " + getLuong());
		System.out.println("Ngày sinh: " + getNgaySinh());
		System.out.println("Lương cơ bản: " + getLuongCoBan());
		
	}
	
 
}
