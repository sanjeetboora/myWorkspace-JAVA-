
public class Queue_using_ll_client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 IQueue queue=new Queue_using_LL();
		 queue.enqueue(10);
		 queue.enqueue(20);
		 queue.enqueue(30);
		 queue.display();
		 queue.dequeue();
		 queue.display();
	System.out.println( queue.size());
		
	}

}
