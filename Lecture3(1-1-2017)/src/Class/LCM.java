package Class;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number ");
		int first = scn.nextInt();
		System.out.println("Enter second number");
		int second = scn.nextInt();
		int div=second;
		int dend=first;
		int rem=0;
		if (first>=second){
			div=second;
			dend=first;
			}
		else{
			int a=0;
			a = first;
			first = second;
			second = a;
		}
		while(div!=0){
			rem = dend % div;
			dend = div;
			div = rem;
		}System.out.println("gcd of " + first+" & "+second+" is "+dend);
		int lcm=1;
		lcm= (first*second)/dend;
		System.out.println("lcm of " + first+" & "+second+" is "+lcm);
			
	}

}
