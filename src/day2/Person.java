package day2;

import java.util.Scanner;

public class Person {
	public static int  a,b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Họ và tên: 23.6 Class");
//		System.out.println("Số điện thoại: 02938239238");
//		System.out.println("Email: honganh@gmail.com");
//		a=622; b = 212;
//		int result = a+b;
//		System.out.println("a + b = " + result);
//		printLangerNumber(a,b);
		yeuCau1();
		yeuCau2();
	}
	public	static void printLangerNumber(double number1, double number2) {
		if(number1>number2) {
			System.out.println("Số lớn hơn là: " + number1);
		}
		else System.out.println("Số lớn hơn là: " + number2);
	}
	public	static void yeuCau1() {
		float x=1123;
		float y = 6745; 
		float z = 500;
		float result2 = (x*y)/500;
		System.out.println("Ket qua cua phep tinh ("+ x + "*" +y + ")/" + z +"= " + result2);
	}
	public static void yeuCau2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất: ");
		float st1 = scanner.nextFloat();
		System.out.print("Nhập số thứ hai: ");
		float st2 = scanner.nextFloat();
		if(st1>st2) {
			System.out.println("Số lớn hơn là: " + st1);
		}
		else System.out.println("Số lớn hơn là: " + st2);
		
		
		
	}

}
