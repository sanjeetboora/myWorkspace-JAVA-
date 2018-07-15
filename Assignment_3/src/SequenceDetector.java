import java.util.Scanner;

public class SequenceDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter  number ");
		int num= scn.nextInt();
		System.out.println(sequencedetector(num));


	}
	public static boolean sequencedetector(int N) {
		boolean val=true;
		int i = 1, a = 0, prev, curr;
		Scanner scn = new Scanner(System.in);

		System.out.println("enter the no.s");
		prev = scn.nextInt();
	boolean flag = true;
		while (i < N) {
			curr = scn.nextInt();

			if (flag) {
				if (prev > curr) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				if (prev < curr) {
					flag = false;
				} else {
					val=false;
					return val;
				}
			}
			prev = curr;
			i = i + 1;
		}
		if (i == N) {
			val=true;
		}
		return val;
		

}
}
