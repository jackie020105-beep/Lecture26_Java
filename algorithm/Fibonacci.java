package algorithm;
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		
		System.out.println("REcursive : " + fiboRecursive(num));
		
		int[] memo = new int[num+1];
		Arrays.fill(memo, -1);
		memo[0] = 0;
		if (num > 0) memo[1] = 1;
		
		System.out.println("Memoziation : " + fiboMemoziation(memo, num));
		
		System.out.println("Tabulation : " + fiboTabulation(num));
		
	}
	public static int fiboRecursive(int num) {
		//base condition
		//if (num == 0) return 0;
		//if (num == 1) return 1;
		if (num<= 1) return num;
		
		// divide & conqur
		return fiboRecursive(num-1) + fiboRecursive(num-2);
	}
	public static int fiboMemoziation(int[] memo, int num) {
		//미리 계산된 값이 없으면 계산하여 메모리에 저장
		if (memo[num]==-1) {
			memo[num] = fiboMemoziation(memo, num-1) + fiboMemoziation(memo, num-2);
		}
		// 메모리에 저장된 값을 반환
		return memo[num];
	}
	public static int fiboTabulation(int num) {
		int[] table = new int[num+1];
		Arrays.fill(table, 0);
		if (num>0) table[1] = 1;
		for (int i = 2; i<=num ; i++) {
			table[i] = table[i-1] + table[i-2];
		}
		return table[num];
	}
}
