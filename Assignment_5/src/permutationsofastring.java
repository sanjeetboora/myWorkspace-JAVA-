import java.util.Scanner;

public class permutationsofastring {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enterr string");
		String s = scn.nextLine();
		permutation(s);

	}

	public static void permutation(String str) {
		// import java.util.*;
		// ArrayList<Integer>al=new ArrayList<>;
		// al.
		for (int j = 0; j < str.length(); j++) {
			for (int i = j + 1; i <= str.length(); i++) {

				String a = str.substring(j, i);
				StringBuilder sb = new StringBuilder(a);
				System.out.println(sb);
			}
		}
	}

}
