
public class BinaryTreeClieny {

	public static void main(String[] args) {
	//  50 true 25 true 12 false false true 37 true 30 false false true 40 false false true 75 true 62 true 60 false false true 70 false false true 87 false false		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		System.out.println(bt.getClass().getName());
		bt.display();
		
		System.out.println(bt.size2());
		System.out.println(bt.max());
		System.out.println(bt.height());
		System.out.println(bt.find(20));
		System.out.println(bt.find(25));
		System.out.println(bt.diameter());
		System.out.println(bt.diameter2());
		System.out.println(bt.is_balanced());
	}

}
