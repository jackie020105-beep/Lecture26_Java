/*
2. 성적을 입력받아 다음과 같이 출력하는 코드를 작성하시오
    90-100 =>A
    80-89 => B
    70-79 => C
    60-69 => D
    0-59  => F
    1's 성적 :    95
    2's 성적 :    -5
    3's 성적 :    1000
    4's 성적 :    85
    5's 성적 :    67
    
    < 성 적 출 력 >
    번호  성적   학점
     1    95    A
     2    ERROR!!!!
     3    ERROR!!!!
     4    85    B
     5    67    D
     5번 중 2번 오류발생!!
     총 점 : 247점
     평 균 : 49.40점 (소수점 둘째자리 출력)
     */

package kr.ac.kopo.day03;
import java.util.Scanner;
public class  ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int ErrorCount = 0;
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%d's 성적 : ",1+i);
			nums[i] = sc.nextInt();
		}
		System.out.println("< 성 적 출 력 >");
		System.out.println("번호\t성적\t학점");
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] <= 100 && nums[i]>= 90) {
				System.out.printf("%d\t%d\t%c\n",nums[i],i+1,'A');
			}else if(nums[i] <= 89 && nums[i]>= 80) {
				System.out.printf("%d\t%d\t%c\n",nums[i],i+1,'B');
			}else if(nums[i] <= 79 && nums[i]>= 70) {
				System.out.printf("%d\t%d\t%c\n",nums[i],i+1,'C');
			}else if(nums[i] <= 69 && nums[i]>= 60) {
				System.out.printf("%d\t%d\t%c\n",nums[i],i+1,'D');
			}else if(nums[i] <= 59 && nums[i]>= 00) {
				System.out.printf("%d\t%d\t%c\n",nums[i],i+1,'E');
			}else {
				System.out.printf("%d\t%s\n",nums[i],"ERROR!!!!");
				ErrorCount++;
				nums[i] = 0;
			}
		}
		if(ErrorCount!=0)
		System.out.printf("%d번중 %d번 오류 발생!!\n",nums.length,ErrorCount);
		
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		System.out.printf("총점 : %d점\n",sum);
		System.out.printf("평균 : %.2f점\n",(double)sum/nums.length-ErrorCount);
	}
}

