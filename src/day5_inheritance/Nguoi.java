package day5_inheritance;

public abstract class Nguoi {
	// thuoc tinh private: hoTen,tuoi,ngaySinh => getter,setter
	//phuong thuc dichoi()//trien khai Code
	private String hoTen;
	private String ngaySinh;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void diChoi() {
		System.out.println("Di choi cong vien");
	};
	
}
