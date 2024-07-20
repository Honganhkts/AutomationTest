package day3;

import java.util.Scanner;

public class ThucHanh_Return {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("------In ra so lon hon---------");
		System.out.print("Moi ban nhap so thu nhat: ");
		int st1 = scanner.nextInt();
		System.out.print("Moi ban nhap so thu hai:");
		int st2 = scanner.nextInt();
		int result = returnNumber(st1,st2);
		System.out.print("So lon  hon la: " + result);

	}
	public static int returnNumber(int x, int y) {
		if(x>y) return x;
		else return y;
		
	}
}
