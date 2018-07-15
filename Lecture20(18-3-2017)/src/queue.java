
public class queue {
	protected int[] data;
	protected int front;
	private int size;
	public static final int default_capacity = 10;

	public queue(int capacity) {
		this.data = new int[capacity];
		this.size = 0;
		this.front = 0;
	}

	public queue() {
		this(default_capacity);

	}

	public int size() {
		return this.size;

	}

	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void display() throws Exception {
		for (int i = 0; i < size; i++) {
			int temprear = (this.front + i) % this.data.length;
			System.out.print(this.data[temprear] + " ");
			
		}System.out.println("end");
	}
//  An Alternative to display() by this we can use syso for our queue instead of display()
	public String toString() {
		String rv="";
		for (int i = 0; i < size; i++) {
			int temprear = (this.front + i) % this.data.length;
			 rv+=this.data[temprear] + " ";
			
		}
		rv+="end";
		return rv;
	}
	
	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("queue is full");
		}
		int rear = (this.front + this.size) % this.data.length;
		this.data[rear] = item;
		this.size++;
	}

	public int front() throws Exception {
		if (isEmpty()) {
			throw new Exception("queue is empty");
		}
		int rv = this.data[this.front];
		return rv;
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("queue is empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;
	}
}
