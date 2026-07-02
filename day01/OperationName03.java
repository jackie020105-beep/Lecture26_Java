package kr.ac.kopo.day01;

import java.util.Scanner;

public class OperationName03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("반지름 입력 : ");
        double a = sc.nextInt();

        double sjfqdl = Math.PI * a * a;
        double enffp = 2 * Math.PI * a;

        System.out.printf("넓이 : %.2f%n", sjfqdl);
        System.out.printf("둘레 : %.2f%n", enffp);
	}

}