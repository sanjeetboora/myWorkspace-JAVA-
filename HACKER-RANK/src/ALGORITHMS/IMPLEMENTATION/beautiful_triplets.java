package ALGORITHMS.IMPLEMENTATION;

import java.util.ArrayList;
import java.util.Scanner;

public class beautiful_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int diff= scn.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int count=0;
		
		for (int i = 0; i < size; i++) {
			 int num= scn.nextInt();
			 arr.add(num);
		}
		for(int j=0;j<size;j++){
			
				int a=arr.get(j)-diff;
				int b=arr.get(j)-(2*diff);
				if(arr.contains(a)&&arr.contains(b)){
					count++;
				}
			
		}System.out.println(count);
	}

}
