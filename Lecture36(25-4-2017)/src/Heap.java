

import java.util.ArrayList;
import java.util.HashMap;

public class Heap<T extends Comparable<T>> {
	private ArrayList<T> data;
	private boolean isMin;
	private HashMap<T, Integer> posMap;

	public Heap(boolean isMin) {
		this.data = new ArrayList<>();
		this.isMin = isMin;
		this.posMap = new HashMap<>();
	}

	// not using pos map
	public Heap(boolean isMin, T[] arr) {
		this(isMin);

		for (T item : arr) {
			this.data.add(item);
		}

		for (int i = this.data.size() / 2 - 1; i >= 0; i--) {
			this.downHeapify(i);
		}
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
		this.posMap.put(item, this.data.size() - 1);

		this.upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}

		int pi = (ci - 1) / 2;
		if (isHigherPriority(ci, pi)) {
			this.swap(ci, pi);
			this.upheapify(pi);
		}
	}

	public T removeHP() {
		T rv = this.data.get(0);

		this.swap(0, this.data.size() - 1);
		this.posMap.remove(this.data.get(this.data.size() - 1));
		this.data.remove(this.data.size() - 1);

		this.downHeapify(0);

		return rv;
	}

	private void downHeapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int maxi = pi;

		if (lci < this.data.size() && this.isHigherPriority(lci, maxi)) {
			maxi = lci;
		}

		if (rci < this.data.size() && this.isHigherPriority(rci, maxi)) {
			maxi = rci;
		}

		if (maxi != pi) {
			this.swap(pi, maxi);
			this.downHeapify(maxi);
		}
	}

	private boolean isHigherPriority(int i, int j) {
		T ith = this.data.get(i);
		T jth = this.data.get(j);

		if (isMin) {
			return ith.compareTo(jth) < 0;
		} else {
			return ith.compareTo(jth) > 0;
		}
	}

	private void swap(int i, int j) {
		T ith = this.data.get(i);
		T jth = this.data.get(j);

		this.data.set(i, jth);
		this.data.set(j, ith);

		this.posMap.put(ith, j);
		this.posMap.put(jth, i);
	}

	public void display() {
		this.display(0);
	}

	private void display(int pi) {
		if (pi >= this.data.size()) {
			return;
		}

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		String str = "";

		if (lci < this.data.size()) {
			str += this.data.get(lci) + " => ";
		} else {
			str += "END => ";
		}

		str += this.data.get(pi);

		if (rci < this.data.size()) {
			str += " <= " + this.data.get(rci);
		} else {
			str += " <= END";
		}

		System.out.println(str);
		this.display(lci);
		this.display(rci);
	}

	public void update(T ov, T nv) {
		// find
		int idx = this.posMap.get(ov);

		// update
		this.data.set(idx, nv);
		this.posMap.remove(ov);
		this.posMap.put(nv, idx);

		this.upheapify(idx);
		this.downHeapify(idx);
	}
}

