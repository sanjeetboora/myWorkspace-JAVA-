
public class queue_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue st = new DynamicQueue(10);
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
			st.enqueue(70);
			st.display();
			st.enqueue(80);
			st.display();
			st.enqueue(90);
			st.display();
			st.enqueue(100);
			st.display();
			st.dequeue();
			st.display();
			st.dequeue();
			st.display();
			st.dequeue();
			st.display();
			st.dequeue();
			st.display();
			st.dequeue();
			st.display();
			st.dequeue();
			st.display();
			st.dequeue();
			st.display();
			st.dequeue();
			st.display();
			st.display();
			st.enqueue(20);
			st.display();
			st.enqueue(100);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
