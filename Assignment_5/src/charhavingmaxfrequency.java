import java.util.Scanner;

public class charhavingmaxfrequency {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		String s = scn.nextLine();
		maxfreq(s);
	}

	public static char maxfreq(String str) {
		char ch = 0;
		str.toCharArray();
		int length = str.length();
		System.out.println(str);
		for (int j = 0; j < length - 1; j++) {
			int count = 1;
			if (str.charAt(j) == str.charAt(j + 1)) {
				count++;
			}
			System.out.println(str.charAt(j) + " is " + count + " times ");
		}
		return ch;
	}
}
