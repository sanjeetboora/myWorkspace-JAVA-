import java.util.Scanner;

public class PrintFibonacciNosLessThanN {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N=scn.nextInt();
		int a=0;
		int b=1;
		int i=1;
		int c=0;
		while(a<=N){
			System.out.println(i + "th Fibonacci no. is " + a );
			c=a+b;
			a=b;
			b=c;
			
			i=i+1;
			
		}
		
			

	}
}
