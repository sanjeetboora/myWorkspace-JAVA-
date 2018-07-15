package ARRAYS;

import java.util.HashMap;
import java.util.Scanner;

public class Algorithmic_crush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Long> arr = new HashMap<>();
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Long M = scn.nextLong();
		Long max = 0L, num = 0L;
		for (Long j = (long) 0; j < M; j++) {

			int a = scn.nextInt();
			int b = scn.nextInt();
			Long k = scn.nextLong();
			for (int i = a; i <= b; i++) {
				if (arr.containsKey(i)) {
					Long val = arr.get(i);
					arr.put(i, val + k);
					if (num < val + k) {
						num = val + k;
					}
				} else {
					arr.put(i, k);
				}
			}
		
		}
		System.out.println(num);
	}

}
