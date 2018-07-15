
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
		this.tail.next=null;
	}

}
