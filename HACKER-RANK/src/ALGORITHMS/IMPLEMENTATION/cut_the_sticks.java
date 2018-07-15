package ALGORITHMS.IMPLEMENTATION;

import java.util.Arrays;
import java.util.Scanner;

public class cut_the_sticks {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[]arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]= s.nextInt();
		}
		Arrays.sort(arr);
		int max=0;
		for(int j=0;j<num;j++){
			if(arr[j]>max){
				max=arr[j];
				System.out.println(num-j);
			}
		}
	}

}
