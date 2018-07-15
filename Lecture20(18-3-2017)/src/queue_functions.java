//sort_queue_using_stack
//queue_queue_using_queue
//sort_stack_using_queue
public class queue_functions {
	public static void sort_queue_using_stack(stack st, stack tt) throws Exception {
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