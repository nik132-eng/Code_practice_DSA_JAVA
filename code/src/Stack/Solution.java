package Stack;

public class Solution {

	public static void main(String[] args) throws Exception {
		
//		Two_stacks obj = new Two_stacks(5);
//		obj.push1(10);
//		obj.push1(20);
//		obj.push1(30);
//		
//		obj.push2(40);
//		obj.push2(60);
//
//		System.out.println(obj.pop1());
//		System.out.println(obj.pop1());
//		System.out.println(obj.pop1());
//		System.out.println(obj.pop2());
		
		MinStack obj = new MinStack();
		obj.push(10);
		obj.push(20);
		System.out.println(obj.min());
	}

}
