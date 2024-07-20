package day5_overloading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhTong test = new TinhTong();
		System.out.println(test.add(2, 64));
		System.out.println(test.add(2.456, 69.23));
		System.out.println(test.add(2, 69,34));

		System.out.println(test.add("chuoi 1", "chuoi 2"));


	}

}
