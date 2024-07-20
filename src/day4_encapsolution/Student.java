package day4_encapsolution;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student1 = new Person();
		student1.name = "Nguyen Van A";
		student1.setPhoneNumber("02928283626");
		System.out.println("Ho va ten: " + student1.name + ", so dien thoai: " + student1.getPhoneNumber());
		
		Person student2 = new Person();
		student2.name = "Nguyen Thi B";
		student2.setPhoneNumber("034838474555");
		System.out.println("Ho va ten: " + student2.name + ", so dien thoai: " + student2.getPhoneNumber());

	}

}
