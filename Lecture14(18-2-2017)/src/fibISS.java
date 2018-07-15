import java.util.Scanner;

public class fibISS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		System.out.println(fibofN(number));
	}

	public static int fibofN(int num) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 1; i <= num; i++) {
			int temp = strg[0] + strg[1];
			strg[0]=strg[1];
			strg[1]=temp;
		}
		return strg[0];
	}
}
