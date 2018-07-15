
public class LinkedList {

	public class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void addLast(int data) {
		Node newTail = new Node(data, null);
		if (this.isEmpty()) {
			this.head = newTail;
			this.tail = newTail;
		} else {
			this.tail.next = newTail;
			this.tail = newTail;
		}
		this.size++;
	}

	public void addFirst(int data) {
		Node newHead = new Node(data, this.head);
		if (this.isEmpty()) {
			this.head = newHead;
			this.tail = newHead;
		} else {
			this.head = newHead;
		}
		this.size++;
	}

	public void addAt(int data, int index) throws Exception {
		if (index < 0 || index > this.size()) {
			throw new Exception("Index out of Bound");
		}
		if (index == 0) {
			this.addFirst(data);
		}
		if (index == this.size()) {
			this.addLast(data);
		} else {
			Node NM1 = this.getNodeAt(index - 1);
			Node NP1 = NM1.next;
			Node newNode = this.new Node(data, NP1);
			NM1.next = newNode;
			this.size++;
		}

	}

	public int getFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		} else {
			return this.head.data;
		}
	}

	public int getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		} else {
			return this.tail.data;
		}
	}

	public int getAt(int index) throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		} else {
			return this.getNodeAt(index).data;
		}
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size()) {
			throw new Exception("Index out of Bound");
		}
		Node rv = this.head;
		for (int i = 0; i < index; i++) {
			rv = rv.next;
		}
		return rv;
	}

	@Override
	public String toString() {
		String rv = "";
		for (Node node = this.head; node != null; node = node.next) {
			rv = rv + node.data + " => ";
		}
		rv = rv + " end ";
		return rv;
	}

	public int removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = this.tail = null;
		}
		int rv = this.head.data;
		this.head = this.head.next;
		this.size--;
		return rv;
	}

	public int removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = this.tail = null;
		}

		Node sm2 = this.getNodeAt(size() - 2);
		sm2.next = null;
		int rv = this.tail.data;
		this.tail = sm2;
		size--;
		return rv;
	}

	public int removeAt(int index) throws Exception {
		int rv = 0;
		if (index < 0 || index >= this.size()) {
			throw new Exception("Index out of Bound");
		}

		if (index == 0) {
			this.removeFirst();
		}
		if (index == this.size()) {
			this.removeLast();
		} else {
			Node NM1 = this.getNodeAt(index - 1);
			Node N = NM1.next;
			Node Np1 = N.next;
			NM1.next = Np1;
			this.size--;
			rv = N.data;
		}
		return rv;
	}

	public void LL_Reverse_Data_Iterative() throws Exception {
		int left = 0, right = this.size() - 1;
		while (left < right) {

			Node a = this.getNodeAt(left);
			Node b = this.getNodeAt(right);
			int temp = a.data;
			a.data = b.data;
			b.data = temp;
			left++;
			right--;
		}
	}

	public void LL_Reverse_Pointer_Iterative() throws Exception {
		Node prev = null, curr = this.head;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void LL_Display_Reverse() throws Exception {
		this.LL_Display_Reverse(this.head);
		System.out.println("end");
	}

	private void LL_Display_Reverse(Node node) throws Exception {
		if (node == null) {
			return;
		}
		this.LL_Display_Reverse(node.next);
		System.out.print(node.data + " , ");
	}

	public void LL_Reverse_Pointer_Recursive() throws Exception {
		LL_Reverse_Pointer_Recursive(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void LL_Reverse_Pointer_Recursive(Node node) throws Exception {
		if (node.next == null) {
			return;
		}
		Node a = node.next;
		LL_Reverse_Pointer_Recursive(a);
		a.next = node;
	}

	public void find_N_in_LL() throws Exception {
		System.out.println(find_N_in_LL(this.head, 50));
	}

	private boolean find_N_in_LL(Node node, int i) throws Exception {
		if (node.data == i) {
			return true;
		}
		if (node.next == null) {
			return true;
		}
		boolean a = find_N_in_LL(node.next, i);
		return a;
	}

	public void Reverse_data_recursive() {
		Heapmover heap_left = new Heapmover(this.head);
		Reverse_data_recursive(heap_left, this.head, 0);
	}

	private void Reverse_data_recursive(Heapmover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		Reverse_data_recursive(left, right.next, floor + 1);
		if (floor >= size / 2) {
			int temp = right.data;
			right.data = left.node.data;
			left.node.data = temp;

			left.node = left.node.next;
		}
	}

	private class Heapmover {
		Node node;

		public Heapmover(Node node) {
			this.node = node;
		}
	}

	public void is_palindrome() {
		Heapmover heap_left = new Heapmover(this.head);
		System.out.println(is_palindrome(heap_left, this.head, 0));
	}

	private boolean is_palindrome(Heapmover left, Node right, int floor) {
		if (right == null) {
			return true;
		}
		boolean a = is_palindrome(left, right.next, floor + 1);
		if (floor >= size / 2) {
			if (right.data != left.node.data) {
				return false;
			}
			left.node = left.node.next;
		}
		return a;
	}

	public void fold() {
		Heapmover heap_left = new Heapmover(this.head);
		fold(heap_left, this.head, 0);
	}

	private void fold(Heapmover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		fold(left, right.next, floor + 1);
		if (floor >= this.size / 2) {
			Node o_Left_next = left.node.next;
			// Node right_next=right.next;
			left.node.next = right;
			right.next = o_Left_next;

			left.node = o_Left_next;
		}
		if (floor == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}

	public void remove_consecutive_duplicates() {
		Heapmover heap_left = new Heapmover(this.head);
		remove_consecutive_duplicates(heap_left, this.head, 0);
	}

	private void remove_consecutive_duplicates(Heapmover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		if (left.node.data == right.next.data) {
			Node NM1 = right;
			Node N = NM1.next;
			Node Np1 = N.next;
			NM1.next = Np1;
			left.node = left.node.next;
			this.size--;

		}

		remove_consecutive_duplicates(left, right.next, floor + 1);

	}

}
