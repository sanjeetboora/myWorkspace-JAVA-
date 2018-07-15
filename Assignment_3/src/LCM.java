import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println("Enter second number");
		int b = scn.nextInt();

		System.out.println(lcm(a, b));

	}

	public static int lcm(int first, int second) {
		int div = second, dend = first, rem = 0;
		if (first >= second) {
			div = second;
			dend = first;
		} else {
			int a = 0;
			a = first;
			first = second;
			second = a;
		}
		while (div != 0) {
			rem = dend % div;
			dend = div;
			div = rem;
		}
		int lcm = 1;
		lcm = (first * second) / dend;

		return lcm;

	}

}
