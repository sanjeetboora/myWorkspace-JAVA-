package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveDigitSum {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		BigInteger n=new BigInteger(scn.next());
		int k=scn.nextInt();
		StringBuilder s=new StringBuilder();
		while(k>0){
			s.append(n);
			k--;
		}
		String m=s.toString();
		System.out.println(superdigit(m, 0));
		
	}
	
	public static int superdigit(String str,int k){
		if(str.length()==0){
			return k;
		}
		int ch=str.charAt(0)-'0';
		String sub=str.substring(1);
		int count=0;
		count=superdigit(sub, k+ch);
		if(Integer.toString(count).length()==1){
			return count;
		}
		count=superdigit(Integer.toString(count), 0);
		return count;
		
	}

}

