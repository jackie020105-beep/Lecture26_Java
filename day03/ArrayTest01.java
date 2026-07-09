/*
1. 10개의 정수를 입력받아 다음과 같은 결과를 보이는 프로그램을 작성하시오.
    num1 : 12
    num2 : 8
    num3 : 33
    num4 : 6
    num5 : 23
    num6 : 84
    num7 : 1
    num8 : 534
    num9 : 76
    num10 : 3
    
    < 짝수 > 
    12  8  6  84  534  76
    
    < 홀수 >
    33  23  1  3
    */


package kr.ac.kopo.day03;
import java.util.Scanner;
public class  ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i=0; i<nums.length; i++) {
			System.out.printf("num%d : ",1+i);
			nums[i] = sc.nextInt();
		}
		
		System.out.println("< 짝수 >");
		for(int i : nums) {
			if(i%2==0) {
				System.out.printf("%d\t",i);
			}
		}
		
		System.out.println("\n< 홀수 >");
		for(int i : nums) {
			if(i%2==1) {
				System.out.printf("%d\t",i);
			}
		}
	}

}

