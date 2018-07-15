import java.util.Scanner;

public class printpermutation {


	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
		printpermutations(data,"");
	}

		public static void printpermutations(String quest, String ans) {
			if (quest.length() == 0) {
				System.out.println(ans);
				return;
			}
			for (int i = 0; i < quest.length(); i++) {
				char ch = quest.charAt(i);
					String ros = quest.substring(0, i) + quest.substring(i + 1);
					printpermutations(ros, ans + ch);

			}
	}

}


