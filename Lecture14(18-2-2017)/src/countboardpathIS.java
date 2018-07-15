import java.util.Scanner;

public class countboardpathIS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = scn.nextInt();
		System.out.println(CBPIS(0, number));
	}

	public static int CBPIS(int curr, int last) {
		int[] strg = new int[last + 1];
		strg[last] = 1;
	
		for (int i = last - 1; i >= 0; i--) {

			for (int dice = 1; dice <= 6 && (i + dice <= last); dice++) {
				strg[i] = strg[i] + strg[i + dice];
			}

		}
		return strg[0];
	}
}