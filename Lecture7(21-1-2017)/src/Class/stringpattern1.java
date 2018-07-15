package Class;

import java.util.Scanner;

public class stringpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(strpattern(str));
	}
	public static String strpattern(String str){
		StringBuilder sb = new StringBuilder(str);
		int length=sb.length();
		for(int i=0;i<sb.length();i++){
			if(i%2==0){
				char a=sb.charAt(i);
				char b=(char)(a+1);
				sb.setCharAt(i,b);
			}
			else if(i%2 != 0){
				char a=sb.charAt(i);
				char b=(char)(a-1);
				sb.setCharAt(i,b);
			}
		}
		return sb.toString();
		
	}
}
