package day5_inheritance;

public class GiaoVien extends Nguoi {
	// thuoc tinh mow rong: maGV, soNamKM
	//ghi de len diChoi()
		//Mo rong: diDay()
	private String maGV;
	private String soNamKM;
	
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getSoNamKM() {
		return soNamKM;
	}
	public void setSoNamKM(String soNamKM) {
		this.soNamKM = soNamKM;
	}
	
	

	
//	public void diChoi() {
//		System.out.println("Di sieu thi");
//	}
	public void diDay() {
		System.out.println("Sang day lop tiet 123");
	}
}
