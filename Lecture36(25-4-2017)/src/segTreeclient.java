
public class segTreeclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 1, 15, -5, -9, 12, 18, 0 };
		SegmentTree st = new SegmentTree(arr);
		st.display();
		st.query(2, 5);
		st.update(100, 3);
		st.display();
	}

}
