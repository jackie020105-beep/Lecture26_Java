package kr.ac.kopo.day01;

public class OperationMain01 {

	public static void main(String[] args) {
		
		int a = 12, b =5;
		System.out.println(a);
		System.out.printf("[%2d] + [%2d] = %d\n", a,b,a+b);
		System.out.printf("[%2d] / [%-2d] = %f\n", a,b,(double)(a/b));
		System.out.printf("%d / %d = %f\n", a,b,((double)a/b));
		System.out.printf("%d / %d = %.2f\n", a,b,((double)a/b));
	}

}
