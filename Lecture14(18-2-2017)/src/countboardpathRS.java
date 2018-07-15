import java.util.Scanner;

public class countboardpathRS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = scn.nextInt();
		System.out.println(CBPRS(0, number, new int[number + 1]));
	}

	public static int CBPRS(int curr, int last, int[] strg) {

		if (curr == last) {
			return 1;
		}
		if (curr > last) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int rv = 0;
		for (int dice = 1; dice <= 6; dice++) {
			rv += CBPRS(curr + dice, last, strg);

		}
		strg[curr] = rv;

		return rv;
	}
}