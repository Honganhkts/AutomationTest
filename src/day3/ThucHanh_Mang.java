package day3;

import java.util.Scanner;

public class ThucHanh_Mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(10);

	}
	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		int []mangSoNguyen = new int[doDaiMang];
		for (int i=0;i< doDaiMang;i++) {
			System.out.println("Nhap gia tri cua mang o vi tri thu: " + i);
			mangSoNguyen[i] = scanner.nextInt();
		}
		sapXepMangTangDan(mangSoNguyen);
		sapXepMangGiamDan(mangSoNguyen);
	
		
	}
	public static void inMang(int []mangSoNguyen) {
		//System.out.println("Do dai length cua mang la:  " + mangSoNguyen.length);
		//System.out.print("\nCac gia tri cua mang la: ");
		for(int i=0;i<mangSoNguyen.length;i++) {
			System.out.print(mangSoNguyen[i]+ "  ");
		}
	}
	public static void timGiaTriLonNhat(int []mangSoNguyen) {
		int soLonNhat = 0;
		for (int i=0;i< mangSoNguyen.length ;i++) {
			if(soLonNhat < mangSoNguyen[i]) soLonNhat = mangSoNguyen[i];
 		}
		System.out.println("\nGia tri lon nhat cua mang la: " + soLonNhat);
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
