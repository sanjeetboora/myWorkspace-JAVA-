package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class repeated_string {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        char[] s = in.next().toCharArray();
	        long count=0;
	        for(char c: s)
	            {
	            if(c=='a')
	                count++;
	        }
	        long n = in.nextLong();
	        long n2=n/s.length;
	        count*=n2;
	        for(int i=0;i<(n%s.length);i++)
	            {
	            if(s[i]=='a')
	                count++;
	        }
	        System.out.println(count);
	    }
	}