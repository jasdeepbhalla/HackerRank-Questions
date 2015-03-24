//Q> https://www.hackerrank.com/challenges/the-love-letter-mystery

package Warmup;

import java.util.Scanner;

public class LoveLetterMystery {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numTestCases = s.nextInt();
		
		for(int i=0;i< numTestCases;i++){
			String str = s.next();
			System.out.println(getNumRotations(str));
		}

		
	}

	public static int getNumRotations(String word) {
		
	 char[] chararr = word.toCharArray();
	 
	 int count = 0;
	 
	 int j = word.length()-1;
	 for(int i=0;i<word.length()/2;i++,j--){
		 
		 count = count + Math.abs(chararr[i]-chararr[j]);
		 
	 }
		
		
		return count;
	}
}
