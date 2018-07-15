import java.util.Scanner;

public class lexicoofnumbers {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int start = scn.nextInt();
		int last = scn.nextInt();
		lexiconumbers(start, last);
	}

	public static void lexiconumbers(int c, int n) {
		if (c > n) {
			return;
		}
		
		System.out.println(c);
		if(c==0){
			for (int i = 1; i <= 9; i++) {
				int b = 10 * c + i;
				lexiconumbers(b, n);
			}
		}
		if(c!=0){
			for (int i = 0; i <= 9; i++) {
				int b = 10 * c + i;
				lexiconumbers(b, n);
			}
		}
	}
}