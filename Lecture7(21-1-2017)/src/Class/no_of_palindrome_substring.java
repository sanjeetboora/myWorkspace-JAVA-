package Class;

import java.util.Scanner;

public class no_of_palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(noofpalindromesubstring(str));
	}
	public static int noofpalindromesubstring(String str){
		int count=0;
	
		for (int j = 0; j < str.length(); j++){
			for (int i = j+1; i <= str.length(); i++) {
				
				String a=str.substring(j,i);
				boolean c = ifstringispalindrome.ifstringpalindrome(a);
				if(c){
					count=count+1;
				}
			}
	}return count;
	}

}
