import java.util.Scanner;

public class diff_between_chars_ascii_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(charsdifference(str));
	}
	public static String charsdifference(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length()-1; i++){
			char ch = str.charAt(i);
			char dh = str.charAt(i+1);
			int diff=dh-ch;
			sb.append(ch);
			sb.append(diff);
		}	sb.append(str.charAt(str.length()-1));	
	return sb.toString();
	}

}
