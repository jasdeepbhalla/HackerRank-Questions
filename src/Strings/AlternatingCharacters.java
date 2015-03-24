package Strings;

import java.util.Scanner;


public class AlternatingCharacters {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);

		//int testcases = sc.nextInt();
		String A ="AAABBB";
		for(int i=0;i<1;i++){

			char[] ch = A.toCharArray();
			int count=0;
			for(int j=0; j<ch.length-1;j++){
				if(ch[j]==ch[j+1])
					count++;
			}
			System.out.println(count);
		}
		//sc.close();
	}

}

