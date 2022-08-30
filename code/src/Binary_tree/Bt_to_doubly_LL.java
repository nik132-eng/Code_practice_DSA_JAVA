package Binary_tree;

public class Bt_to_doubly_LL {

	public static void main(String[] args) {
		
	}
	
	Node prev = null,head=null;
	Node bToDLL(Node root) {
		bToDLLUtil(root);
		return head;
	}
	
	void bToDLLUtil(Node root) {
		if(root==null) return;
		
		bToDLLUtil(root.left);
		
		if(prev==null) {
			head=root;
		}else {
			root.left=prev;
			prev.right=root;
		}
		prev=root;
		
		bToDLL(root.right);
	}

}
