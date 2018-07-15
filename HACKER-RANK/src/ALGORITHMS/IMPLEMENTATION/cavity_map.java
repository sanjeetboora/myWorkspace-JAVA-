package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class cavity_map {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String []grid = new String[n];
		char [][]map = new char[n][n];
		for(int i=0;i<n;i++){
			grid[i] = sc.next();
			map[i]=grid[i].toCharArray();
		}
		for(int i=1;i<n-1;i++){
			for(int j=1;j<n-1;j++){
				if(map[i][j]>map[i-1][j]  && map[i][j]>map[i][j-1] && map[i][j]>map[i][j+1] && map[i][j]>map[i+1][j]){
					map[i][j] = 'X';
				}
			}
		}
		for(char c[]: map){
			String row = new String(c);
			System.out.println(row);
		}
	}
}

