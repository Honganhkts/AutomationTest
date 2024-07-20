package day5_QuanLyNhanVien;

public  class BA extends Employee{
	private int gioCall;

	public int getGioCall() {
		return gioCall;
	}

	public BA() {
		super();
	}
	public void nhap() {
		super.nhap();
		System.out.print("Nhập số giờ call với khách hàng: ");
		gioCall = scanner.nextInt();
		
	}
	
	
	@Override
	public double tinhLuong() {
		thuong = (10/100)*getLuongCoBan() + getGioCall()*500000;
		this.luong = getLuongCoBan() + getGioCall()*50000 +thuong;
		return this.luong;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Số giờ call với khách hàng: " + getGioCall());
		System.out.println("Số tiền thưởng tháng: " + this.thuong);
		System.out.println("Tổng lương: " + getLuong());
	}

}
