package kr.ac.kopo.day05.extend01;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee(1, "홍길동", "사원", 3_200);
		Employee e2 = new Employee(2, "고길동", "사원", 3_300);
		Employee e3 = new Employee(3, "한길동", "대리", 3_800);
		Employee e4 = new Employee(4, "윤길동", "주임", 3_500);
		
		Employee[] empList = {e, e3, e4};
		Manager m = new Manager(100, "나최고", "부장", 7_000, empList);
		
		e.showInfo();
		e2.showInfo();
		e3.showInfo();
		e4.showInfo();
		
		m.showInfo();
	}
	
}
