package kr.ac.kopo.day03;

import java.util.Arrays;

public class ArrayMain01 {

	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50};
		System.out.println("ar: "+ ar + "  <- [ar의 주소값(stack 영역)]"); //ar의 주소값(stack 영역)
		System.out.println("ar: "+ ar[0] + "  <- [1번째 정수(heap 영역)]"); //1번째 정수 (heap 영역)
		System.out.println("ar: "+ ar[1] + "  <- [2번째 정수(heap 영역)]"); //2번째 정수 (heap 영역)
		System.out.println("ar: "+ ar[2] + "  <- [3번째 정수(heap 영역)]"); //3번째 정수 (heap 영역)
		System.out.println("ar: "+ ar[3] + "  <- [4번째 정수(heap 영역)]"); //4번째 정수 (heap 영역)
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(i+1 + "번째 변수: ");
			System.out.println(ar[i]);		
		}
		for(int num : ar) {
			System.out.println(num);
		}
		
		System.out.println(Arrays.toString(ar));
	}
}
