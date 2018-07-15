
public class BinaryTreeClieny {

	public static void main(String[] args) {
		////  50 true 25 true 12 false false true 37 true 30 false false true 40 false false true 75 true 62 true 60 false false true 70 false false true 87 false false
	//50 true 25 true 12 false false true 37 true 30 false false true 40 false false true 75 true 62 true 60 false false
		// TODO Auto-generated method stub70 false
		int[]pre={50,25,12,37,30,40,75,62,60,70,87};
		int[]pre1={50,25,12,37,30,40,75,62,60};
		int[]post={12,30,40,37,25,60,70,62,87,75,50};
		int[]post1={12,30,40,37,25,60,62,75,50};
		int[]in={12,25,30,37,40,50,60,62,70,75,87};
		int[]in1={12,25,30,37,40,50,60,62,75};
		//BinaryTree bt = new BinaryTree();
	BinaryTree bt = new BinaryTree(pre,post);
		System.out.println(bt.getClass().getName());
		bt.display();
		
//		System.out.println(bt.size2());
//		System.out.println(bt.max());
//		System.out.println(bt.height());
//		System.out.println(bt.find(20));
//		System.out.println(bt.find(25));
//		System.out.println(bt.diameter());
//		System.out.println(bt.diameter2());
//		System.out.println(bt.is_balanced());
//		bt.postOrder();
//		bt.preOrder();
//		bt.inOrder();
		//bt.addRightNodes();
		bt.multisolver(37);
		bt.levelorder();
		bt.preorderI();
	}

}
