package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class GemStones {
	
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int N = 2; 
        		//reader.nextInt();
        
        int num = 0;   //counts number of gems
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        boolean[] flags = new boolean[26];
    
      // ----For loop for N no of strings -----    
        for(int i=0;i<N;i++){
        	// --- for loop for making flag values false for every alphabet => false 
        	for(int j=0;j<26;j++){
                flags[j] = false;
            }
            String s = reader.next();
            char[] s_in_letter = s.toCharArray();
           
     //--------For first string only ----------
            if(i==0){
                for(char c:s_in_letter){
                    if (!h.containsKey(c))
                        h.put(c,1);
                }
                continue;
            }
            
  //--------For second string and so on.. ----------
            for(char c:s_in_letter){
                int tmp = c - 'a';
                if (h.containsKey(c)&&flags[tmp]==false){
                    h.put(c,h.get(c)+1);
                    flags[tmp] = true; //flag of alphabet[tmp] is true to show hashmap have that letter before
                }
            }  
        }//end of for(N)
        
        
        System.out.println(h.keySet()+" = "+h.values());
        
        for(Character c:h.keySet()){
            if(h.get(c)==N)
            	num++;
        }
        
        //Print num
        System.out.println(num);
    }
}
