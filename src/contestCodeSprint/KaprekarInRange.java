
/*You are given the two positive integers p and q, 
 * where p is lower than q. Write a program to determine 
 * how many Kaprekar numbers are there in the range between 
 * p and q (both inclusive) and display them all.
 */

package contestCodeSprint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KaprekarInRange {
	public static void main(String[] args) throws IOException {

		//BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		//	BufferedReader q = new BufferedReader(new InputStreamReader(System.in));
		//	
		//		Scanner g = new Scanner(System.in); 
		//		int size = g.nextInt();
		//		
		//		System.out.println("Enter number p:");
		//		long n1 = Integer.parseInt(p.readLine()); //IOException
		//
		//		System.out.println("Enter number q:");
		//		long n2 = Integer.parseInt(q.readLine()); //IOException
		//		

		BufferedReader q = new BufferedReader(new InputStreamReader(System.in));


		int n1 = Integer.parseInt(q.readLine());
		int n2 = Integer.parseInt(q.readLine());


		int flag = 0;
		if((n1<0 || n1>100000) || (n2<0 || n2>100000)){
			System.out.println("Numbers should be greater than 0 and less than 100000");
			return;
		}

		for(long i=n1;i<=n2;i++){

			long sq = i*i;
			String s = Long.toString(sq); //INT to STRING

			if(sq<=9)
				s= "0"+s;                     //Adding a '0'  if square is a single digit

			int l = s.length();            //No of digits in square

			int mid = l/2;            // finding middle point

			String left  =  s.substring(0,mid);    //extracting left digits
			String right =  s.substring(mid);     //Extracting right digits

			int x  = Integer.parseInt(left);     //Convert String to Int x
			int y  = Integer.parseInt(right);    //Convert String to Int y		


			if(x+y == i){
				flag =1;
				System.out.print(i+" ");
			}
		}
		if (flag==0) //check if no kaprekar number exists within the range
			System.out.println("Invalid Range");


	}
}