package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;

public class angry_professor {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i = 0; i < n; i++) {
			int no_of_students = scn.nextInt();
			int threshold = scn.nextInt();
			int count = 0;
			for (int j = 0; j < no_of_students; j++) {
				int arrived = scn.nextInt();
				if (arrived <= 0) {
					count++;
				}
			}
			if (count >= threshold) {
				System.out.println("NO");
			} else if (count < threshold) {
				System.out.println("YES");
			}
		}
	}
}
