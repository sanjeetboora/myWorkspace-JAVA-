package ALGORITHMS.IMPLEMENTATION;

import java.util.ArrayList;
import java.util.Scanner;

public class Minimum_distances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < size; i++) {
			int num = scn.nextInt();
			arr.add(num);
		}
		for (int j = 0; j < size; j++) {
			int a = arr.get(j);
			arr.set(j, Integer.MIN_VALUE);
			boolean flag = arr.contains(a);
			if (flag) {
				int idx = arr.indexOf(a);
				int diff = idx - j;
				if (diff < min) {
					min = diff;
				}

			}

		}
		if(min==Integer.MAX_VALUE){
			min=-1;
			System.out.println(min);
		}
		else{
			
				System.out.println(min);
			}
		}
	}

