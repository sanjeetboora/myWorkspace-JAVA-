import java.util.Scanner;

public class febIS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		System.out.println(fibofN(number));
	}

	public static int fibofN(int num) {
		int[] strg = new int[num + 1];
		strg[0] = 0;
		strg[1] = 1;
	
		for (int i = 2; i <= num; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[num];
	}
}
