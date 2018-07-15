import java.util.Scanner;

public class PrintAllPrimeNoFrom2toN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int c = 2, rem = 0;
		while (c <= N) {
			int i=2;
			while (i < c) {
				rem = c % i;
				if (rem == 0) {
					break;
				} 
				i = i + 1;
			}
			if(i==c){
				System.out.println(c);
			}
			c = c + 1;
		}

	}

}
