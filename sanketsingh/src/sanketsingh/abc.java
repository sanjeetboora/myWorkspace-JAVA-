package sanketsingh;

import java.util.Scanner;

public class abc {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        int sum1=0,sum2=0;
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	                if(a_j==a_i||a_j+a_i==n-1){
	                	 if(a_j==a_i){
	 	                    sum1+= a[a_i][a_j];
	 	                }
	 	                 if(a_j+a_i==n-1){
	 	                    sum2+= a[a_i][a_j];
	 	                }
	                }
	               
	            }
	        }
	        int diff=Math.abs(sum2-sum1);
	        System.out.println(diff);
	    }
}
