
public class DynamicStack extends stack {

	public DynamicStack(int capacity) {
		super(capacity);
	}

	public DynamicStack() {
		super();
	}

	@Override
	public void push(int item) {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			;
			this.data = new int[2 * oa.length];
			for (int i = 0; i < oa.length; i++) {
				this.data[i] = oa[i];
			}
		}
		try {
			super.push(item);
		} catch (Exception ex) {

		}
	}

	@Override
	public int pop() throws Exception {
		if (this.size() <= this.data.length / 4) {

			int[] oa = this.data;

			this.data = new int[oa.length / 2];

			for (int i = 0; i < oa.length; i++) {
				this.data[i] = oa[i];
			}
		}
		return super.pop();

	}
}
