package Class;

import java.util.Scanner;

public class printchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		printchars(str);
	}
	public static void printchars(String str){
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
