package Class;

import java.util.Scanner;

public class AnyToAnyNumSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter source base ");
		int sb = scn.nextInt();

		System.out.println("Enter destination base ");
		int db = scn.nextInt();

		System.out.println("Enter source number ");
		int sn = scn.nextInt();

		int df = 0;
		int twoPowers = 1;
		while (sn != 0) {
			int rem = sn % 10;
			df = df + twoPowers * rem;
			twoPowers *= sb;
			sn /= 10;
		}
		System.out.println(df);
		int tenPowers = 1;
		int dn = 0;
		while (df != 0) {
			int rem = df % db;
			dn = dn + tenPowers * rem;
			tenPowers *= 10;
			df /= db;
		}
		System.out.println(dn);

	}

}
