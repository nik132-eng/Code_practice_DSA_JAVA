package Heap;

public class MainClass {

	public static void main(String[] args) throws Exception {
//		Minheap minHeap = new Minheap(4);
//
//		minHeap.insert(2);
//		minHeap.insert(10);
//		minHeap.insert(15);
//		minHeap.insert(1);
//	
//		minHeap.printHeap();

		int a[] = {0,2,9,4,7,1,6,8};
		Minheap minheap = new Minheap(a);
		minheap.printHeap();
		
		minheap.heapSort();
	}

}
