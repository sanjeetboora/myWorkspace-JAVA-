package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class grading_students {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		grades(N);
	}
	public static void grades(int n){
		
		for(int i=1;i<=n;i++){
			int a = scn.nextInt();
			int z=btade(a);
			System.out.println(z);
		}
	}
	public static int btade(int a){
		if(a<38){
			return a;
		}
		else if((a+1)%5==0){
			return a+1;
		}
		else if((a+2)%5==0){
			return a+2;
		}
		else{
			return a;
		}
		
	}

}
