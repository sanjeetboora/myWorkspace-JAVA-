import java.util.Scanner;

public class Prime_no_from_2ton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			int j;
			for (j = 2; j < i; j++) {
				int n = i % j;
				if (n == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i);
			}
		}
		System.out.println();
	}

}
