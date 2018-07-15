import java.util.Scanner;

public class ReverseOfN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number ");
		int N = scn.nextInt();
		int rem = 0;
		int rev =0;
		int Num = N;
		while(N!=0){
			rem = N % 10;
			rev = rev*10 + rem;
			N = N/10;
			
		}System.out.println("Reverse of " + Num + "is " + rev);
		
		

	}

}
