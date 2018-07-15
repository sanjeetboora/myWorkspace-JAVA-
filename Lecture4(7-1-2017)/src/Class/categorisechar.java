package Class;

import java.util.Scanner;

public class categorisechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter char ");
		StringBuilder sb=new StringBuilder();
		char ch = scn.next().charAt(0);
		categorisechar(ch);

	}
	public static void categorisechar(char ch) {
		if(ch>='a' && ch<='z'){
			System.out.println("L");
			
		}
		else if(ch>='A' && ch<='Z'){
			System.out.println("u");
		}
		
	   else {
		System.out.println("i");
	   }
}
	
}
