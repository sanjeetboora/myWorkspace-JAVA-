package sanketsingh;

import java.util.Scanner;

public class stringprimeascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(replacingchars(str));
	}
	public static String replacingchars(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(i%2==0){
				ch=(char)(ch-1);
			}
			else if(i%2!=0){
				ch=(char)(ch+1);
			}
			if(ch>='A'&& ch<='Z'){
				char convert=(char)(ch-'A'+'a');
				sb.append(convert);
			}
			else if(ch>='a'&& ch<='z'){
				char convert = (char)(ch-'a'+'A');
				sb.append(convert);
			}
			else{
				char bh=(char)(ch+1);
				sb.append(bh);
			}
			}
		return sb.toString();

	}
}
