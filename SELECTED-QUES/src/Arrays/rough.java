package Arrays;

import java.util.Scanner;

public class rough {
	public static int count = 0;
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		System.out.println(arrangements(n));

	}

	public static int cnt = 0;

	static int arrangements(int n) {
		boolean[] v = new boolean[n + 1];
		cal(n, 1, v);
		return cnt;
	}

	public static void cal(int N, int p, boolean[] v) {
		if (p > N)
			cnt++;
		for (int i = 1; i <= N; i++) {
			if (!v[i] && (p % i == 0 || i % p == 0)) {
				v[i] = true;
				cal(N, p + 1, v);
				v[i] = false;
			}
		}
	}
}