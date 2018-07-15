package codechef;
import java.util.Arrays;
import java.util.Scanner;


public class hwshd {
	

		public static void main(String[] args) throws Exception {

			Scanner scn = new Scanner(System.in);
			String str = scn.next();
			int[] arr = new int[26];
			boolean bool = false;
			int[] check= new int[2];
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - 'a']++;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					check[0]++;
				} else {
					check[1]++;
				}
			}
			if (check[1]<=1)
				System.out.println("yes");
			else 
				System.out.println("no");
			System.exit(0);
		}

	
}
