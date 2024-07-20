package day3;

import java.util.Scanner;

public class Bai1_Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(10);

	}
	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		int []mangSoNguyen = new int[doDaiMang];
		for (int i=0;i< doDaiMang;i++) {
			System.out.print("Nhap phan tu thu "+i+" trong mang: ");
			mangSoNguyen[i] = scanner.nextInt();
		}
		sapXepMangTangDan(mangSoNguyen);
		sapXepMangGiamDan(mangSoNguyen);
	
		
	}
	public static void inMang(int []mangSoNguyen) {
		for(int i=0;i<mangSoNguyen.length;i++) {
			System.out.print(mangSoNguyen[i]+ "  ");
		}
	}
	public static void sapXepMangTangDan(int []mangSoNguyen) {
		int tam;
		
		for(int i=0; i< mangSoNguyen.length;i++) {
			for(int j=0; j<mangSoNguyen.length-1;j++) {
				
				if(mangSoNguyen[j] > mangSoNguyen[j+1]) {
					tam = mangSoNguyen[j];
					mangSoNguyen[j] = mangSoNguyen[j+1];
					mangSoNguyen[j+1] = tam;
				}
			}
		}
		System.out.println("Mang sap xep theo thu tu tang dan la: ");
		inMang(mangSoNguyen);
		
	}
	public static void sapXepMangGiamDan(int []mangSoNguyen) {
		int tam;
		
		for(int i=0; i< mangSoNguyen.length;i++) {
			for(int j=0; j<mangSoNguyen.length-1;j++) {
				
				if(mangSoNguyen[j] < mangSoNguyen[j+1]) {
					tam = mangSoNguyen[j+1];
					mangSoNguyen[j+1] = mangSoNguyen[j];
					mangSoNguyen[j] = tam;
				}
			}
		}
		System.out.println("\nMang sap xep theo thu tu giam dan la: ");
		inMang(mangSoNguyen);
	}

}
