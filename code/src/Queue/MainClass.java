package Queue;

public class MainClass {

	public static void main(String[] args) throws Exception {
//		Queue_LL qll = new Queue_LL();
//
//		qll.enqueue(10);
//		qll.enqueue(20);
//		qll.enqueue(30);
//		qll.enqueue(40);
//		qll.enqueue(50);
//
//		System.out.println(qll.dequeue());
//		System.out.println(qll.dequeue());
//		System.out.println(qll.dequeue());
//		System.out.println(qll.dequeue());
//		System.out.println(qll.dequeue());
//		System.out.println(qll.dequeue());

		
//		Queue_using_Array qa = new Queue_using_Array(5);
//		qa.enqueue(10);
//		qa.enqueue(20);
//		qa.enqueue(30);
//		qa.enqueue(40);
//		qa.enqueue(50);
//
//		System.out.println(qa.dequeue());
//		System.out.println(qa.dequeue());
//		System.out.println(qa.dequeue());
//		System.out.println(qa.dequeue());
//		System.out.println(qa.dequeue());
//		System.out.println(qa.dequeue());
	
	

		Queue_using_circularArray qca = new Queue_using_circularArray(5);
		qca.enqueue(10);
		qca.enqueue(20);
		qca.enqueue(30);

		System.out.println(qca.dequeue());
		System.out.println(qca.dequeue());
		qca.enqueue(50);
		System.out.println(qca.dequeue());
		qca.enqueue(40);
		System.out.println(qca.getsize());
		System.out.println(qca.dequeue());
		System.out.println(qca.dequeue());
	
	}

}
