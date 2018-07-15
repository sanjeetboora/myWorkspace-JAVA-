package ALGORITHMS.IMPLEMENTATION;
import java.util.Scanner;
public class save_the_prisoner {
	  public static void main(String[] args) {
	        Scanner s= new Scanner(System.in);
	        int t=s.nextInt();
	       for(int i=0; i<t; i++){
	            int p = s.nextInt();
	            int m = s.nextInt();
	            int id = s.nextInt();
	            if((m+id-1)%p==0)
	            System.out.println(p);
	            else 
	            System.out.println((m+id-1)%p);
	        }

	    }
	    
	}
