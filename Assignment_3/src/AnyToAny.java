import java.util.Scanner;

public class AnyToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter source base ");
		int srcbase = scn.nextInt();

		System.out.println("Enter destination base ");
		int destbase = scn.nextInt();

		System.out.println("Enter source number ");
		int srcnum = scn.nextInt();

		System.out.println(any2any(srcbase,destbase,srcnum));
	}
	
	public static int any2any(int sb,int db, int sn) {
		int df = 0;
		int twoPowers = 1;
		while (sn != 0) {
			int rem = sn % 10;
			df = df + twoPowers * rem;
			twoPowers *= sb;
			sn /= 10;
		}
		
		int tenPowers = 1;
		int dn = 0;
		while (df != 0) {
			int rem = df % db;
			dn = dn + tenPowers * rem;
			tenPowers *= 10;
			df /= db;
		}
		return dn;
		
	}

}
