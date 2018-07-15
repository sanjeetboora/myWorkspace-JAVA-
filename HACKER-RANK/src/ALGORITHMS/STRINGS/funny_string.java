package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class funny_string {

	public static void main(String[] args) {
	 
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        String s=sc.next();
	        String rev=new StringBuffer(s).reverse().toString();
	        char a[]=s.toCharArray();
	        char b[]=rev.toCharArray();
	        int len=a.length;
	        boolean flag=true;
	        for(int j=1;j<len;j++){
	            if(Math.abs(a[j]-a[j-1])!=Math.abs(b[j]-b[j-1])){
	                flag=false;
	                break;
	            }
	        }
	        if(flag==true){
	            System.out.println("Funny");
	        }
	        else{
	            System.out.println("Not Funny");
	        }
	    }
	}
}
