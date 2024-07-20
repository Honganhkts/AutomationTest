package day4_encapsolution;

public class Person {
	public String name;
	private String phoneNumber;
	
	
	//vì phoneNumber là biến private nên cần tạo phương thức get để lấy thông tin
	//và set để nhập thông tin sđt
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}

	
	

}
