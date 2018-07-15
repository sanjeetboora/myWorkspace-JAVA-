package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class apple_and_orange {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Spoint = scn.nextInt();
		int Ppoint = scn.nextInt();
		int Apoint = scn.nextInt();
		int Bpoint = scn.nextInt();
		int Mno = scn.nextInt();
		int Nno = scn.nextInt();
		answer_de(Spoint, Ppoint, Apoint, Bpoint, Mno, Nno);
	}

	public static void answer_de(int Spoint, int Ppoint, int Apoint, int Bpoint, int Mno, int Nno) {

		int count = 0;
		for (int i = 1; i <= Mno; i++) {
			int apple = scn.nextInt();
			if (Apoint + apple >= Spoint && Apoint + apple <= Ppoint) {
				count++;
			}
		}
		System.out.println(count);
		int counter = 0;
		for (int j = 1; j <= Nno; j++) {
			int orange = scn.nextInt();
			if (Bpoint + orange <= Ppoint && Bpoint + orange >= Spoint) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
