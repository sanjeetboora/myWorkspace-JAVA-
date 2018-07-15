package sanketsingh;

public class abcd {
	public static void main(String[] args) {
		
		nokia("123","") ;
			}
			public static void nokia(String str, String osf) {
				if (str.length() == 0) {
					System.out.print(osf + ",");
					return;
				}
				char cc = str.charAt(0);
				String ros = str.substring(1);
				String code = getcodes(cc);
				for (int i = 0; i < code.length(); i++) {
					nokia(ros, osf + code.charAt(i));
				}
			}
			public static String getcodes(char ch) {
				String str = null;
				if (ch == '1') {
					str = "abc";
				} else if (ch == '2') {
					str = "def";
				} else if (ch == '3') {
					str = "ghi";
				} else if (ch == '4') {
					str = "jkl";
				} else if (ch == '5') {
					str = "mno";
				} else if (ch == '6') {
					str = "pqr";
				} else if (ch == '7') {
					str = "stu";
				} else if (ch == '8') {
					str = "vwx";

				} else if (ch == '9') {
					str = "yz";
				} else if (ch == '0') {
					str = "_/";

				}
				return str;
			}
}
