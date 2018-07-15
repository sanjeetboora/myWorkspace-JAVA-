import java.util.Scanner;

public class CategorizingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter char ");
		char ch = scn.next().charAt(0);
		System.out.println(categorisechar(ch));

	}
	public static String categorisechar(char ch) {
		String val="a";
		if(ch>='a' && ch<='z'){
			val="L";
			
		}
		else if(ch>='A' && ch<='Z'){
			val="U";
		}
		
	   else {
		val="I";
	   }
		return val;
	}

}
