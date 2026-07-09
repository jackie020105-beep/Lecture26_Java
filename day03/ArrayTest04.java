/*
4. 학생수를 입력받아 다음과 같이 출력하는코드를 작성하시오.
   학생수를 입력하세요 : 3
   
   1's 성적 : 90
   2's 성적 : 1000
   2's 성적 : -34
   2's 성적 : 89
   3's 성적 : 99
   
   < 총 3명의 학생 성적 출력 >
   1    90
   2    89
   3    99
   
   < 내림차순 성적 출력 >
   99 90  89
    */

package kr.ac.kopo.day03;
import java.util.Scanner;
public class  ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%d's 성적 : ",1+i);
			nums[i] = sc.nextInt();
		}
		
		int human = 0;
		int[] new_num = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<=100 && nums[i]>=0) {
				new_num[human] = nums[i];
				human++;
			}
		}
		System.out.printf("< 총 %d명의 성적 출력 >\n",human);
		for(int i=0; i<human; i++) {
			System.out.printf("%d\t%d\n",i+1,new_num[i]);
		}
		
		System.out.println("< 내림차순 성적 출력 >");
		for(int i=0; i<human; i++) {
			int max = new_num[0];
			int index = 0;
			for(int j=1; j<human; j++) {
				if(new_num[j] > max) {
					max = new_num[j];
					index = j;
				}
			}
			System.out.print(max + " ");
			new_num[index] = -1;
		}
	}

}
