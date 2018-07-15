package Class;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter decimal");
		int dec = scn.nextInt(),bin=0,tenPowers=1;
		while(dec!=0){
			int rem=dec%2;
			bin = bin+tenPowers*rem;
			tenPowers*=10;
			dec/=2;
	}System.out.println(bin);

	}

}
