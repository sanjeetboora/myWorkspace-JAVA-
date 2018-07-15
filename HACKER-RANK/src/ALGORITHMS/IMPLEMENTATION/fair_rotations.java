package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class fair_rotations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int B[] = new int[N];
		for (int B_i = 0; B_i < N; B_i++) {
			B[B_i] = in.nextInt();
		}
		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			while (B[i] % 2 != 0) {
				B[i]++;
				B[i + 1]++;
				count += 2;
			}
		}
		if (B[N - 1] % 2 != 0)
			System.out.println("NO");
		else
			System.out.println(count);
	}

}
