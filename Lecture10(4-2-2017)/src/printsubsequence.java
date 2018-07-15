import java.util.Scanner;

public class printsubsequence {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
		subsequence(data,"");
	}

		public static void subsequence(String quest, String ans) {
			if (quest.length() == 0) {
				System.out.println(ans);
				return;
			}
			char ch = quest.charAt(0);
			String ros = quest.substring(1);
			subsequence(ros, ans + "");
			subsequence(ros, ans + ch);
		
			
	}

}

