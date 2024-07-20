package day5_inheritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien();
		sv1.setHoTen("Nguyen Van A");
		sv1.setMaSV("SV1");
		sv1.setNgaySinh("01/02/2000");
		sv1.setSoTinChi("20");
		System.out.println("Sinh vien: " + sv1.getHoTen()+" , " + sv1.getMaSV()+" , " + sv1.getNgaySinh()+" , " + sv1.getSoTinChi());
		sv1.diChoi();
		sv1.diHoc();
		System.out.println("========================");
		GiaoVien gv1 = new GiaoVien();
		gv1.setHoTen("Nguyen Van B");
		gv1.setMaGV("GV1");
		gv1.setNgaySinh("01/01/2000");
		gv1.setSoNamKM("20");
		System.out.println("Giao vien: " + gv1.getHoTen()+" , " + gv1.getMaGV()+" , " + gv1.getNgaySinh()+" , " + gv1.getSoNamKM());
		gv1.diChoi();
		gv1.diDay();
	}

}
