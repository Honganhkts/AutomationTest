package day5_inheritance;

public class SinhVien extends Nguoi {
// thuoc tinh mo rong: maSV, soTinChi
//ghi de len diChoi()
	//Mo rong: diHoc()
	private String maSV;
	private String soTinChi;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(String soTinChi) {
		this.soTinChi = soTinChi;
	}
	
	public void diChoi() {
		System.out.println("Di be boi");
	}
	public void diHoc() {
		System.out.println("Chieu toi di hoc tieng anh");
	}
	
	
}
