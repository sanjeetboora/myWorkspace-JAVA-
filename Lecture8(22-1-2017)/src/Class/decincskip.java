package Class;

import java.util.Scanner;

public class decincskip {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		printDIskip(number);
	}public static void printDIskip(int num){
		if(num==0){
			return;
		}
		if(num%2!=0){
			System.out.println(num);
		}
		printDIskip(num-1);
		if(num%2==0){
			System.out.println(num);
		}
	}

}
