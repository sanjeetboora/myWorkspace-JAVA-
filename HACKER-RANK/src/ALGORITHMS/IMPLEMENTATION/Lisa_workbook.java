package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class Lisa_workbook {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int k = s.nextInt();
	        int chap[] = new int[n];
	        boolean isTurn = false;
	        for(int i=0;i<chap.length;i++)
	            chap[i]=s.nextInt(); 
	        
	        int page = 1,count=0;
	        for(int i=1;i<=n;i++){                        
	            for(int j=1;j<=chap[i-1];j++){                
	                if(page == j)              
	                    count++;                
	                
	                if(j%k == 0){
	                    page++;
	                    isTurn = true;
	                }
	                else
	                    isTurn = false;                
	            }
	            if(isTurn == false)
	                page++;            
	        }
	        System.out.println(count);
	    }
	}