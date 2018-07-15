import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter binary");
		int binary = scn.nextInt();
		System.out.println(bin2dec(binary));
	}
		
		public static int bin2dec(int bin){
			int dec=0;
			int twoPowers=1;
			while(bin!=0){
				int rem=bin%10;
				dec = dec+twoPowers*rem;
				twoPowers*=2;
				bin/=10;
			}
			return dec;
		}
		
			

	}


