package Class;

import java.util.Scanner;

public class printallsubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		printsubstrings(str);
	}
	public static void printsubstrings(String str){
		System.out.println(str.substring(0,0));
		for (int j = 0; j < str.length(); j++){
		for (int i = j+1; i <= str.length(); i++) {
			
			System.out.println(str.substring(j,i));
			
		}
		}
	}

}
