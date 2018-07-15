
public class stack {
	private int[] data;
	private int tos;
	public static final int default_capacity = 1000;

	public stack(int capacity) {
		this.data = new int[capacity];
		this.tos = -1;
	}

	public stack() {
		this(default_capacity);

	}

	public int size() {
		return this.tos + 1;

	}

	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println("END");
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full");
		}
		this.tos++;
		this.data[tos] = item;
	}

	public int top() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty");
		} else {
			int rv = this.data[this.tos];
			return rv;
		}
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int rv = this.data[this.tos];
		this.data[tos] = 0;
		this.tos--;
		return rv;

	}

}
