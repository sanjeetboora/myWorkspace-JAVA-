package Class;

public class countpalindromicsubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countpss("abaaba"));
	}

	public static int countpss(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; ((i - j) >= 0) && ((i + j) < str.length()); j++) {
				if (str.charAt(i - j) == str.charAt(i + j)) {
					count = count + 1;
				} else {
					break;
				}
			}
		}
		for (int i = 1; i < str.length(); i++) {
			for (int j = 1; ((i - j) >= 0) && ((i + j - 1) < str.length()); j++) {
				if (str.charAt(i - j) == str.charAt(i + j - 1)) {
					count = count + 1;
				} else {
					break;
				}
			}
		}
		return count;
	}
}
