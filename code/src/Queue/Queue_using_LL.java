package Queue;

public class Queue_using_LL {

	Node front,rear;

	void enqueue(int data) {
		Node newNode = new Node(data); 
		if(isEmpty()) {
			front=rear=newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
	}
	
	boolean isEmpty() {
		return front==null;
	}
	
	
	int dequeue() throws Exception{
		if(isEmpty()) throw new Exception("Queue is Empty");
		int ans = front.data;
		front=front.next;
		return ans;
	}
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
		
	}
	
}
