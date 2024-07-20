package day4_QuanLyNhanVien;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee developer1 = new Employee();
		developer1.setEmployee_id("DV1");
		developer1.setEmployee_name("Trần Thu Trang");
		System.out.println(developer1.getEmployee_id() + ", " + developer1.getEmployee_name() + ", " + developer1.getEmployee_salary());
		
		Employee developer2= new Employee();
		developer2.setEmployee_id("DV2");
		developer2.setEmployee_name("Nguyễn Thúy Quỳnh");
		System.out.println(developer2.getEmployee_id() + ", " + developer2.getEmployee_name() + ", " + developer2.getEmployee_salary());

	}

}
//Không có quyền set giá trị salary => salary  null
