import java.util.HashMap;
import java.util.Set;

public class Trie {
	private class Node {
		Character ch;
		Boolean eow;
		HashMap<Character, Node> children;

		Node(Character ch, Boolean eow) {
			this.ch = ch;
			this.eow = eow;
			this.children = new HashMap<Character, Node>();
		}
	}

	private Node root;
	private int size;
	private int numWords;

	public Trie() {
		this.root = new Node('$', false);
		this.size = 1;
		this.numWords = 0;

	}

	public void addWord(String word) {
		this.addWord(this.root, word);
	}

	private void addWord(Node node, String word) {
		if (word.length() == 0) {
			if (node.eow) {

			} else {
				node.eow = true;
				this.numWords++;
			}
			return;
		}
		Character ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			child = new Node(ch, false);
			this.size++;
			node.children.put(ch, child);

		}
		this.addWord(child, ros);

	}

	public boolean searchWord(String word) {
		return this.searchWord(this.root, word);
	}

	private boolean searchWord(Node node, String word) {
		if (word.length() == 0) {
			if (node.eow) {
				return true;

			} else {
				return false;
			}
		}
		char ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			return false;

		}
		return this.searchWord(child, ros);

	}

	public boolean removeWord(String word) {
		return this.removeWord(this.root, word);
	}

	private boolean removeWord(Node node, String word) {
		if (word.length() == 0) {
			if (node.eow) {
				node.eow = false;
				this.numWords--;
				return true;

			} else {
				return false;
			}

		}
		char ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			return false;

		}
		boolean rv = this.removeWord(child, ros);
		if (!child.eow && child.children.size() == 0) {
			node.children.remove(ch);
			this.size--;
		}
		return rv;

	}

	public void display_as_tree() {
		System.out.println("````````````````````````````````````````");
		display_as_tree(this.root);
		System.out.println("````````````````````````````````````````");
	}

	private void display_as_tree(Node node) {

		// System.out.println(node.ch + " => ");
		String str = "";
		str += node.ch + " => " + node.eow + " =>";
		Set<Character> keys = node.children.keySet();
		for (Character key : keys) {
			str += key + " => " + node.children.get(key).eow + " =>";

		}
		str += "End";
		System.out.println(str);
		for (Character key : keys) {
			this.display_as_tree(node.children.get(key));
		}
	}

	public void display_all_words() {
		System.out.println("////////////////////////////////////////////");
		display_all_words(this.root, "");
		System.out.println("////////////////////////////////////////////");
	}

	private void display_all_words(Node node, String osf) {
		if (node.eow) {
			System.out.println(osf);
		}

		Set<Character> keys = node.children.keySet();

		for (Character key : keys) {
			Node child = node.children.get(key);
			this.display_all_words(child, osf + child.ch);

		}

	}

	public void display_all_words1() {
		System.out.println("////////////////////////////////////////////");
		display_all_words1(this.root, "");
		System.out.println("////////////////////////////////////////////");
	}

	private void display_all_words1(Node node, StringBuilder osf) {
		if (node.eow) {
			System.out.println(osf);
		}

		Set<Character> keys = node.children.keySet();

		for (Character key : keys) {
			Node child = node.children.get(key);
			osf.append(child.ch);
			this.display_all_words1(child, osf);

		}

	}

}
