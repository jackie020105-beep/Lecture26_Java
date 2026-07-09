/*
5. 2-100사이의 소수를 출력하는 코드를 작성하시오.   
    
    2   3   5   7   11
    13  17  19  23  29
    ...
    97
    */

package kr.ac.kopo.day03;
import java.util.Scanner;
public class  ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i = 2; i<=100; i++) {
			boolean prime = true;
			for(int j = 2; j<i; j++) {
				if(i%j==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print(i + "\t");
				count++;
			}
			if(count==5) {
				System.out.println();
				count=0;
			}
			
		}
	}

}
