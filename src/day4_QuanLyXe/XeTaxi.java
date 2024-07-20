package day4_QuanLyXe;

public class XeTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe taxi1 = new Xe();
		taxi1.setLoaiXe("Toyota");
		taxi1.setTenXe("Vios");
		taxi1.setVanTocMax(320);
		System.out.println("Loai xe la: " + taxi1.getLoaiXe() + ", ten xe la: " + taxi1.getTenXe() + ", van toc max la: " + taxi1.getVanTocMax());
		
		Xe taxi2 = new Xe();
		taxi2.setLoaiXe("Toyota");
		taxi2.setTenXe("KiaMorning");
		taxi2.setVanTocMax(250);
		System.out.println("Loai xe la: " + taxi2.getLoaiXe() + ", ten xe la: " + taxi2.getTenXe() + ", van toc max la: " + taxi2.getVanTocMax());
	}

}
