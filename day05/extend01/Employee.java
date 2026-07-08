package kr.ac.kopo.day05.extend01;

public class Employee {
	/** 사원번호 */
	int no;
	/** 사원이름 */
	String name;
	/** 사원직급 */
	String grade;
	/** 사원연봉 */
	int salary;
	
	public Employee() {
		
	}
	
	Employee(int no, String name, String grade, int salary){
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	void showInfo() {
		System.out.println("사원번호 : " + no + ", 이름 : " + name + ", 직급 : " + grade + ", 연봉 : " +  salary + "만원");
	}
	
}
