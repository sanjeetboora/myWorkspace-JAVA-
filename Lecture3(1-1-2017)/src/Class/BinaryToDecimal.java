package Class;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter binary");
		int bin = scn.nextInt();
		int dec=0;
		int twoPowers=1;
		while(bin!=0){
			int rem=bin%10;
			dec = dec+twoPowers*rem;
			twoPowers*=2;
			bin/=10;
		}
		System.out.println(dec);

	}

}
