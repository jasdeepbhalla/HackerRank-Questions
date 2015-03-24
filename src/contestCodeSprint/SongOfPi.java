package contestCodeSprint;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SongOfPi {


	  public static void main(String[] args)throws IOException {
		     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String line = br.readLine();
		      int flag =0;
		        int N = Integer.parseInt(line);
		        String str;
		        String[] word = new String[100];
		      // String[] word = new word[200];
		        for (int i = 0; i < N; i++) {
		            str = br.readLine();
		            
		    		String InputWord = str.replaceAll("[-+.^:,']","");
					 word = InputWord.split(" ");
					 
					 String given = "Now, I wish I could recollect pi. " +
						"'Eureka,' cried the great inventor. " +
						"Christmas Pudding, Christmas Pie " +
						"Is the problem's very center. ";

						String a = given.replaceAll("[-+.^:,']","");
						String[] b = a.split(" ");
						for(int j=0;j<word.length;j++){
							
							if(b[j].length()!= word[j].length())
							{	flag =0	;
								break;
								
							}
							else{
								flag = 1;
						
							}
						}
						if(flag==1)
							System.out.println("It's a pi song.");
						else
			            	System.out.println("It's not a pi song.");
			        }
		        }
		        
//		        for ( int i = 0; i < word.length; i++) {
//					System.out.print(word[i].length());
//				
//		        }
		        
		//        System.out.println();
		       
//				 for ( int i = 0; i < b.length; i++) {
//		           
//					System.out.print(b[i].length());
//				
//		        }
				
				
		}