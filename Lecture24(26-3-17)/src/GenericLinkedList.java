
public class GenericLinkedList<T extends Comparable<T>> {

	public class Node {
		T data;
		Node next;

		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public GenericLinkedList() {
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

	public void addLast(T data) {
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

	public void addFirst(T data) {
		Node newHead = new Node(data, this.head);
		if (this.isEmpty()) {
			this.head = newHead;
			this.tail = newHead;
		} else {
			this.head = newHead;
		}
		this.size++;
	}

	public void addAt(T data, int index) throws Exception {
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

	public T getFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		} else {
			return this.head.data;
		}
	}

	public T getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		} else {
			return this.tail.data;
		}
	}

	public T getAt(int index) throws Exception {
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

	public T removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = this.tail = null;
		}
		T rv = this.head.data;
		this.head = this.head.next;
		this.size--;
		return rv;
	}

	public T removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = this.tail = null;
		}

		Node sm2 = this.getNodeAt(size() - 2);
		sm2.next = null;
		T rv = this.tail.data;
		this.tail = sm2;
		size--;
		return rv;
	}

	public T removeAt(int index) throws Exception {
		T rv = null;
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
			T temp = a.data;
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
		// T a=new scn.next();
		// System.out.println(find_N_in_LL(this.head,a));
	}

	// private boolean find_N_in_LL(Node node, T i) throws Exception {
	// if (node.data == i) {
	// return true;
	// }
	// if (node.next == null) {
	// return true;
	// }
	// boolean a = find_N_in_LL(node.next, i);
	// return a;
	// }

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
			T temp = right.data;
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

	public T kth_from_last(int k) {
		Node slow = this.head;
		Node fast = this.head;
		int i = 0;
		while (i != k) {
			fast = fast.next;
			i = i + 1;
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}

	public T mid() {
		return this.midNode().data;
	}

	private Node midNode() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next.next != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public GenericLinkedList<T> merge_sorted_LL(GenericLinkedList<T> other) {
		GenericLinkedList<T> newLl = new GenericLinkedList<>();
		Node one = this.head, two = other.head;
		while (one != null && two != null)
			if (one.data.compareTo(two.data) > 0) {
				newLl.addLast(two.data);
				two = two.next;

			} else {
				newLl.addLast(one.data);
				one = one.next;
			}
		while (two != null) {
			newLl.addLast(two.data);
			two = two.next;
		}
		while (one != null) {
			newLl.addLast(one.data);
			one = one.next;
		}
		return newLl;
	}

	public GenericLinkedList<T> mergeSort() {
		if (this.size <= 1) {
			return this;
		}
		GenericLinkedList<T> fh = new GenericLinkedList<>();
		GenericLinkedList<T> sh = new GenericLinkedList<>();
		Node mid = this.midNode();
		Node mid_next = mid.next;

		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;

		sh.head = mid_next;
		sh.tail = this.tail;
		sh.size = (this.size) / 2;

		fh = fh.mergeSort();
		sh = sh.mergeSort();
		GenericLinkedList<T> newLL = fh.merge_sorted_LL(sh);
		mid.next = mid_next;
		return newLL;

	}

	// public LinkedList swap()throws Exception {
	// return swap(2,4);
	// }
	//
	// private LinkedList swap(int first, int second) throws Exception{
	// Node one = this.getNodeAt(first);
	// Node one_prev=this.getNodeAt(first-1);
	// Node one_next=this.getNodeAt(first).next;
	// Node two = this.getNodeAt(second);
	// Node two_prev = this.getNodeAt(second-1);
	// Node two_next = this.getNodeAt(second).next;
	// one_prev.next=two;
	// one_next=two_next;
	// two.next=one_next;
	//
	// two_prev.next=one;
	//
	// return this;
	//
	// }
}
