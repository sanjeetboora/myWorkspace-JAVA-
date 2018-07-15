package Class;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter min farenheit number ");
		int minf = scn.nextInt();
		System.out.println("Enter max farenheit number ");
		int maxf = scn.nextInt();
		System.out.println("Enter step ");
		int step = scn.nextInt();
		System.out.println("farenheit     celsius");
		double farh = minf, cel = 0;
		while (farh <= maxf) {
			cel = (int) ((5.0 / 9) * (farh - 32));
			System.out.println(farh + "        " + cel);
			farh = farh + step;
		}
	}

}
