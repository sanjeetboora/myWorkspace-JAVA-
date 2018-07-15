
public class lcsIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aabc";
		String s2="adac";
		System.out.println(LCS(s1,s2));
	}
	public static int LCS(String s1, String s2) {
		int[][] storage = new int[s1.length()+1][s2.length()+1];

		storage[s1.length()][s1.length()] = 0;
//		int rv=0;
		for (int row =s1.length() ; row >= 0; row--) {
			for (int col =s2.length(); col >= 0; col--) {
				if (row ==s1.length() || col == s2.length()) {
					storage[row][col] = 0;
					
				} else {
					
					if (ch1 == ch2) {
						rv = 1 + LCS(ros1, ros2, storage);
					} 
				}
//				char ch1 = s1.charAt(col);
//				String ros1 = s1.substring(1);
//				char ch2 = s2.charAt(col);
//				String ros2 = s2.substring(1);
//				if (ch1 == ch2) {
//					rv = 1 + LCS(ros1, ros2);
//				} else {
//					int f2 = LCS(ros1, ros2);
//					int f3 = LCS(ros1, ros2);
//					rv = Math.max(f2, f3);
//				}
//			}
//		}
//
//		return storage[0][0];
//	}
	
		
//		for (int row = endRow; row >= 0; row--) {
//			for (int col = endCol; col >= 0; col--) {
				if (row == endRow || col == endCol) {
					storage[row][col] = 1;
					
				} else {
					storage[row][col] = storage[row + 1][col] + storage[row][col + 1]+storage[row+1][col + 1];
				}
			}
		}

		return storage[0][0];
	}
}


