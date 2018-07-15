import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter number ");
			int N = scn.nextInt();
			System.out.println("Enter base ");
			int base = scn.nextInt();
			
			System.out.println(power(N,base));

		}
		public static int power(int num, int base) {
			int i = 0, log = 1;
			while (num!=1) {
				num = num / base;
				i = i + 1;
			}
			return i;
		
	}

}
