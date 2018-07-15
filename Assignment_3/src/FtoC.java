import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter min farenheit number ");
		int minf = scn.nextInt();
		System.out.println("Enter max farenheit number ");
		int maxf = scn.nextInt();
		System.out.println("Enter step ");
		int step = scn.nextInt();
		double farh = minf, cel = 0;
		while (farh <= maxf) {
			cel = (int) ((5.0 / 9) * (farh - 32));
			System.out.println(farh + "\t" + cel);
			farh = farh + step;
		}
		

}
}
