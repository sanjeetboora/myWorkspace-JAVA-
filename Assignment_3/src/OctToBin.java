import java.util.Scanner;

public class OctToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter octal");
		int octal = scn.nextInt();
		
		System.out.println(oct2bin(octal));
	}

	public static int oct2bin(int oct) {
		int dec = 0, eightPowers = 1;
		while (oct != 0) {
			int rem = oct % 10;
			dec = dec + eightPowers * rem;
			eightPowers *= 8;
			oct /= 10;
		}
		int bin = 0, tenPowers = 1;
		while (dec != 0) {
			int rem = dec % 2;
			bin = bin + tenPowers * rem;
			tenPowers *= 10;
			dec /= 2;
		}
		return bin;
	}

}
