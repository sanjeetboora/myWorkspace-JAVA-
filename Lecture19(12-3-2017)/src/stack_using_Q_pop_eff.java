
public class stack_using_Q_pop_eff {
	private queue q_Primary;
	private queue q_Helper;

	public static final int DEFAULT_CAPACITY = 10;

	public stack_using_Q_pop_eff() {
		this(DEFAULT_CAPACITY);
	}

	public stack_using_Q_pop_eff(int cap) {
		this.q_Primary = new queue(cap);
		this.q_Helper = new queue(cap);
	}

	public int size() {
		return this.q_Primary.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) throws Exception {
		try {
			this.q_Helper.enqueue(item);
			while (this.q_Primary.size() != 0) {
				this.q_Helper.enqueue(this.q_Primary.dequeue());
			}
			queue temp = this.q_Primary;
			this.q_Primary = this.q_Helper;
			this.q_Helper = temp;
		} catch (Exception ex) {
			throw new Exception("stack is full");
		}
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("stack is empty");
		}
		int rv = this.q_Primary.front();
		this.q_Primary.dequeue();
		return rv;
	}

	public int top() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("stack is empty");
		}
		int rv = this.q_Primary.front();

		return rv;
	}
	public String toString() {
		String rv = "";
		try {
			rv = this.q_Primary.toString();
		} catch (Exception ex) {
		}
		return rv;
	}

}
