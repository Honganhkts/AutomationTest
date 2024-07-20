package day3;

import java.util.Scanner;

public class Bai3_Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(10);
		

	}
	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		int []mang = new int[doDaiMang];
		for(int i=0;i<doDaiMang;i++) {
			System.out.print("Nhap phan tu thu "+i+" trong mang: ");
			mang[i] = scanner.nextInt();
		}
		inMang(mang);
		giaTriLonNhat(mang);
		giaTriNhoNhat(mang);

	}
	public static void inMang(int []mang) {
		System.out.print("Mang ban vua nhap la : ");
		for(int i=0;i<mang.length; i++) {
			System.out.print(mang[i] + "    ");
		}
	}
	public static void giaTriLonNhat(int []mang) {
		int soLonNhat = mang[0];
		for(int i=0;i< mang.length;i++) {
			if(soLonNhat < mang[i]) {
				soLonNhat = mang[i];
			}
		}
		System.out.println("\nGia tri lon nhat cua mang la: " + soLonNhat);
	}
	public static void giaTriNhoNhat(int []mang) {
		int soNhoNhat = mang[0];
		for(int i=0;i< mang.length;i++) {
			if(soNhoNhat > mang[i]) soNhoNhat = mang[i];
		}
		System.out.println("Gia tri nho nhat cua mang la: " + soNhoNhat);
	}

}
