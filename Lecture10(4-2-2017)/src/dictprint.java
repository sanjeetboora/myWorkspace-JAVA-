import java.util.Scanner;

public class dictprint {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
//		lexicogreater(data, "",false);
		lexicosmaller(data, "",false);
	}

	public static void lexicogreater(String quest, String ans,boolean flag) {
		if (quest.length() == 0) {
			if(flag){
				System.out.println(ans);
			}
			return;
		}
			
		for (int i = 0; i < quest.length(); i++) {
			char ch = quest.charAt(i);
			String ros = quest.substring(0, i) + quest.substring(i + 1);
			if (flag== false) {
				if(ch>quest.charAt(0)){
					lexicogreater(ros, ans+ch,true);
				}
				else if(ch==quest.charAt(0)){
					lexicogreater(ros, ans+ch,flag);
				}
				else {
				}
			}
			else{
				lexicogreater(ros, ans+ch,true);
			}
		}
	}
	public static void lexicosmaller(String quest, String ans,boolean flag) {
		if (quest.length() == 0) {
			if(flag){
				System.out.println(ans);
			}
			return;
		}
			
		for (int i = 0; i < quest.length(); i++) {
			char ch = quest.charAt(i);
			String ros = quest.substring(0, i) + quest.substring(i + 1);
			if (flag== false) {
				if(ch<quest.charAt(0)){
					lexicosmaller(ros, ans+ch,true);
				}
				else if(ch==quest.charAt(0)){
					lexicosmaller(ros, ans+ch,flag);
				}
				else {
				}
			}
			else{
				lexicosmaller(ros, ans+ch,true);
			}
		}
	}
}
