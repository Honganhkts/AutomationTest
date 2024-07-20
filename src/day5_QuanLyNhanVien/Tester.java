package day5_QuanLyNhanVien;

public  class Tester extends Employee {
	private int soBugTimDuoc;

	public int getSoBugTimDuoc() {
		return soBugTimDuoc;
	}


	public Tester() {
		super();
	}
	@Override
	public void nhap() {
		super.nhap();
		System.out.print("Nhập số bug tìm được: ");
		soBugTimDuoc = scanner.nextInt();
		
	}
	
	@Override
	public double tinhLuong() {
		thuong = (10/100)*getLuongCoBan() + getSoBugTimDuoc()*60000;
		this.luong = getLuongCoBan() + getLuongCoBan()*60000 + thuong;
		return this.luong;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Số bug tìm được: " + getSoBugTimDuoc());
		System.out.println("Số tiền thưởng tháng: " + this.thuong);
		System.out.println("Tổng lương: " + getLuong());
	}

}
