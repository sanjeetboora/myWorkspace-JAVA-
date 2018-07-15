import java.util.Scanner;

public class no_of_palindrome_substrings {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enterr string");
		String s= scn.nextLine();
		System.out.println(countpalindrome(s));
	}
	public static int countpalindrome(String str) {
		int counter = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (ispalindrome(str.substring(i, j))) {
					counter++;
				}
			}
		}
		return counter;
	}
	public static boolean ispalindrome(String b){
		int len=b.length();
		boolean z=true;
		for(int i=0;i<len/2;i++){
		if(b.charAt(i)==b.charAt(len-1-i)){
			z=false;
			return z;
		}
		}
		return z;
	}
}
