package codechef;

import java.util.*;

class ques_2 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int x1 = scn.nextInt();
		int y1 = scn.nextInt();
		int x2 = scn.nextInt();
		int y2 = scn.nextInt();
		int n = scn.nextInt();
		int total = scn.nextInt();
		distance(x1, x2, y1, y2, n, total);
	}

	public static void distance(int x1, int x2, int y1, int y2, int n, int total) {

	 float dist = (float) ((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		float disact = (float) (Math.pow(dist, 0.5));
		System.out.println(disact);
		System.out.println(disact*n);
		if (total < disact*n) {
			System.out.println("no");
		} else if (total > disact*n || total == disact*n) {
			System.out.println("yes");
		}

	}

}