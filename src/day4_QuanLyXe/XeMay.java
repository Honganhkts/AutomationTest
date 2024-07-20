package day4_QuanLyXe;

public class XeMay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe xeMay1 = new Xe();
		xeMay1.setLoaiXe("Honda");
		xeMay1.setTenXe("Lead");
		xeMay1.setVanTocMax(110);
		System.out.println("Loai xe la: " + xeMay1.getLoaiXe() + ", ten xe la: " + xeMay1.getTenXe() + ", van toc max la: " + xeMay1.getVanTocMax());
		
		Xe xeMay2 = new Xe();
		xeMay2.setLoaiXe("Yamaha");
		xeMay2.setTenXe("AirBlade");
		xeMay2.setVanTocMax(160);
		System.out.println("Loai xe la: " + xeMay2.getLoaiXe() + ", ten xe la: " + xeMay2.getTenXe() + ", van toc max la: " + xeMay2.getVanTocMax());

	}

}
