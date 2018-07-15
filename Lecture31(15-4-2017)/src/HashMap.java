import java.util.ArrayList;

public class HashMap<K, V> {
	private class Pair implements Comparable<Pair> {
		K key;
		V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public boolean equals(Object obj) {
			Pair other = (Pair) obj;
			return this.key.equals(other.key);
		}

		@Override
		public int compareTo(HashMap<K, V>.Pair o) {
			// DUMMY
			return 0;
		}

	}

	private GenericLinkedList<Pair>[] bucketArray;
	private int size;
	public static final int DEFAULT_CAPACITY = 4;

	public HashMap() {
		this(DEFAULT_CAPACITY);

	}

	public HashMap(int cap) {
		this.bucketArray = (GenericLinkedList<Pair>[]) new GenericLinkedList[cap];
		this.size = 0;

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public V get(K key) throws Exception {
		int bi = this.HashFunction(key);
		GenericLinkedList<Pair> bucket = this.bucketArray[bi];
		Pair pairtofind = new Pair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int foundAt = bucket.find(pairtofind);
			if (foundAt == -1) {
				return null;
			} else {
				Pair rv = bucket.getAt(foundAt);
				return rv.value;
			}
		}

	}

	public V remove(K key) throws Exception {
		int bi = this.HashFunction(key);
		GenericLinkedList<Pair> bucket = this.bucketArray[bi];
		Pair pairtofind = new Pair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int foundAt = bucket.find(pairtofind);
			if (foundAt == -1) {
				return null;
			} else {
				Pair rv = bucket.getAt(foundAt);

				bucket.removeAt(foundAt);
				this.size--;
				return rv.value;
			}
		}
	}

	public boolean containsKey(K key) {
		int bi = this.HashFunction(key);
		GenericLinkedList<Pair> bucket = this.bucketArray[bi];
		Pair pairtofind = new Pair(key, null);
		if (bucket == null) {
			return false;
		} else {
			int foundAt = bucket.find(pairtofind);
			if (foundAt == -1) {
				return false;
			} else {

				return true;
			}
		}
	}

	public void put(K key, V value) throws Exception {
		int bi = this.HashFunction(key);
		GenericLinkedList<Pair> bucket = this.bucketArray[bi];
		Pair pairtofind = new Pair(key, value);
		if (bucket == null) {
			bucket = new GenericLinkedList<Pair>();
			bucket.addLast(pairtofind);
			this.size++;
			this.bucketArray[bi] = bucket;

		} else {
			int foundAt = bucket.find(pairtofind);
			if (foundAt == -1) {
				bucket.addLast(pairtofind);
				this.size++;
			} else {
				Pair rv = bucket.getAt(foundAt);
				rv.value = pairtofind.value;

			}
		}
		int lambda = this.size() / bucketArray.length;
		if (lambda > 2) {
			this.rehash();
		}
	}

	public void display() throws Exception {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (GenericLinkedList<Pair> ob : bucketArray) {
			for (int i = 0; ob != null && i < ob.size(); i++) {
				Pair op = ob.removeFirst();
				System.out.println("KEY : " + op.key + " , VALUE : " + op.value);
				ob.addLast(op);
			}
			System.out.println("END");
		}
		System.out.println("END");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public ArrayList<K> keyset() throws Exception {
		ArrayList<K> rv = new ArrayList<>();
		for (GenericLinkedList<Pair> ob : bucketArray) {
			for (int i = 0; ob != null && i < ob.size(); i++) {
				Pair op = ob.removeFirst();
				rv.add(op.key);

				ob.addLast(op);
			}
		}
		return rv;
	}

	private int HashFunction(K key) {
		int hc = key.hashCode();
		return Math.abs(hc) % this.bucketArray.length;
	}

	private void rehash() throws Exception {
		GenericLinkedList<Pair>[] oldbucketArray = this.bucketArray;
		this.bucketArray = (GenericLinkedList<Pair>[]) new GenericLinkedList[oldbucketArray.length * 2];
		this.size = 0;
		for (GenericLinkedList<Pair> ob : oldbucketArray) {
			for (int i = 0; ob != null && i < ob.size(); i++) {
				Pair op = ob.removeFirst();
				this.put(op.key, op.value);
				ob.addLast(op);
			}
		}
	}

}
