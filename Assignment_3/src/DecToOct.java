import java.util.Scanner;

public class DecToOct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter decimal");
		int decimal = scn.nextInt();
		System.out.println(dec2oct(decimal));

	}

	public static int dec2oct(int dec) {
		int oct = 0, tenPowers = 1;
		while (dec != 0) {
			int rem = dec % 8;
			oct = oct + tenPowers * rem;
			tenPowers *= 10;
			dec /= 8;
		}
		return oct;
	}

}
