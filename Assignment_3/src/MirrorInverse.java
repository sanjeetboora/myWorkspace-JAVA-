import java.util.Scanner;

public class MirrorInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int num = scn.nextInt();

		System.out.println(mirrorinverse(num));
	}

	public static String mirrorinverse(int n) {
		int inv = 0, count = 1, N = n;
		String val = "a";

		while (N != 0) {
			int rem = N % 10;
			int a = (int) Math.pow(10, (rem - 1));
			int b = count * a;
			inv = inv + b;
			N = N / 10;
			count = count + 1;
		}
		if (inv == n) {
			val = "true";
		} else if (inv != N) {
			val = "false";
		}
		
		return val;
	}

}
