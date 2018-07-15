import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	private ArrayList<T> data;
	private boolean isMin;

	public Heap(boolean isMin) {
		this.data = new ArrayList<T>();
		this.isMin = isMin;
	}

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public T getHP() {
		return this.data.get(0);
	}

	public void add(T item) {
		this.data.add(item);
		this.upHeapify(this.data.size() - 1);
	}

	private void upHeapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;
		if (HigherPriority(ci, pi)) {
			Swap(pi, ci);
			this.upHeapify(pi);
		}

	}

	private boolean HigherPriority(int i, int j) {
		T ith = this.data.get(i);
		T jth = this.data.get(j);
		if (isMin) {
			return ith.compareTo(jth) < 0;
		} else {
			return ith.compareTo(jth) > 0;
		}

	}

	private void Swap(int i, int j) {
		T ith = this.data.get(i);
		T jth = this.data.get(j);
		this.data.set(i, jth);
		this.data.set(j, ith);
	}

	public T remove() {
		T result = this.data.get(0);
		Swap(0, this.data.size() - 1);
		this.data.remove(this.data.size() - 1);
		this.downHeapify(0);
		return result;
	}

	private void downHeapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int maxi = pi;
		if (lci < this.data.size() && this.HigherPriority(lci, maxi)) {
			maxi = lci;
		}
		if (rci < this.data.size() && this.HigherPriority(rci, maxi)) {
			maxi = rci;
		}
		if (maxi != pi) {
			this.Swap(maxi, pi);
			this.downHeapify(maxi);
		}
	}

	public void display() {
		this.display(0);
	}

	private void display(int index) {
		int lci = 2 * index + 1;
		int rci = 2 * index + 2;
		String str = "";
		if (lci < this.data.size()) {
			str += this.data.get(lci) + " => ";
		} else {
			str += "==>>end";
		}

	
		str += this.data.get(index);
		
		if (rci < this.data.size()) {
			str += this.data.get(rci) + " <= ";
		} else {
			str += " <<==end ";
		}

		System.out.println(str);
		if (lci < this.data.size()) {
			this.display(lci);
		}

		if (rci < this.data.size()) {

			this.display(rci);
		}

	}

	
}
