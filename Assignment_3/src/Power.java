import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number ");
		int N = scn.nextInt();
		System.out.println("Enter power ");
		int pwr = scn.nextInt();
		
		System.out.println(power(N,pwr));

	}
	public static int power(int num, int power) {
		int i = 1, pow = 1;
		while (i <= power) {
			pow = pow * num;
			i = i + 1;
		}
		return pow;
	}

}
