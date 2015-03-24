package Strings;

import java.util.Scanner;

public class GameOfThrone1 {
	public static void main(String[] args) {
      //  Scanner myScan = new Scanner(System.in);
       // String inn = myScan.nextLine();
        
        String in = "aaaazbbbb";
        String ans;
        
        if(in.length() == 1) ans="Yes";
        
        int[] letters = new int[26];
        for(int i=0;i<in.length();i++){

        	letters[in.charAt(i)-'a']++;  
        }
        int odd = 0;
        for(int l:letters){
        	if(l%2!=0)
        		odd++;
        }
        
        ans = (odd>1)?"No":"Yes";
        
        System.out.println(ans);
	} 
       

}
