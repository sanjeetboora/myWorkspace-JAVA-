
import java.util.Scanner;

public class permutationduplicate {

		public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			String data = scn.nextLine();
			duplicatepermutation(data,"");
		}

			public static void duplicatepermutation(String quest, String ans) {
				if (quest.length() == 0) {
					System.out.println(ans);
					return;
				}
				boolean[] abc = new boolean[26];
				for (int i = 0; i < quest.length(); i++) {
					char ch = quest.charAt(i);
					if (abc[ch - 'a'] == false) {
						String ros = quest.substring(0, i) + quest.substring(i + 1);
						duplicatepermutation(ros, ans + ch);
						abc[ch - 'a'] = true;
					}

				}
		}

	}

