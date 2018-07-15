
public class longestcommonsubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabc";
		String s2 = "adac";
		System.out.println(LCS(s1, s2, new int[s1.length() + 1][s2.length() + 1]));

	}

	public static int LCS(String s1, String s2, int[][] storage) {
		int rv = 0;
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		if (storage[s1.length()][s2.length()] != 0) {
			return storage[s1.length()][s2.length()];
		}

		char ch1 = s1.charAt(0);
		String ros1 = s1.substring(1);
		char ch2 = s2.charAt(0);
		String ros2 = s2.substring(1);
		if (ch1 == ch2) {
			rv = 1 + LCS(ros1, ros2, storage);
		} else {
			int f2 = LCS(ros1, ros2, storage);
			int f3 = LCS(ros1, ros2, storage);
			rv = Math.max(f2, f3);
		}

		storage[s1.length()][s2.length()] = rv;
		return rv;
	}
}
