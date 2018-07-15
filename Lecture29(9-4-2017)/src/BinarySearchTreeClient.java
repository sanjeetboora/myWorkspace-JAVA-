
public class BinarySearchTreeClient {

	public static void main(String[] args) {
		// 50 true 25 true 12 false false true 37 true 30 false false true 40
		// false false true 75 true 62 true 60 false false true 70 false false
		// true 87 false false
	
		// TODO Auto-generated method stub70 false
	
		BinarySearchTree bt = new BinarySearchTree(12,25,30,33,37,40,50,60,62,70,72,75,87);
		// BinaryTree bt = new BinaryTree(pre,post);
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
		 bt.postOrder();
		 bt.preOrder();
		 bt.inOrder();
		
		 bt.multisolver(37);
		 bt.levelorder();
		 bt.preorderI();
		bt.addelement(100);
		bt.addelement(32);
		bt.addelement(10);
		bt.display();
		bt.removeelement(50);
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		bt.display();
	}

}
