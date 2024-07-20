package day3;

import java.util.Scanner;

public class Bai2_Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doDai;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap do dai cua mang la:");
		doDai =scanner.nextInt();
		nhapDaySo(doDai);

	}
	public static void nhapDaySo(int doDaiDaySo) {
		Scanner scanner = new Scanner(System.in);
		int []a = new int[doDaiDaySo];
		for(int i=0; i< doDaiDaySo; i++) {
			System.out.print("Moi ban nhap so o vi tri thu "+ i +" trong day so: ");
			a[i] = scanner.nextInt();
			if(a[i] %2==0 && a[i] %3==0) {
				System.out.println("Dieu kien thoat say ra!");
				return;
			}
		}
	}
	

}
