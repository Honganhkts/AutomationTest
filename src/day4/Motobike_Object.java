package day4;

public class Motobike_Object {
	static String hangXe;
	static String mauXe;
	static String bienSoXe;
	static String ngayDangKy;
	
	public static String getInformation() {
		return("Hang xe la: " + hangXe + ", mau xe la: "+mauXe +", bien so xe la: " + bienSoXe + ", ngay dang ky la: " + ngayDangKy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike_Object xe1 = new Motobike_Object();
		xe1.hangXe = "Lead";
		xe1.mauXe = "Do";
		xe1.bienSoXe = "29H-12344";
		xe1.ngayDangKy = "01/02/2023";
		System.out.println(xe1.getInformation());
		
		Motobike_Object xe2 = new Motobike_Object();
		xe2.hangXe = "Vision";
		xe2.mauXe = "Xam";
		xe2.bienSoXe = "30H-12344";
		xe2.ngayDangKy = "02/02/2022";
		System.out.println(xe2.getInformation());
		

	}

}
