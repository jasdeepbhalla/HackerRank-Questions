package Strings;

import java.util.Scanner;

public class MakeItAnagram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] c1 = sc.nextLine().toCharArray();
		char[] c2 = sc.nextLine().toCharArray();
		
		int diff[] =new int['z'-'a'+1];
		for(int i:c1)
			diff[i-'a']++;
		
		for(int j:c2)
			diff[j-'a']--;
		
		int sum=0;
		for(int dif:diff)
			sum+=(dif<0)?-dif:dif;
		
		System.out.println(sum);
		
	}
	
	

}
