import java.util.Scanner;

public class no_of_chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(noofchars(str));
	}

	public static String noofchars(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length() - 1; i++) {
			char a = str.charAt(i);
			char b = str.charAt(i + 1);
			int c = b - a;
			sb.append(a);
			sb.append(c);
		}
		return sb.toString();
	}
}


//for (int i = ab - 1; i >= 0; i--) {
//	if(a<=0||b<=0){
//		arr1[a-1]=0;
//		arr2[b-1]=0;
//	}
//	int sum = arr1[a-1] + arr2[b-1] + carry;
//	rv[i] = sum % 10;
//	carry = sum / 10;
//	a--;
//	b--;