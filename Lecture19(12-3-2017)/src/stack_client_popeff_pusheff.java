
public class stack_client_popeff_pusheff {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack_using_Q_pop_eff st = new stack_using_Q_pop_eff(5);
		stack_using_Q_push_eff tt = new stack_using_Q_push_eff(5);
		try {
			st.push(10);
			System.out.println(st);
			st.push(80);
			System.out.println(st);
			st.push(30);
			System.out.println(st);
			st.push(40);
			System.out.println(st);
			st.pop();
			System.out.println(st);

			tt.push(101);
			System.out.println(tt);
			tt.push(8034);
			System.out.println(tt);
			tt.push(303);
			System.out.println(tt);
			tt.push(404);
			System.out.println(tt);
			tt.push(784);
			System.out.println(tt);
			tt.pop();
			System.out.println(tt);
			tt.pop();
			System.out.println(tt);
			tt.push(58794);
			System.out.println(tt);

			tt.pop();
			System.out.println(tt);

			tt.pop();
			System.out.println(tt);
			tt.push(404);
			System.out.println(tt);
			tt.pop();
			System.out.println(tt);
		} 
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
