
public class LinkedList_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		System.out.println(ll);
		ll.addLast(20);
		System.out.println(ll);
		ll.addFirst(30);
		System.out.println(ll);
		ll.addAt(40, 1);
		System.out.println(ll);
		ll.addFirst(50);
		System.out.println(ll);
		ll.addFirst(50);
		System.out.println(ll);
		ll.addFirst(50);
		System.out.println(ll);
		System.out.println(ll.getAt(2));
		System.out.println(ll.getFirst());
		ll.getLast();
		System.out.println(ll.getLast());
		//System.out.println(ll.removeAt(2));
		//System.out.println(ll);
		ll.addAt(30, 4);
		ll.addAt(30, 5);
		ll.addLast(20);
		System.out.println(ll);
//		ll.LL_Reverse_Data_Iterative();
//		System.out.println(ll);
//		ll.LL_Reverse_Pointer_Iterative();
//		System.out.println(ll);
//		ll.LL_Display_Reverse();
//		System.out.println(ll);
//		ll.LL_Reverse_Pointer_Recursive();
//		System.out.println(ll);
//		ll.Reverse_data_recursive();
//		System.out.println(ll);
//		//ll.find_N_in_LL();
//		ll.is_palindrome();
//		System.out.println(ll);
//		ll.fold();
//		System.out.println(ll);
		ll.remove_consecutive_duplicates();
		System.out.println(ll);
	}

}
