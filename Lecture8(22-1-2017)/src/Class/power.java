package Class;

import java.util.Scanner;

public class power {

		public static Scanner scn=new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number=scn.nextInt();
			int pow=scn.nextInt();
			System.out.println(powerofN(number,pow));
		}
		public static int powerofN(int num,int pow){
			if(pow==0){
				return 1;
			}
			int xpnm1=powerofN(num,pow-1);
			int xpn=num*xpnm1;
			return xpn;
		}
	}
