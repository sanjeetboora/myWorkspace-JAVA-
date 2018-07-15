
public interface IQueue {
int size();
boolean isEmpty();
void display();
void enqueue(int item);
int dequeue() throws Exception;
int top()throws Exception;

}
