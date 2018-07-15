package Class;

import java.util.Scanner;

public class removeconsecutiveduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(removeconsecutiveduplicates(str));
	}
	public static String removeconsecutiveduplicates(String str){
		for (int i = 0; i < str.length(); i++) {
			
			String a=str.charAt(i);
			boolean c = ifstringispalindrome.ifstringpalindrome(a);
			if(c){
				count=count+1;
			}
		}
}return count;
	}

}
