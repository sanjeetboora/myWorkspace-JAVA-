
public class Queue_using_LL extends LinkedList implements IQueue {
	private LinkedList ll = new LinkedList();

	public Queue_using_LL() {
		this.ll = new LinkedList();
	}

	@Override
	public int size() {

		return this.ll.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.ll.size() == 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.ll);
	}

	@Override
	public void enqueue(int item) {
		// TODO Auto-generated method stub
		this.ll.addLast(item);
	}

	@Override
	public int dequeue() throws Exception {
		// TODO Auto-generated method stub
		int rv = 0;
		try {
			this.ll.removeFirst();
		} catch (Exception ex) {
			throw new Exception("queue is empty");
		}
		return rv;
	}

	@Override
	public int top() throws Exception {
		// TODO Auto-generated method stub
		int rv = 0;
		try {
			this.ll.getFirst();
		} catch (Exception ex) {
			throw new Exception("queue is empty");
		}
		return rv;
	}

}
