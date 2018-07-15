package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class climbing_the_leaderboard {
	
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		arr[0] = scn.nextInt();
		int i=1,q=1;
		while(i<n && q<n){
			int data=scn.nextInt();
			if(data!=arr[i-1]){
				arr[i]=data;
			} else{
				q++;
				continue;
			}
			q++;
			i++;
		}
		int k = scn.nextInt();
		int c=arr.length-1;
		for (int m = 0; m < k; m++) {
			int a = scn.nextInt();
			for (int j = c; j >= 0; j--) {
				if(a>=arr[j]){
					arr[j]=a;	
					c=j;
				} else{
					break;
				}
			}
			System.out.println(c+1);
		}
	}
}

//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] scores = new int[n];
//		ArrayList<Integer> unique = new ArrayList<Integer>();
//
//		for (int i = 0; i < n; i++) {
//			scores[i] = in.nextInt();
//			if (i == 0) {
//				unique.add(scores[0]);
//			}
//			if (!unique.contains(scores[i])) {
//				unique.add(scores[i]);
//			}
//		}
//		// Collections.sort(unique, Collections.reverseOrder());
//		int m = in.nextInt();
//		int rank = 0;
//		int[] alice = new int[m];
//		for (int j = 0; j < m; j++) {
//			alice[j] = in.nextInt();
//			for (int k = 0; k < unique.size(); k++) {
//				if (alice[j] < unique.get(k)) {
//					rank = k + 2;
//				}
//				if (alice[j] == unique.get(k)) {
//					rank = k + 1;
//				}
//				if (alice[j] >= unique.get(0)) {
//					rank = 1;
//				}
//
//			}
//			System.out.println(rank);
//		}
//
//	}
//
//}
