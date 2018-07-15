
public class stack_client_functions{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack st = new stack(5);
		stack tt = new stack(5);
		try {
			st.push(10);
			st.display();
			st.push(80);
			st.display();
			st.push(30);
			st.display();
			st.push(40);
			st.display();

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			displayrevstack(st);
			st.display();
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			System.out.println(max_in_stack(st));
			st.display();
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			sort_stack(st, tt);
			st.display();
			tt.display();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void displayrevstack(stack st) throws Exception {
		if (st.size() == 0) {
			return;
		}
		int rv = st.pop();
		displayrevstack(st);
		st.push(rv);
		System.out.println(rv);

	}

	public static int max_in_stack(stack st) throws Exception {
		if (st.size() == 0) {
			return Integer.MIN_VALUE;
		}
		int rv = st.pop();
		int max = max_in_stack(st);
		st.push(rv);
		if (rv > max) {
			return rv;
		} else {
			return max;
		}

	}

	public static void sort_stack(stack st, stack tt) throws Exception {
		int count = 0;
		while (count != st.size()) {
			int max = Integer.MIN_VALUE;
			while (st.size() != count) {
				int temp = st.pop();
				if (temp > max) {
					max = temp;
				}
				tt.push(temp);
			}
			st.push(max);
			count++;
			while (!tt.isEmpty()) {
				int temp = tt.pop();
				if (temp != max) {
					st.push(temp);
				}
			}
		}
	}
	
}
