import java.util.Arrays;
import java.util.LinkedList;
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

	// public BinaryTree(int[] pre, int[] in) {
	// this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	// this.size = pre.length;
	// }
	//
	// private Node construct(int[] pre, int psi, int pei, int[] in, int insi,
	// int inei) {
	// if (psi > pei || insi > inei) {
	// return null;
	// }
	// Node node = new Node(pre[psi], null, null);
	// // int si = Arrays.binarySearch(in, insi, inei + 1, pre[psi]);
	// int si = -1;
	// for (int i = insi; i <= inei; i++) {
	// if (in[i] == post[poei]) {
	// si = i;
	// break;
	// }
	// }
	// int count = si - insi;
	//
	// node.left = construct(pre, psi + 1, psi + count, in, insi, si - 1);
	// node.right = construct(pre, psi + count + 1, pei, in, si + 1, inei);
	// return node;
	// }

	// public BinaryTree(int[] post, int[] in) {
	// this.root = this.construct(post, 0, post.length - 1, in, 0, in.length -
	// 1);
	// this.size = post.length;
	// }

	// private Node construct(int[] post, int posi, int poei, int[] in, int
	// insi, int inei) {
	// if (posi > poei || insi > inei) {
	// return null;
	// }
	// Node node = new Node(post[poei], null, null);
	// // int si = Arrays.binarySearch(in, insi, inei + 1, post[poei]);
	// int si = -1;
	// for (int i = insi; i <= inei; i++) {
	// if (in[i] == post[poei]) {
	// si = i;
	// break;
	// }
	// }
	// int count = inei - si;
	// node.right = construct(post, poei - count, poei - 1, in, si + 1, inei);
	// node.left = construct(post, posi, poei - count - 1, in, insi, si - 1);
	//
	// return node;
	// }
	public BinaryTree(int[] pre, int[] post) {
		this.root = this.construct(pre, 0, pre.length - 1, post, 0, post.length - 1);
		this.size = post.length;
	}

	private Node construct(int[] pre, int psi, int pei, int[] post, int posi, int poei) {
		if (psi > pei || posi > poei) {
			return null;
		}
		if (psi == pei) {
			return new Node(pre[psi], null, null);
		}
		Node node = new Node(pre[psi], null, null);
		int si = -1;
		for (int i = posi; i <= poei; i++) {
			if (post[i] == pre[psi + 1]) {
				si = i;
				break;
			}
		}
		int count = si - posi + 1;

		node.left = construct(pre, psi + 1, psi + count, post, posi, si);
		node.right = construct(pre, psi + count + 1, pei, post, si + 1, poei - 1);
		return node;
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

	public boolean IsBST2() {
		return this.IsBST2(this.root).isBST;
	}

	private pair IsBST2(Node node) {
		if (node == null) {
			pair BST = new pair();
			BST.isBST = true;
			BST.min = Integer.MAX_VALUE;
			BST.max = Integer.MIN_VALUE;
			return BST;
		}

		pair ilb = this.IsBST2(node.left);
		pair irb = this.IsBST2(node.right);
		pair mp = new pair();
		mp.max = Math.max(node.data, Math.max(ilb.max, irb.max));
		mp.min = Math.min(node.data, Math.min(ilb.min, irb.min));

		if (ilb.isBST == false || irb.isBST == false) {
			mp.isBST = false;
		} else if (ilb.max > node.data || irb.min < node.data) {
			mp.isBST = false;
		} else {
			mp.isBST = true;
		}
		return mp;
	}

	private class pair {
		boolean isBST;
		int min;
		int max;

	}

	private class pair1 {
		boolean isBST;
		int min;
		int max;
		Node largestBSTRoot;
		int largestBSTsize;

	}

	public int largest_BST() {
		pair1 ans= new pair1();
		ans= this.largest_BST(this.root);
		System.out.println(ans.largestBSTRoot.data);
		return ans.largestBSTsize;
	}

	private pair1 largest_BST(Node node) {
		if (node == null) {
			pair1 BST = new pair1();
			BST.isBST = true;
			BST.min = Integer.MAX_VALUE;
			BST.max = Integer.MIN_VALUE;
			BST.largestBSTRoot = null;
			BST.largestBSTsize = 0;
			return BST;
		}

		pair1 ilb = this.largest_BST(node.left);
		pair1 irb = this.largest_BST(node.right);
		pair1 mp = new pair1();
		mp.max = Math.max(node.data, Math.max(ilb.max, irb.max));
		mp.min = Math.min(node.data, Math.min(ilb.min, irb.min));
		if (mp.isBST == true) {
			mp.largestBSTsize++;
		}

		if (ilb.isBST == false || irb.isBST == false) {
			mp.isBST = false;
		} else if (ilb.max > node.data || irb.min < node.data) {
			mp.isBST = false;
		} else {
			mp.isBST = true;
		}
		if (mp.isBST) {
			mp.largestBSTRoot = node;
			mp.largestBSTsize = ilb.largestBSTsize + irb.largestBSTsize + 1;
		} else {
			if (ilb.largestBSTsize > irb.largestBSTsize) {
				mp.largestBSTRoot = ilb.largestBSTRoot;
				mp.largestBSTsize = ilb.largestBSTsize;
			}
			if (ilb.largestBSTsize < irb.largestBSTsize) {
				mp.largestBSTRoot = irb.largestBSTRoot;
				mp.largestBSTsize = irb.largestBSTsize;
			}
		}
		return mp;
	}
	public void levelOrder_zigzag(){
		this.levelOrder_zigzag(this.root);
	}
	private void levelOrder_zigzag(Node node){
		
	}

	// public void addRightNodes() {
	// this.addRightNodes(this.root);
	// }
	//
	// private int addRightNodes(Node node) {
	// if (node == null) {
	// return node.data = 0;
	// }
	// int a = addRightNodes(node.right);
	// System.out.print(node.data + ",");
	// int b = addRightNodes(node.left);
	// return a + b;
	// }
}