import java.util.Scanner;

public class ifstringispalindrome {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enterr string");
		String s= scn.nextLine();
		System.out.println(ifstringpalindrome(s));
	}
	public static boolean ifstringpalindrome(String s){
		int length=s.length();
		boolean val=true;
		for(int i=0;i<length/2;i++){
			if(s.charAt(i)!=s.charAt((length-1)-i)){
				val=false;
				return val;
			}
		}
		return val;
	}

}
