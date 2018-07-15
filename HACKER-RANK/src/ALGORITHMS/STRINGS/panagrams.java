package ALGORITHMS.STRINGS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class panagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		str=str.replaceAll(" ", "");
		
		char[] arr = str.toLowerCase().toCharArray();
		String str1=new String(arr);
		
		Set<Character> chars = new HashSet<>();
		for (Character ch : arr) {
			chars.add(ch);
		}
		
		if(chars.size()==26){
			System.out.println("pangram");
		}
		else{
			System.out.println("not pangram");
		}
	}

}
