package kr.ac.kopo.day04;
import java.util.Scanner;
public class GugudanMain {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();
		
		gu.printGu();
		
		System.out.print("2 - 9사이의 단을 입력 : ");
		int dan = sc.nextInt();
		
		gu.print(dan);
	}

}
