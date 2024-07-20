package day5_TinhLuongBacSi;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tinhLuong tong = new tinhLuong();
		System.out.println("Lương hệ số: " + tong.tongLuong(1000000, 2));
		System.out.println("Lương hệ số năm kinh nghiệm: " + tong.tongLuong(1000000, 2, 2.5));
		System.out.println("Lương chuyên khoa : " + tong.tongLuong(1000000, 3,1.5,0.2)); 
		System.out.println("Lương đa khoa : " + tong.tongLuong(1000000, 3,1.5,0.45)); 

	}

}
