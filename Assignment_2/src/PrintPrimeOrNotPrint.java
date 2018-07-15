import java.util.Scanner;

public class PrintPrimeOrNotPrint {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int i=2;
		int rem=0;
		while(i*i<=N){
			rem = N % i;
			if(rem==0){
				System.out.println("Not Prime");
				return;
				}
			i=i+1;
		}System.out.println("Prime");

	}

}
