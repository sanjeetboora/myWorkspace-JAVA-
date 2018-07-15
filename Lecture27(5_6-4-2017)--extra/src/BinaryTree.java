import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public BinaryTree() {
		this.root = this.takeInput(new Scanner(System.in), null, false);
	}

	private Node takeInput(Scanner scn, Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		int cdata = scn.nextInt();
		Node child = new Node(cdata, null, null);
		this.size++;

		System.out.println("Do you have a left child for " + cdata);
		boolean hlc = scn.nextBoolean();

		if (hlc) {
			child.left = this.takeInput(scn, child, true);
		}

		System.out.println("Do you have a right child for " + cdata);
		boolean hrc = scn.nextBoolean();

		if (hrc) {
			child.right = this.takeInput(scn, child, false);
		}

		return child;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}

		String str = "";

		if (node.left != null) {
			str += node.left.data + " => ";
		} else {
			str += "END " + " => ";
		}

		str += node.data;

		if (node.right != null) {
			str += " <= " + node.right.data;
		} else {
			str += " <= " + " END";
		}

		System.out.println(str);
		this.display(node.left);
		this.display(node.right);
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = this.size2(node.left);
		int rsize = this.size2(node.right);
		int msize = lsize + rsize + 1;
		return msize;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		int mheight = Math.max(rheight, lheight) + 1;
		return mheight;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return -1;
		}
		int lmax = this.max(node.left);
		int rmax = this.max(node.right);
		int mmax = Math.max(node.data, Math.max(lmax, rmax));
		return mmax;
	}

	public boolean find(int data) {
		return this.find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		} else if (node.data == data) {
			return true;
		} else if (this.find(node.left, data) == true) {
			return true;
		} else if (this.find(node.right, data) == true) {
			return true;
		} else {
			return false;
		}
	}

	public int diameter() {
		return this.diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		int ldiameter = this.diameter(node.left);
		int rdiameter = this.diameter(node.right);
		int mydiameter = lheight + rheight + 2;
		int max = Math.max(mydiameter, Math.max(rdiameter, ldiameter));
		return max;
	}

	public int diameter2() {
		return this.diameter2(this.root).diameter;
	}

	private DiaPair diameter2(Node node) {
		if (node == null) {
			DiaPair bp = new DiaPair();
			bp.diameter = 0;
			bp.height = -1;
			return bp;
		}

		DiaPair ldiameter = this.diameter2(node.left);
		DiaPair rdiameter = this.diameter2(node.right);
		DiaPair mp = new DiaPair();
		mp.height = Math.max(rdiameter.height, ldiameter.height) + 1;
		mp.diameter = Math.max(ldiameter.height + rdiameter.height + 2,
				Math.max(rdiameter.diameter, ldiameter.diameter));
		return mp;
	}

	private class DiaPair {
		int height;
		int diameter;
	}

	private class bal_pair {
		int height;
		boolean balance;
	}

	public boolean is_balanced() {
		return this.is_balanced(this.root).balance;
	}

	private bal_pair is_balanced(Node node) {
		if (node == null) {
			bal_pair bp = new bal_pair();
			bp.balance = true;
			bp.height = -1;
			return bp;
		}

		bal_pair lp = this.is_balanced(node.left);
		bal_pair rp = this.is_balanced(node.right);
		bal_pair mp = new bal_pair();
		mp.height = Math.max(rp.height, lp.height) + 1;
		mp.balance = true;
		if (!lp.balance || !rp.balance) {
			mp.balance = false;
		} else {
			int gap = Math.abs(lp.height - rp.height);
			if (gap > 1) {
				mp.balance = false;
			}
		}

		return mp;
	}

}
