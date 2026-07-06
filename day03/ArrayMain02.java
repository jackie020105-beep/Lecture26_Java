package kr.ac.kopo.day03;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];

		System.out.println(Arrays.toString(nums));
		
		//nums[0] = 1;
		//nums[1] = 3;
		//nums[2] = 5;
		//nums[3] = 7;
		//nums[4] = 9;
		
		//nums = new int[] {1, 3, 5, 7, 9};
		
		
		for (int i=0, data = i; i < nums.length; i++, data += 2) {
			nums[i] = data;
		}
	
		System.out.println(Arrays.toString(nums));
		
		String[] strArr = {"자바","여름방학","교육"};
		System.out.println("strArr : " + Arrays.toString(strArr));
		System.out.println("strArr : " + strArr);
		
	}
}
