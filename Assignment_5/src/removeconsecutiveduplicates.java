import java.util.Scanner;

public class removeconsecutiveduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(removeconsecutiveduplicates(str));
	}
	public static String removeconsecutiveduplicates(String str){
		for (int i = 0; i < str.length()-2; i++) {
			if(str.charAt(i+1)==str.charAt(i)) {
				str=str.substring(0, i)+str.substring(i+1);
			}
		}
		return str;
}
}