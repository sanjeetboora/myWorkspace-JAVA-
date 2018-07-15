
public class editdistanceIS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abdgf";
		String s2 = "acdsf";
		System.out.println(editdistance(s1, s2));

	}
	public static int editdistance(String s1, String s2) {
		int[][] arr = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length(); row >= 0; row--) {
			for (int j = s2.length(); j >= 0; j--) {
				if (row == s1.length()) {
					arr[row][j] = s2.length() - j;
					continue;
				}

				if (j == s2.length()) {
					arr[row][j] = s1.length() - row;
					continue;
				}

				if (s1.charAt(row) == s2.charAt(j)) {
					arr[row][j] = arr[row + 1][j + 1];
				} else {
					int replace = 1 + arr[row + 1][j + 1];
					int insert = 1 + arr[row + 1][j];
					int remove = 1 + arr[row][j + 1];

					arr[row][j] = Math.min(replace, Math.min(insert, remove));
				}
			}
		}

		return arr[0][0];
	}
}
