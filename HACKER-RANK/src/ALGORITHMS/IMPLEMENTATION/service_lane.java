package ALGORITHMS.IMPLEMENTATION;

import java.util.ArrayList;
import java.util.Scanner;

public class service_lane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int T = scn.nextInt();
		ArrayList<Integer> width = new ArrayList<>();
		

		for (int i = 0; i < N; i++) {
			int num = scn.nextInt();
			width.add(num);
		}
		for (int j = 0; j < T; j++) {
			int min = Integer.MAX_VALUE;
			int idx1 = scn.nextInt();
			int idx2 = scn.nextInt();
			for (int k = idx1; k <= idx2; k++) {
				if(min>width.get(k)){
					min=width.get(k);
				}
				
			}System.out.println(min);
		}
			
	}

}
