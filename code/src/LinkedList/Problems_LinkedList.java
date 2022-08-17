package LinkedList;

import java.util.List;

public class Problems_LinkedList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(9);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(0);
//		ListNode n5 = new ListNode(0);
//		ListNode n6 = new ListNode(1);

		ListNode head1 = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		n4.next = n5;
//		n5.next = n3;
//		n5.next = n6;

		ListNode h1 = new ListNode(2);
		ListNode h2 = new ListNode(2);
		ListNode h3 = new ListNode(2);
		ListNode h4 = new ListNode(9);
//		ListNode h5 = new ListNode(1);
//		ListNode h6 = new ListNode(1);

		ListNode head2 = h1;
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
//		h4.next = h5;
//		h5.next = h3;
//		h5.next = h6;

//		ListNode ans = middleNode(head);
//		printLL(ans);

//		ListNode ans = removeNthFromEnd(head, 1);
//		printLL(ans);

//		ListNode ans = revers_LL_recursion(head);
//		printLL(ans);

//		1-> 2-> 3-> 4-> 5-> 6-> 7-> 8
//		3-> 2-> 1-> 6-> 5-> 4-> 8-> 7             where k=3

//		ListNode ans = reverse_k_node_LL(head,3);
//		printLL(ans);

//		boolean ans = hasCycle(head);
//		System.out.println(ans);

//		ListNode ans = findStarting_node(head);
//		System.out.println(ans.val);

//		ListNode ans = merge_Two_Shorted_LL(head1, head2);
//		printLL(ans);
		
		ListNode ans = linkedlist_addition(head1,head2);
		printLL(ans);
	}

	private static ListNode linkedlist_addition(ListNode head1, ListNode head2) {
		ListNode r1 = reverseLinkedList(head1); 
		ListNode r2 = reverseLinkedList(head2); 
//		printLL(r1);
//		printLL(r2);
		
		ListNode head = null ;
		int carry = 0;
		while(r1!=null || r2!=null || carry==1) {
			int sum=carry;
			if(r1!=null) {
				sum+=r1.val;
				r1=r1.next;
			}
			if(r2!=null) {
				sum+=r2.val;
				r2=r2.next;				
			} 
			
			int digit = sum%10;
			carry = sum/10;
			
			ListNode newNode = new ListNode(digit);
			if(head==null) head=newNode;
			else {
				newNode.next = head;
				head = newNode;
			}
			
		}
		return head;
	}

	private static ListNode merge_Two_Shorted_LL(ListNode head1, ListNode head2) {
		ListNode head=null, tail = null;
		ListNode a = head1, b = head2;

		if (a == null)
			return b;
		if (b == null)
			return a;

		if (a.val < b.val) {
			head = a;
			tail = a;
			a=a.next;
		} else {
			head = b;
			tail = b;
			b=b.next;
		}

		while (a != null && b != null) {
			if (a.val >= b.val) {
				tail.next = b;
				tail = b;
				b = b.next;
			} else {
				tail.next = a;
				tail = a;
				a = a.next;
			}
		}

		if (a == null)
			tail.next = b;
		if (b == null)
			tail.next = a;

		return head;
	}

	private static ListNode findStarting_node(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		ListNode temphead = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				ListNode ans = find_node(slow, temphead);
//				return findindex(ans, temphead);
				return ans;
			}
		}
		return null;
	}

//	private static ListNode findindex(ListNode ans,ListNode head) {
////		int 
//		while(head!=null && head.next!=null)
//		return null;
//	}

	private static ListNode find_node(ListNode slow, ListNode temphead) {
		while (slow != temphead) {
			slow = slow.next;
			temphead = temphead.next;
		}
		return slow;
	}

	@SuppressWarnings("null")
	private static boolean hasCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}

		return false;
	}

	private static ListNode reverse_k_node_LL(ListNode head, int k) {
		ListNode cur = head;
		ListNode newHead = null;
		ListNode prevFirst = null;
		int total = 0;
		ListNode tempp = cur;
		while (tempp != null) {
			tempp = tempp.next;
			total++;
		}
//		System.out.println(total);

		while (cur != null) {
			if (total < k)
				break;
			ListNode prev = null;
			ListNode first = cur;
			int count = 0;
			while (cur != null && count < k) {
				ListNode temp = cur.next;
				cur.next = prev;
				prev = cur;
				cur = temp;
				count++;
			}
			total -= k;

			if (newHead == null) {
				newHead = prev;
			} else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		if (cur != null) {
			prevFirst.next = cur;
		}
		return newHead;
	}

	private static ListNode revers_LL_recursion(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode temp = head.next;
		ListNode newHead = revers_LL_recursion(head.next);
		head.next = null;
		temp.next = head;
		return newHead;
	}

	private static ListNode reverseLinkedList(ListNode head) {
		ListNode cur = head;
		ListNode prev = null;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}

	public static ListNode removeNthFromEnd(ListNode heaad, int n) {

		ListNode head = reverseLinkedList(heaad);

		if (head.next == null)
			return null;
		ListNode cur = head;

		if (n == 1) {
			cur = cur.next;
			return reverseLinkedList(cur);

		} else {
			for (int i = 1; i < n - 1; i++) {
				cur = cur.next;
			}
			cur.next = cur.next.next;
		}
		return reverseLinkedList(head);
	}

	static void printLL(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.val + " -> ");
			cur = cur.next;
		}
		System.out.println("End");
	}

	public static ListNode middleNode(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
