/*
3. 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오
   2 - 100사이의 정수를 입력 : 15
   
   < 15의 약수 출력 >
   1  3  5  15
   약수의 개수 : 4개   
   
   ----------------------------
    2 - 100사이의 정수를 입력 : 1000
    2 - 100사이의 정수를 입력 : 1
    2 - 100사이의 정수를 입력 : 36
    
    < 36의 약수 출력 >
    1  2  3  4  6  9  12  18  36
    약수의 개수 : 9개
    */

package kr.ac.kopo.day03;
import java.util.Scanner;
public class  ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("2 - 100사이의 정수를 입력 : ");
			num = sc.nextInt();
		}while(num>=100 || num<2);
		int count = 0;
		System.out.printf("< %d의 약수 출력 >\n",num);
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\n약수의 개수 : %d개",count);
	}

}