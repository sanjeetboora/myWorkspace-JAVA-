package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class camel_case {

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        char str[]=s.toCharArray();
	        int count=1;
	        for(int i=0;i<str.length;i++){
	        	if(!(str[i]>='a' && str[i]<='z')){
	        		count++;
	        	}
	        }
	        System.out.println(count);
	    }
}