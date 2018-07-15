package ASSIGNMENT1;

import java.util.Scanner;

public class q2ReverseAnumber {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		reverseNum(num);
	}
	public static void reverseNum(int num) {
		int number = num,reverse=0,i=0;
		while(number!=0) {
			int rem = number%10;
			reverse=(reverse*10)+rem;
			number/=10;
			i++;
		}
		System.out.println(reverse);
	}

}
