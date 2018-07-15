

import java.util.Scanner;

public class takeinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
	}

	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
		int[] rv = null;
		System.out.println("enter size of array");
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter " + i + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

}
