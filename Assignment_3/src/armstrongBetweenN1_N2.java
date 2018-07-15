import java.util.Scanner;

public class armstrongBetweenN1_N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter 1st number ");
			int N1 = scn.nextInt();
			System.out.println("Enter 2nd number ");
			int N2 = scn.nextInt();
			printarmstrong(N1,N2);

	}
		public static void printarmstrong(int num1,int num2) {
			int i=num1;
			while(i<=num2){
				int a=i,rem=0,arm=0;
				while(a!=0){
					rem=a%10;
					arm=arm+(int)Math.pow(rem,3);
					a=a/10;
			}
				if(arm==i){
					System.out.println(i);
				}
				
				i=i+1;
			}

	}

}
