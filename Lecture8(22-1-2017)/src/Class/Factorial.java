package Class;

import java.util.Scanner;

public class Factorial {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		System.out.println(factorialofN(number));
	}
	public static int factorialofN(int num){
		if(num==0){
			return 1;
		}
		int fnm1=factorialofN(num-1);
		int fn=num*fnm1;
		return fn;
	}
}


