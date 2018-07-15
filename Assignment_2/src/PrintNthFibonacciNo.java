import java.util.Scanner;

public class PrintNthFibonacciNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no.");
		int N = scn.nextInt(); 
		int i=1;
		long c=0,a=0,b=1;
		while(i<N){
			c= a + b;
			a=b;
			b=c;
			i=i+1;
			
		}System.out.println(N + "th Fibonacci no. is " + c );
		
			

	}

}
