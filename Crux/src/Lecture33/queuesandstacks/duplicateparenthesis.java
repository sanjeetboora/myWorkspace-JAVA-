package Lecture33.queuesandstacks;

public class duplicateparenthesis {

	public static void main(String[] args) throws Exception {

		System.out.println(duplicateparanthesis("((a + b) + ((c+d)))"));
	}

	public static boolean duplicateparanthesis(String s) throws Exception {

		dynamic_stack st = new dynamic_stack();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ')')
				st.push(s.charAt(i));

			else {

				if (st.top() != '(') {

					while (st.top() != '(')
						st.pop();
					st.pop();
				} else {
					return true;
				}
			}
		}

		return false;
	}

}
