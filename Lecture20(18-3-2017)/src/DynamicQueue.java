
public class DynamicQueue extends queue {

	public DynamicQueue(int capacity) {
		super(capacity);
	}

	public DynamicQueue() {
		super();

	}

	@Override
	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			;
			this.data = new int[2 * oa.length];
			// for (int i = 0; i < oa.length; i++) {
			// this.data[i] = oa[i];
			// }
			for (int i = 0; i < this.size(); i++) {
				int temprear = (this.front + i) % oa.length;
				this.data[i] = oa[temprear];
			}
			this.front = 0;
		}
		try {
			super.enqueue(item);
		} catch (Exception ex) {

		}
	}

	@Override
	public int dequeue() throws Exception {
		if (this.size() <= this.data.length / 4) {
			int[] oa = this.data;

			this.data = new int[oa.length / 2];

			for (int i = this.front; i < this.size(); i++) {
				this.data[i] = oa[i];
			}
		}

		return super.dequeue();
	}

}
