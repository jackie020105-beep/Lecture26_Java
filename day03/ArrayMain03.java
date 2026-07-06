package kr.ac.kopo.day03;

import java.util.Arrays;
import java.util.Scanner;

/*
키보드로 5개의 정술을 입력 받아 다음과 같이 출력하는 코드를 작성하시오
	
	num1 : 12
	num2 : 9
	num3 : 6
	num4 : 20
	num5 : 30
	
	<print>
	30 20 6 9 12
*/


public class ArrayMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int [5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("num" + (i+1) +" : ");
			nums[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("<print>");
		for(int i = nums.length -1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
