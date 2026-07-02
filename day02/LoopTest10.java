package kr.ac.kopo.day02;

public class LoopTest10{

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int a = 4; a >= i; a--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			for(int a = 0; a <= i-1; a++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
 
}