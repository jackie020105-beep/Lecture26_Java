package kr.ac.kopo.day04;

public class Gugudan {

	public void printGu() {
		System.out.println("<<< 전체 구구단 출력 >>>");
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
			System.out.println();
		}
	}

	public void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
}