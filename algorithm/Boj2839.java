package algorithm;

//Brute Force Algorithm

public class Boj2839{
	public static void main(String[] args) {
		int N =18;
		System.out.println(getMinBag_BF(N));
	}
	public static int getMinBag_BF(int N) {
		int min = N / 5 + N / 3 + 1;
		boolean isFind = false;
		for (int bag5=0; bag5 <= N/5; bag5++) {
			for(int bag3 = 0; bag3 <= N/3; bag3++) {
				int kgSum = 5*bag5 + 3*bag3;
				int numBag = bag5 + bag3;
				if (kgSum == N) {
					isFind = true;
					if (numBag < min) {
					min = numBag;
					}
				}
			}
		}
		if (isFind)
			return min;
		else
			return -1;
	}
	

//Greedy Algorithm
	
//	방법1
	public static int getMinBag_Greedy1 (int N) {
		int numBag = 0;
		while (true) {
			if (N%5 == 0) {
				numBag += N/5;
				break;
			}
			if (N<3) {
				numBag = -1;
				break;
			}
			N -= 3;
			numBag ++;
		}
		return numBag;
	}

	
//	방법2
	public static int getMinBag_Greedy2 (int N) {
		for (int bag5=N/5; bag5 >= 0; bag5--) {
			int restKg = N -5 * bag5;
			if (restKg % 3 == 0) {
				return bag5 + restKg / 3;
				}
			}
		return -1;
		}
	}