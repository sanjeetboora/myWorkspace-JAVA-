import java.util.Scanner;

public class InverseOfANum {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int num = scn.nextInt();
		
		System.out.println(inverse(num));
	}
	public static int inverse(int N) {
		int inv = 0, count = 1;
		while (N != 0) {
			int rem = N % 10;
			int a = (int) Math.pow(10, (rem - 1));
			int b = count * a;
			inv = inv + b;
			N = N / 10;
			count = count + 1;
			
		}
		return inv;
		
	}
}
