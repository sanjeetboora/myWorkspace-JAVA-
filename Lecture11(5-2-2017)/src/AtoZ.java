import java.util.ArrayList;
import java.util.Scanner;

public class AtoZ {

	public static void main(String[] args) {
		// lexicoGreater("bacd", "", "bacd");
		// lexicoGreater("bacd", "", false);
		// lexico(0, 1000);
		int N = 4;
		// printNQueens(new boolean[N][N], 0, "");
		System.out.println(getNQueens(new boolean[N][N], 0));
	}

	public static void lexicoGreater(String quest, String ans, String os) {
		if (quest.length() == 0) {
			if (ans.compareTo(os) > 0) {
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < quest.length(); i++) {
			char ch = quest.charAt(i);
			String ros = quest.substring(0, i) + quest.substring(i + 1);
			lexicoGreater(ros, ans + ch, os);
		}
	}

	public static void lexicoGreater(String quest, String ans, boolean flag) {
		if (quest.length() == 0) {
			if (flag) {
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < quest.length(); i++) {
			char ch = quest.charAt(i);
			String ros = quest.substring(0, i) + quest.substring(i + 1);

			if (flag == false) {
				if (ch > quest.charAt(0)) {
					lexicoGreater(ros, ans + ch, true);
				} else if (ch == quest.charAt(0)) {
					lexicoGreater(ros, ans + ch, flag);
				} else {
					// no call required
				}
			} else {
				lexicoGreater(ros, ans + ch, true);
			}
		}

	}

	public static void lexico(int c, int n) {
		if (c > n) {
			return;
		}

		System.out.println(c);

		if (c == 0) {
			for (int i = 1; i <= 9; i++) {
				lexico(10 * c + i, n);
			}
		} else {
			for (int i = 0; i <= 9; i++) {
				lexico(10 * c + i, n);
			}
		}
	}

	public static boolean isBalanced(String exp, String brackets) {
		if (exp.length() == 0) {
			if (brackets.length() == 0) {
				return true;
			} else {
				return false;
			}
		}
		char ch = exp.charAt(0);
		String ros = exp.substring(1);
		if ("[{(".indexOf(ch) != -1) {
			return isBalanced(ros, brackets + ch);
		} else if ("]})".indexOf(ch) != -1) {
			if (brackets.length() == 0) {
				return false;
			}

			char lob = brackets.charAt(brackets.length() - 1);
			if (ch == ']' && lob != '[') {
				return false;
			} else if (ch == ')' && lob != '(') {
				return false;
			} else if (ch == '}' && lob != '{') {
				return false;
			} else {
				return isBalanced(ros, brackets.substring(0, brackets.length() - 1));
			}
		} else {
			return isBalanced(ros, brackets + "");
		}
	}
	public static void printNQueens(boolean[][] board, int row, String osf) {
		if (row == board.length) {
			System.out.println(osf + "END");
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1, osf + "[" + row + "-" + col + "], ");
				board[row][col] = false;
			}
		}
	}
	public static ArrayList<String> getNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("END\n");
			return baseResult;
		}
		ArrayList<String> myResult = new ArrayList<>();
		for (int col = 0; col < board.length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				ArrayList<String> recResult = getNQueens(board, row + 1);
				for (String recString : recResult) {
					myResult.add("[" + row + "-" + col + "], " + recString);
				}
				board[row][col] = false;
			}
		}
		return myResult;
	}
	public static boolean isItSafe(boolean[][] board, int row, int col) {
		// col danger
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}
		// diag 1
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		// diag 2
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}
		return true;
	}
}
