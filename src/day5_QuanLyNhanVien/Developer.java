package day5_QuanLyNhanVien;

public class Developer extends Employee {
	private double gioTruc;

	public double getGioTruc() {
		return gioTruc;
	}


	public Developer() {
		super();
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.print("Nhập số giờ trực đêm: ");
		gioTruc = scanner.nextFloat();
		
	}
	
	@Override
	public double tinhLuong() {
		thuong = (10/100)*getLuongCoBan() + getGioTruc()*60000;
		this.luong = getLuongCoBan() + getGioTruc()*300000 + thuong;
		return this.luong;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Số giờ trực đêm: " + getGioTruc());
		System.out.println("Số tiền thưởng tháng: " + this.thuong);
		System.out.println("Tổng lương: " + getLuong());
	}



}
