/* Ques> https://www.hackerrank.com/challenges/utopian-tree
 * */

package Warmup;

import java.util.Scanner;

public class UtopianTree {

	   public static void main(String[] args) {

	        Scanner reader = new Scanner(System.in);
	        int T  =  reader.nextInt();
	        for(int i=0; i<T; i++){
	            int N = reader.nextInt();
	            System.out.println(height(N));
	        }
	    }

	    public static int height(int N){
	        int h = 1;
	        
	        if (N==0) return h;
	        
	        while(N>0){
	            if(N>0){
	                h = h*2;
	                N--;
	            }
	            if(N>0){
	                h++;
	                N--;
	            }
	        }
	        return h;
	        
	    }

	
	
}
