
public class queue_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue st = new queue(5);
		try {
			st.enqueue(10);
			st.display();
			st.enqueue(20);
			st.display();
			st.enqueue(30);
			st.display();
			st.enqueue(40);
			st.display();
			st.enqueue(50);
			st.display();
			st.enqueue(60);
			st.display();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
