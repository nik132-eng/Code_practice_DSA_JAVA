package Queue;

public class Queue_using_Array {
	
	int front=-1,rear=-1;
	int a[];
	int n;
	
	public Queue_using_Array(int n) {
		a=new int[n];
		this.n=n;
	}
	
	void enqueue(int data) throws Exception {
		if(isFull()) throw new Exception("Queue Array is Full"); 
		if(isEmpty()) {
			front=0;
		}
		rear++;
		a[rear]=data;
	}
	
	int dequeue() throws Exception{
		if(isEmpty()) throw new Exception("Queue Array is Empty");
		int ans=a[front];  //front is always zero
		
		if(front==rear) {
			ans=a[front];
			front=-1;
			rear=-1;
		}
		
		for(int i=0;i<rear;i++) {
			a[i]=a[i+1];
		}
		rear--;
		
		return ans;
	}
	
	private boolean isFull() {
		return rear==n-1;
	}
	
	private boolean isEmpty() {
		return front==-1;
	}
	
	
	
}
