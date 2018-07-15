import java.util.Scanner;

public class countboardpathISS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = scn.nextInt();
		System.out.println(CBPIS(0, number));
	}

	public static int CBPIS(int curr, int last) {
		int[] strg = new int[6];
		strg[0] = 1;

		for (int i = last - 1; i >= 0; i--) {
			int sum = 0;
			for (int j = 0; j < strg.length; j++) {
				sum = sum + strg[j];

			}
			for (int j = 5; j > 0; j--) {
				strg[j] = strg[j - 1];

			}
			strg[0] = sum;

		}
		return strg[0];
	}
}