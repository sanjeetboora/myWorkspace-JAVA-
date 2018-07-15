
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearchTree {
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

	public BinarySearchTree() {

		this.root = null;
		this.size = 0;
	}

	public BinarySearchTree(int... sa) {
		this.root = this.construct(sa, 0, sa.length - 1);

	}

	private Node construct(int[] sa, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (low + high) / 2;
		Node rv = new Node(sa[mid], null, null);
		this.size++;
		rv.left = this.construct(sa, low, mid - 1);
		rv.right = this.construct(sa, mid + 1, high);
		return rv;
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
		int rv = node.data;
		if (node.right != null) {
			rv = max(node.right);
		}

		return rv;
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		int rv = node.data;
		if (node.left != null) {
			rv = min(node.left);
		}

		return rv;
	}

	public boolean find(int data) {
		return this.find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (data > node.data) {
			return this.find(node.right, data);
		} else if (data < node.data) {
			return this.find(node.left, data);
		} else {
			return true;
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

	public void preOrder() {
		this.preOrder(this.root);
		System.out.println();
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + ",");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
		System.out.println();
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ",");
	}

	public void inOrder() {
		this.inOrder(this.root);
		System.out.println();
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + ",");
		inOrder(node.right);
	}

	public void levelorder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
		Node temp = queue.removeFirst();
		while (!queue.isEmpty()) {
			queue.removeFirst();
			System.out.print(temp.data + ", ");
			if (temp.left != null) {
				queue.addLast(temp.left);
			}
			if (temp.right != null) {
				queue.addLast(temp.right);
			}

			System.out.println("END");
		}
		System.out.println();

	}

	public void preorderI() {
		LinkedList<Node> stack = new LinkedList<>();
		stack.addFirst(this.root);
		Node temp = stack.removeFirst();
		while (!stack.isEmpty()) {
			stack.removeFirst();
			System.out.print(temp.data + ", ");
			if (temp.left != null) {
				stack.addFirst(temp.left);
			}
			if (temp.right != null) {
				stack.addFirst(temp.right);
			}

			System.out.println("END");
		}
		System.out.println();

	}

	private class composite {
		int size = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int height = 0;
		int leafCount = 0;
		boolean found = false;
		Node pred = null;
		Node succ = null;
		Node justlarger = null;

		public String toString() {
			String rv = "";
			rv += "size= " + size;
			rv += " min= " + min;
			rv += " max= " + max;
			rv += " height= " + height;
			rv += " found= " + found;
			if (pred == null) {
				rv += " pred=null ";
			} else {
				rv += " pred= " + pred.data;
			}
			if (succ == null) {
				rv += " succ=null ";
			} else {
				rv += " succ= " + succ.data;
			}
			if (justlarger == null) {
				rv += " justlarger=null ";
			} else {
				rv += " justlarger= " + justlarger.data;
			}

			return rv;
		}

	}

	public void multisolver(int data) {
		composite com = new composite();
		this.multisolver(com, this.root, 0, data);
		System.out.println(com);

	}

	private void multisolver(composite com, Node node, int level, int data) {
		if (node == null) {
			return;
		}
		com.size++;

		if (com.found && com.succ == null) {
			com.succ = node;
		}
		if (node.data == data) {
			com.found = true;
		}
		if (!com.found) {
			com.pred = node;
		}

		if (node.data <= com.min) {
			com.min = node.data;
		}
		if (node.data >= com.max) {
			com.max = node.data;
		}
		if (node.left == null) {
			com.leafCount++;
		}

		if (com.height < level) {
			com.height = level;
		}

		this.multisolver(com, node.left, level + 1, data);
		this.multisolver(com, node.right, level + 1, data);
	}

	public void addelement(int data) {
		if (this.isEmpty()) {
			this.root = new Node(data, null, null);
			this.size = 1;
		} else {
			this.addelement(this.root, data);
		}
	}

	private void addelement(Node node, int data) {
		if (data > node.data) {
			if (node.right != null) {
				this.addelement(node.right, data);
			}

			else {
				node.right = new Node(data, null, null);
			}
			this.size++;
		} else if (data < node.data) {
			if (node.left != null) {
				this.addelement(node.left, data);
			}

			else {
				node.left = new Node(data, null, null);
			}
			this.size++;
		} else {

		}
	}

	public void removeelement(int data) {
		if (this.size() == 1) {
			this.root = null;
			this.size--;
		} else {
			this.removeelement(this.root, null, false, data);
		}
	}

	private void removeelement(Node node, Node parent, boolean ilc, int data) {
		if (data > node.data) {

			this.removeelement(node.right, node, false, data);
		}

		else if (data < node.data) {
			this.removeelement(node.left, node, true, data);
		} else {
			if (node.right == null && node.left == null) {
				if (ilc) {
					parent.left = null;
				}

				else {
					parent.right = null;
				}
				this.size--;
			} else if (node.left == null) {
				if (ilc) {
					parent.left = node.right;
				}

				else {
					parent.right = node.right;
				}
				this.size--;

			} else if (node.right == null) {
				if (ilc) {
					parent.left = node.left;
				}

				else {
					parent.right = node.left;
				}
				this.size--;

			} else {
				int lmax = this.max(node.left);
				node.data = lmax;
				this.removeelement(node.left, node, true, lmax);

			}
		}
	}

	// public void printIin_range(int sno,int lno){
	// this.printIin_range(sno, lno,this.root);
	//
	// }private void printIin_range(int sno,int lno,Node node){
	// if(node.data>sno){
	// if(node.data<lno){
	// printIin_range(sno,lno,node.left);
	// }
	// System.out.println(node.data);
	// }
	//
	//
	// }

	// }

}
