package day5_HinhHoc;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron ht1 = new HinhTron();
		ht1.setTenHinh("Hinh tron");
		ht1.banKinh = 23;
		ht1.tinhDienTich();
		System.out.println(ht1.getTenHinh() + " co dien tich la: " + ht1.tinhDienTich());
		
		System.out.println("===================");
		HinhChuNhat hcn1 = new HinhChuNhat();
		hcn1.setTenHinh("Hinh chu nhat");
		hcn1.chieuDai = 2;
		hcn1.chieuRong = 3;
		hcn1.tinhDienTich();
		System.out.println(hcn1.getTenHinh() + " co dien tich la: " + hcn1.tinhDienTich());
		
	}

}
