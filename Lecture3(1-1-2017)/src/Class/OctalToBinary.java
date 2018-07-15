package Class;

import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scn=new Scanner(System.in);
				System.out.println("enter octal");
				int oct = scn.nextInt(),dec=0,eightPowers=1;
				while(oct!=0){
					int rem=oct%10;
					dec = dec+eightPowers*rem;
					eightPowers*=8;
					oct/=10;
				}
				////////
				int bin=0,tenPowers=1;
				while(dec!=0){
					int rem=dec%2;
					bin = bin+tenPowers*rem;
					tenPowers*=10;
					dec/=2;
				}
				System.out.println(bin);


	}

}
