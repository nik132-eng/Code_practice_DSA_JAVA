package LinkedList;

public class Flattered_LinkedList {


//Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root){
        Node cur = root, last= root;
        
        while(cur!=null){
            while(last.next!=null){
                last = last.next;
            }
            if(cur.bottom!=null){
                last.next = cur.bottom;
            }
            cur = cur.next;
        }
        return root;
    }
}
}
