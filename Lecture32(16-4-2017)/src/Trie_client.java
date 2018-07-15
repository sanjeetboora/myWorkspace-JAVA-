
public class Trie_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie one = new Trie();
		one.addWord("are");
		one.addWord("art");
		one.addWord("arts");
		one.addWord("sea");
		one.addWord("sell");
		one.addWord("buy");
		one.addWord("bug");
		one.addWord("but");
		one.addWord("be");
		one.display_as_tree();
		System.out.println(one.searchWord("art"));
		System.out.println(one.removeWord("art"));
		System.out.println(one.searchWord("art"));
		one.display_as_tree();
		one.display_all_words();
		one.display_all_words1();

	}

}
