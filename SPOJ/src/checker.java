import java.util.Scanner;

public class checker {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String b = scn.nextLine();
		if (b.length() == 0) {
			System.out.println("Invalid");
			return;
		}
		char a = b.charAt(0);
		if (a >= 'A' && a <= 'Z')
			System.out.println("UPPERCASE");

		else if (a >= 'a' && a <= 'z')
			System.out.println("lowercase");

		else
			System.out.println("Invalid");
	}
}