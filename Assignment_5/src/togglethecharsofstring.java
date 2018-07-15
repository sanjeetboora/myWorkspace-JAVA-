import java.util.Scanner;

public class togglethecharsofstring {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = scn.nextLine();
	System.out.println(toggling(str));
	}
	public static String toggling(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i); 
			if(ch>='A'&& ch<='Z'){
				char convert=(char)(ch-'A'+'a');
				sb.append(convert);
			}
			else if(ch>='a'&& ch<='z'){
				char convert = (char)(ch-'a'+'A');
				sb.append(convert);
			}
			else{
				sb.append(ch);
			}
			}
		return sb.toString();
		}
}
