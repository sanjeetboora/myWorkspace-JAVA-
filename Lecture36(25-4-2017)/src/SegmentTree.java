
public class SegmentTree {
	private class Node {
		Node left;
		Node right;
		int si;
		int ei;
		int data;

	}

	private Node root;
	int size;

	public SegmentTree(int[] arr) {
		this.root = this.Construct(arr, 0, arr.length - 1);
	}

	private Node Construct(int[] arr, int si, int ei) {
		if (si == ei) {
			Node bn = new Node();
			bn.si = si;
			bn.ei = ei;
			bn.data = arr[si];
			bn.left = null;
			bn.right = null;
			return bn;
		} else {
			Node rv = new Node();
			int mid = (si + ei) / 2;
			rv.si = si;
			rv.ei = ei;
			rv.left = this.Construct(arr, si, mid);
			rv.right = this.Construct(arr, mid + 1, ei);
			rv.data = rv.left.data + rv.right.data;
			return rv;

		}
	}

	public int query(int si, int ei) {
		return this.query(this.root, si, ei);
	}

	private int query(Node node, int qsi, int qei) {
		if (qsi > node.ei || qei < node.si) {
			return 0;
		} else if (qsi <= node.si && qei >= node.ei) {
			return node.data;
		} else {
			int lsv = this.query(node.left, qsi, qei);
			int rsv = this.query(node.right, qsi, qei);
			return node.data = lsv + rsv;

		}

	}

	public void update(int val, int idx) {
		this.root.data = this.update(this.root, val, idx);
	}

	private int update(Node node, int val, int idx) {
		if (idx >= node.si && idx <= node.ei) {
			if (node.si == node.ei) {
				node.data = val;
			}
		} else {
			int lsv = this.update(node.left, val, idx);
			int rsv = this.update(node.right, val, idx);
			node.data = lsv + rsv;
		}
		return node.data;

	}

	public void display() {
		this.display(this.root);
	}

	public void display(Node node) {
		String str = "";
		 if (node.left == null && node.right == null) {
		 return;
		 }
		 if(node.left!=null){
		Node ls = node.left;
		str += "[ " + ls.data + ", " + node.si + ", " + node.ei + " ]" + "=>";
		}
		 str += node.data;
		
		if(node.right!=null){
			Node rs = node.left;
		str += "<=" + "[ " + rs.data + ", " + node.si + ", " + node.ei + " ]";
		}
	
		System.out.println(str);
	}
}
