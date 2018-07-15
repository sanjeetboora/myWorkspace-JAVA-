import java.util.Scanner;

public class sqrtToGivenPrecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number ");
		int N = scn.nextInt();
		System.out.println("Enter precision ");
		int P = scn.nextInt();
		System.out.println(squareRoot(N,P));

	}
	 public static double squareRoot(int N, int P) {
	     double sqrt = 0;
	      
	        // Write your code here
	       
			double increment = 1;
			double d = 1.0;
			int i = 1;
			
			while(P != 0){
				increment = increment * 0.1;
				d *= 10;
				i *= 10;
				 
				P--;
			}
			
			while(sqrt * sqrt <= N){
				sqrt += increment;
			
			}
			
			sqrt = sqrt - increment;
	       
			return (Math.round(sqrt * i) / d);
			
	}

	}


