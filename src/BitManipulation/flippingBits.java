package BitManipulation;

import java.util.Scanner;

public class flippingBits {

	public static void main(String[] args) {

		int a=2;
		int b = 3;
		System.out.println(a);
		
		a=a^b;
		System.out.println(a);
		
		
		//Scanner in = new Scanner(System.in);
		//int t = in.nextInt();
//		long[] results = new long[t];
//		
//		for(int i=0;i<t;i++){
//			long n = in.nextLong();
//			results[i] = flipBits(n);
//		}
//		
//		for(int i=0;i<t;i++){
//			System.out.println(results[i]);
//		}
	}
	
	public static long flipBits(long n){

		long mask = 0xffffffffl;
		long result = n ^ mask;
		return result;
	}
	
}
