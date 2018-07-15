
public class stack_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st = new DynamicStack(5);
		try {
			st.push(10);
			st.display();
			st.push(20);
			st.display();
			st.push(30);
			st.display();
			st.push(40);
			st.display();
			st.push(50);
			st.display();
			st.push(60);
			st.display();
			st.push(70);
			st.display();
			st.pop();
			st.display();
			st.pop();
			st.display();
			st.push(90);
			st.display();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
