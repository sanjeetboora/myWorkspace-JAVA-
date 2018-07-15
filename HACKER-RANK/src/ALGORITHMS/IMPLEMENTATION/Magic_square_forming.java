package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Magic_square_forming {
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][][] magic_mat={
			    {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
			    {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
			    {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
			    {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
			    {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}, 
			    {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
			    {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
			    {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},  
		};

			int[][] A=new int[3][3];
			for (int i = 0; i < 3; i++) {
			    for (int j = 0; j < 3; j++)
			        A[i][j]=scn.nextInt();
			}

			int min_cost = 81;
			for (int k = 0; k < 8; k++) {
			    int crt_cost = 0;
			    for (int i = 0; i < 3; i++) {
			        for (int j = 0; j < 3; j++)
			            crt_cost += Math.abs( A[i][j] - magic_mat[k][i][j] );
			    }
			    if (crt_cost < min_cost)
			        min_cost = crt_cost;
			}

			System.out.println(min_cost);
	}

}