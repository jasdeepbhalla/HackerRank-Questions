package contestCodeSprint;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Kaprekar {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		
		int n = Integer.parseInt(br.readLine()); //IOException
		
		int sq = n*n;
		String s = Integer.toString(sq); //INT to STRING

		if(sq<=9)
			s= "0"+s;                     //Adding a '0'  if square is a single digit
		
		int l = s.length();            //No of digits in square
		
		int mid = l/2;            // finding middle point
		
		String left  =  s.substring(0,mid);    //extracting left digits
		String right =  s.substring(mid);     //Extracting right digits
		
		int x  = Integer.parseInt(left);     //Convert String to Int x
		int y  = Integer.parseInt(right);    //Convert String to Int y		
		
		
		if(x+y ==n)
			System.out.println(n+" is a kaprekar Number");
		else
			System.out.println(n+" is not a kaprekar number");
		
	}
}
