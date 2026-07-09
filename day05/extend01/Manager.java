package kr.ac.kopo.day05.extend01;

public class Manager {
	int no;
	String name;
	String grade;
	int salary;
	/** 관리사원 목록 */
	Employee[] empList;
	
	
	Manager() {
		
	}


	public Manager(int no, String name, String grade, int salary, Employee[] empList) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
		this.empList = empList;
	}
	void showInfo() {
		System.out.println("사원번호 : " + no + ", 이름 : " + name + ", 직급 : " + grade + ", 연봉 : " +  salary + "만원");
		System.out.println("<관리사원목록>");
		for(int i=0; i<empList.length; i++) {
			empList[i].showInfo();
		}
	}
	
	
}
