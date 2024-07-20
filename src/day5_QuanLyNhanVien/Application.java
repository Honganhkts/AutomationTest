package day5_QuanLyNhanVien;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên: ");
		int soNV = scanner.nextInt();
		Employee[] employee = new Employee[soNV];
		System.out.println("--------------Nhập thông tin nhân viên---------------------");
		for(int i=0;i<soNV;i++) {
			System.out.println("Nhập thông tin nhân viên thứ " + (i+1) + ": ");
			System.out.println("Chọn nhân viên thuộc phòng ban: \n1 - Developer\n2 - Tester\n3 - BA");
			int choose = scanner.nextInt();
			if(choose == 1) {
				employee[i] = new Developer();
			}
			else if(choose == 2) {
				employee[i] = new Tester();
			}
			else if(choose == 3) {
				employee[i] = new BA();
			}
			else {
				System.out.println("Điều kiện thoát sảy ra ! ");
				break;
				}
			employee[i].nhap();
			employee[i].tinhLuong();
			}
		System.out.println("--------------Xuất thông tin nhân viên---------------------");
		for(int i=0;i<soNV;i++) {
			employee[i].xuat();
			System.out.println("\n");
		}
		
		
		double tongLuong = 0; double luongTrungBinh = 0;
		
		for(int i=0;i<soNV;i++) {
			employee[i].tinhLuong();
			tongLuong += employee[i].tinhLuong();
		}
		luongTrungBinh = tongLuong/soNV;
		System.out.println("=> Lương trung bình = " + luongTrungBinh);
		System.out.println("----------Danh sách nhân viên có mức lương cao hơn mức lương trung bình là-----------");
		for(int i=0;i<soNV;i++) {
			if(employee[i].tinhLuong() > luongTrungBinh) {
				employee[i].xuat();
			}
		}

	}

}
