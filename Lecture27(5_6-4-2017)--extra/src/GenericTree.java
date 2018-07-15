
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children;

		public Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;

	public GenericTree() {
		Scanner scn = new Scanner(System.in);
		this.root = this.construct(scn, null, -1);
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	private Node construct(Scanner scn, Node Parent, int ithchild) {
		if (Parent == null) {
			System.out.println("enter the data for root ");

		} else {
			System.out.println("Enter the data for " + ithchild + "th" + "child of" + Parent.data);
		}
		int ithchildData = scn.nextInt();
		Node child = new Node(ithchildData);
		this.size += 1;
		System.out.println("Enter the no. of children for" + child.data);
		int numGC = scn.nextInt();

		for (int i = 0; i < numGC; i++) {
			Node grandchild = this.construct(scn, child, i);
			child.children.add(grandchild);
		}
		return child;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = node.data + "=>";
		for (Node child : node.children) {
			str += child.data + ",";
		}
		str += "END";
		System.out.println(str);
		for (Node child : node.children) {
			this.display(child);
		}
	}

	/////// Code to get the size of the tree///////////
	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		int rv = 0;
		for (Node child : node.children) {
			// int childtreesize = this.size2(node.children.get(i));
			rv += this.size2(child);

		}
		// for node itself
		rv += 1;
		return rv;
	}
	///////////////////////////////////////////////////////

	/////// Code to get the height of the tree///////////

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		int maxchildheight = -1; // for leaf node if we dont do this then the
									// program will return height +1
		for (Node child : node.children) {
			int ch = this.height(child);
			if (ch > maxchildheight) {
				maxchildheight = ch;
			}
		}
		// for node itself
		maxchildheight += 1;
		return maxchildheight;
	}

	/////////////////////////////////////////////////////////////

	/////// Code to get the max of the tree///////////
	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int subTreemax = Integer.MIN_VALUE;// or int rv=node.data
		int allChildMax = Integer.MIN_VALUE;
		for (Node child : node.children) {
			int singlechildMax = this.max(child);
			allChildMax = Math.max(singlechildMax, allChildMax);
		}
		subTreemax = Math.max(allChildMax, node.data);
		return subTreemax;
	}

	/////////////////////////////////////////////////////////
	/////// Code to get the find data in the tree///////////
	public boolean find(int data) {
		return this.find(data, this.root);
	}

	private boolean find(int data, Node node) {
		if (data == node.data) {
			return true;
		}
		for (Node child : node.children) {

			boolean foundintree = find(data, child);
			if (foundintree) {
				return true;
			}
		}
		return false;

	}

	public void countLEAF() {
		System.out.println(this.countleaf(this.root));
		// System.out.println(this.);
	}

	private int countleaf(Node node) {
		int rv = 0;

		if (node.children.size() == 0) {
			rv = 1;
		} else {
			for (Node abc : node.children) {
				rv += countleaf(abc);
			}

		}

		return rv;

	}

	public void MIRROR() {
		this.mirrorIt(this.root);
	}

	private void mirrorIt(Node node) {
		for (int i = 0; i < node.children.size(); i++) {
			this.mirrorIt(node.children.get(i));
		}
		int left = 0, right = node.children.size() - 1;
		while (left < right) {
			Node temp = node.children.get(left);
			node.children.set(left, node.children.get(right));
			node.children.set(right, temp);
			left++;
			right--;
		}
	}

	public void LINEARIZE() {
		this.LINEARIZE_IT(this.root);
	}

	private void LINEARIZE_IT(Node node) {
		for (int i = 0; i < node.children.size(); i++) {
			this.LINEARIZE_IT(node.children.get(i));

		}
		while (node.children.size() > 1) {
			Node tail_of_z = this.get_tail(node.children.get(0));
			Node remove = node.children.remove(1);
			tail_of_z.children.add(remove);

		}
	}

	private Node get_tail(Node node) {
		Node abc = node;
		while (abc.children.size() != 0) {
			abc = abc.children.get(0);
		}
		return abc;
	}

	public void LINEARIZE_TWO() {
		this.LINEARIZE_IT_TWO(this.root);
	}

	private linearize_2_mover LINEARIZE_IT_TWO(Node node) {
		if (node.children.size() == 0) {
			return new linearize_2_mover(node, node);
		}
		linearize_2_mover prev = this.LINEARIZE_IT_TWO(node.children.get(0));

		while (node.children.size() > 1) {

			Node remove = node.children.remove(1);
			linearize_2_mover curr = this.LINEARIZE_IT_TWO(remove);
			prev.tail.children.add(curr.head);
			prev.tail = curr.tail;

		}
		prev.head = node;
		return prev;
	}

	private class linearize_2_mover {
		Node head;
		Node tail;

		linearize_2_mover() {

		}

		linearize_2_mover(Node head, Node tail) {
			this.head = head;
			this.tail = tail;
		}

	}

	public void LINEARIZE_THREE() {
		linearize_2_mover pair = new linearize_2_mover();
		this.LINEARIZE_IT_THREE(this.root, pair);
		this.root = pair.head;
	}

	private void LINEARIZE_IT_THREE(Node node, linearize_2_mover pair) {
		Node temp = new Node(node.data);

		if (pair.head == null && pair.tail == null) {
			pair.head = temp;
			pair.tail = temp;
		} else {

			pair.tail.children.add(temp);
			pair.tail = temp;
		}

		for (Node abc : node.children) {
			this.LINEARIZE_IT_THREE(abc, pair);

		}

	}

	public void Print_at_LEVEL(int level) {
		this.PRINT_AT_LEVEL(this.root, level);
		System.out.println("END");
	}

	private void PRINT_AT_LEVEL(Node node, int level) {
		// String str = node.data + "=>";
		if (level == 0) {
			System.out.print(node.data + ", ");
			return;
		}

		for (int i = 0; i < node.children.size(); i++) {
			PRINT_AT_LEVEL(node.children.get(i), level - 1);
		}

	}

	public boolean is_isomorphic(GenericTree other) {
		return this.is_isomorphic(this.root, other.root);
	}

	private boolean is_isomorphic(Node node1, Node node2) {
		if (node1 == node2 && node1 == null) {
			return true;
		}
		boolean flag = true;
		if (node1.children.size() != node2.children.size()) {
			return false;
		}
		for (int i = 0; i < node1.children.size(); i++) {
			Node a = node1.children.get(i);
			Node b = node2.children.get(i);
			flag = is_isomorphic(a, b);
			if (flag == false) {
				return false;
			}
		}
		return flag;
	}

	// public void preOrder() {
	// this.preOrder(this.root);
	// }
	//
	// private void preOrder(Node node) {
	// System.out.println(node.data);
	// for (Node child : node.children) {
	// preOrder(child);
	// }
	//
	// }
	public void postOrder() {
		this.postOrder(this.root);
	}

	private void postOrder(Node node) {

		for (Node child : node.children) {
			postOrder(child);
		}
		System.out.println(node.data);
	}

	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) {
		System.out.print(node.data + ", ");
		for (int i = 0; i < node.children.size(); i++) {
			this.preOrder(node.children.get(i));
		}
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();

		queue.addLast(this.root);

		while (!queue.isEmpty()) {
			Node temp = queue.removeFirst();

			System.out.print(temp.data + ", ");

			for (Node child : temp.children) {
				queue.addLast(child);
			}
		}

		System.out.println("END");

	}

	public void levelOrderLW() {
		LinkedList<Node> pq = new LinkedList<>();
		LinkedList<Node> cq = new LinkedList<>();

		pq.addLast(this.root);

		while (!pq.isEmpty()) {
			Node temp = pq.removeFirst();

			System.out.print(temp.data + ", ");

			for (Node child : temp.children) {
				cq.addLast(child);
			}

			if (pq.isEmpty()) {
				System.out.println();
				pq = cq;
				cq = new LinkedList<>();
			}
		}

		System.out.println("END");

	}

	public void preOrderIt() {

		Stack<Node> stack = new Stack<>();
		stack.push(this.root);
		while (!stack.isEmpty()) {

			Node node = stack.pop();
			System.out.print(node.data + ",");
			for (int i = node.children.size() - 1; i >= 0; i--) {
				stack.push(node.children.get(i));
			}
		}
	}

	/*
	 * 
	 * 
	 * public void print() { this.print(0, this.root); }
	 * 
	 * private void print(int data, Node node) { data = node.data; for (int i =
	 * 0; i < node.children.size(); i++) { print(data, node.children.get(i));
	 * System.out.println(node.children.get(i).data); } }
	 * 
	 * private class composite { int size = 0; int min = Integer.MAX_VALUE; int
	 * max = Integer.MIN_VALUE; int height = 0; int leafCount = 0; boolean found
	 * = false; Node pred = null; Node succ = null; Node justlarger = null;
	 * 
	 * public String toString() { String rv = ""; rv += "size= " + size; rv +=
	 * " min= " + min; rv += " max= " + max; rv += " height= " + height; rv +=
	 * " found= " + found; if (pred == null) { rv += " pred=null "; } else { rv
	 * += " pred= " + pred.data; } if (succ == null) { rv += " succ=null "; }
	 * else { rv += " succ= " + succ.data; } if (justlarger == null) { rv +=
	 * " justlarger=null "; } else { rv += " justlarger= " + justlarger.data; }
	 * 
	 * return rv; }
	 * 
	 * }
	 * 
	 * public void multisolver(int data) { composite com = new composite();
	 * this.multisolver(com, this.root, 0, data); System.out.println(com);
	 * 
	 * }
	 * 
	 * private void multisolver(composite com, Node node, int level, int data) {
	 * com.size++;
	 * 
	 * if (com.found && com.succ == null) { com.succ = node; } if (node.data ==
	 * data) { com.found = true; } if (!com.found) { com.pred = node; }
	 * 
	 * if (node.data <= com.min) { com.min = node.data; } if (node.data >=
	 * com.max) { com.max = node.data; } if (node.children.size() == 0) {
	 * com.leafCount++; }
	 * 
	 * if (com.height < level) { com.height = level; }
	 * 
	 * for (Node n : node.children) { if (node.data > data && com.justlarger ==
	 * null) { com.justlarger = node; } else if (node.data > data && node.data <
	 * com.justlarger.data) { com.justlarger = node;
	 * 
	 * } this.multisolver(com, n, level + 1, data); }
	 * 
	 * }
	 * 
	 * private Node getTail(Node node) { Node temp = node; while
	 * (temp.children.size() != 0) { temp = temp.children.get(0); } return temp;
	 * }
	 * 
	 * ///////////////////////// Better /////////////////////////
	 * code///////////9i/////////////////////// private class HeapMover1 { Node
	 * head; Node tail;
	 * 
	 * HeapMover1(Node head, Node tail) { this.head = head; this.tail = tail; }
	 * }
	 * 
	 * public void linearbtr() { this.linearbtr(this.root);
	 * 
	 * }
	 * 
	 * private HeapMover1 linearbtr(Node node) { if (node.children.size() == 0)
	 * { return new HeapMover1(node, node); } HeapMover1 prev =
	 * this.linearbtr(node.children.get(0));
	 * 
	 * while (node.children.size() > 1) { // remove Node removed =
	 * node.children.remove(1); // linearize the removed one HeapMover1 curr =
	 * this.linearbtr(removed); // add prev.tail.children.add(removed); //
	 * update prev tail prev.tail = curr.tail; } // update prev head prev.head =
	 * node; return prev; }
	 * 
	 * ///////////////////////////////////////////////////////////
	 * 
	 * ///////////////////////////////////////////////// ////// TREE
	 * TRAVERSING/////////////////////////// public void preorder() {
	 * this.preorder(this.root); }
	 * 
	 * private void preorder(Node n) { System.out.println(n.data); for (Node
	 * child : n.children) { preorder(child); } }
	 * 
	 * public void preorderitereative() { LinkedList<Node> stack = new
	 * LinkedList<>(); stack.addFirst(this.root);// push while
	 * (!stack.isEmpty()) { Node temp = stack.removeFirst();// pop
	 * System.out.println(temp.data + ","); for (int i = temp.children.size() -
	 * 1; i >= 0; i--) { stack.addFirst(temp.children.get(i)); } }
	 * System.out.println("END"); }
	 * 
	 * public void postorder() { this.postorder(this.root); }
	 * 
	 * private void postorder(Node n) {
	 * 
	 * for (Node child : n.children) { postorder(child); }
	 * System.out.println(n.data); }
	 * 
	 * public void levelorder() { LinkedList<Node> queue = new LinkedList<>();
	 * queue.addLast(this.root); while (!queue.isEmpty()) { Node temp =
	 * queue.removeFirst(); System.out.println(temp.data + ","); for (Node child
	 * : temp.children) { queue.addLast(child); } } System.out.println("END"); }
	 * //////// TREE TRAVERSING/////////////////////////
	 * ///////////////////////////////////////////////
	 * 
	 * public Integer justLarger(int data) { Node jl = justLarger(this.root,
	 * data);
	 * 
	 * if (jl != null) { return jl.data; } else { return null; } }
	 * 
	 * private Node justLarger(Node node, int data) { Node rv = null;
	 * 
	 * if (node.data > data) { rv = node; }
	 * 
	 * for (int i = 0; i < node.children.size(); i++) { Node cjl =
	 * this.justLarger(node.children.get(i), data);
	 * 
	 * if (cjl == null) { continue; } else { if (rv == null) { rv = cjl; } else
	 * { if (cjl.data < rv.data) { rv = cjl; } } } }
	 * 
	 * return rv; }
	 * 
	 * public Integer justSmaller(int data) { Node jl = justSmaller(this.root,
	 * data);
	 * 
	 * if (jl != null) { return jl.data; } else { return null; } }
	 * 
	 * private Node justSmaller(Node node, int data) { Node rv = null;
	 * 
	 * if (node.data < data) { rv = node; }
	 * 
	 * for (int i = 0; i < node.children.size(); i++) { Node cjl =
	 * this.justSmaller(node.children.get(i), data);
	 * 
	 * if (cjl == null) { continue; } else { if (rv == null) { rv = cjl; } else
	 * { if (cjl.data > rv.data) { rv = cjl; } } } }
	 * 
	 * return rv; }
	 * 
	 * public int kthLargest(int k) { int rv = Integer.MAX_VALUE;
	 * 
	 * int counter = 0; while (counter < k) { rv = justSmaller(this.root,
	 * rv).data; counter++; }
	 * 
	 * return rv; }
	 * 
	 * public int kthSmallest(int k) { int rv = Integer.MIN_VALUE;
	 * 
	 * int counter = 0; while (counter < k) { rv = justLarger(this.root,
	 * rv).data; counter++; }
	 * 
	 * return rv; }
	 * 
	 * ///// The SONC code////////////////// ////////// SONC stands for sumof
	 * node and child//// /* but this is code is quite inefficient as in the
	 * getSONC code we are calculating the data of one node more than once that
	 * should be avoided in oreder to save the complexity
	 */
	public int maxSONC() {
		return this.maxSONC(this.root).data;
	}

	private Node maxSONC(Node node) {

		Node rv = node;
		for (Node child : node.children) {
			Node cmax = maxSONC(child);
			int cmaxscore = getSONC(cmax);
			int rvscore = getSONC(rv);
			if (cmaxscore > rvscore) {
				rv = cmax;
			}
		}
		return rv;
	}

	private int getSONC(Node node) {

		int rv = node.data;
		for (Node child : node.children) {
			rv += child.data;
		}
		return rv;
	}

	////////////////////////// Now BETTER code///////////
	/*
	 * here a heapmover object is made once each tym when sonc of a node is
	 * calculated which will make the code run once for each node not like the
	 * above one in which every node's SONC is calculated more than once
	 */
	private class HeapMover {
		Node node;
		int SONCscore;

		HeapMover(Node node) {
			this.node = node;
			this.SONCscore = getSONC(node);
		}
	}

	public int maxSONC2() {
		HeapMover mover = this.maxSONC2(this.root);
		return mover.node.data;
	}

	private HeapMover maxSONC2(Node node) {

		HeapMover rv = new HeapMover(node);
		for (Node child : node.children) {
			HeapMover cmax = maxSONC2(child);

			if (cmax.SONCscore > rv.SONCscore) {
				rv = cmax;
			}
		}
		return rv;
	}
	///////////////////////////////////////////////////////////

	/////////// Code to find the RANGE///////////////////////////
	private class HeapMover2 {
		int min;
		int max;

		HeapMover2(Node node) {
			this.min = node.data;
			this.max = node.data;
		}

		// for range2
		public HeapMover2() {
			this.min = Integer.MAX_VALUE;
			this.max = Integer.MIN_VALUE;
		}
	}

	public int range() {
		HeapMover2 mover = this.range(this.root);
		return mover.max - mover.min;
	}

	private HeapMover2 range(Node node) {
		HeapMover2 rv = new HeapMover2(node);
		for (int i = 0; i < node.children.size(); i++) {
			HeapMover2 val = this.range(node.children.get(i));
			if (rv.min > val.min) {
				rv.min = val.min;

			}
			if (rv.max < val.max) {
				rv.max = val.max;
			}
		}
		return rv;
	}

	///////////////////////////////////////////////////////
	///////////////// Much better range//////////////////////

	public int range2() {
		HeapMover2 mover = new HeapMover2();
		this.range2(this.root, mover);
		return mover.max - mover.min;
	}

	private void range2(Node node, HeapMover2 n) {
		if (node.data < n.min) {
			n.min = node.data;
		}
		if (node.data > n.max) {
			n.max = node.data;
		}
		for (Node child : node.children) {
			range2(child, n);
		}
	}

}
