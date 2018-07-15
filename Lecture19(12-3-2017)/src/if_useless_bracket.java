import java.util.Scanner;

public class if_useless_bracket {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String data = scn.nextLine();
		stack st = new stack(data.length());
		System.out.println(ifexpressionbalanced(data, st));
	}
	// if useless bracket is there - return true
	// if useless bracket is not there return 

	public static boolean ifexpressionbalanced(String data, stack st) throws Exception {

		if (data.length() == 0) {
			if (st.isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
		char ch = data.charAt(0);
		String ros = data.substring(1);
		int count = 0;
		if (ch != ')') {
			st.push(ch);
			st.display();
			return ifexpressionbalanced(ros, st);
		} else if (ch == ')') {
			while (st.top() != '(') {
				st.pop();
				st.display();
				count++;
			}
			if (st.top() == '(' && count != 0) {
				st.pop();
				st.display();
				return ifexpressionbalanced(ros, st);
			}

			if (st.top() == '(' && count == 0) {
				return true;
			}

		}
		return ifexpressionbalanced(ros, st);
	}

}
