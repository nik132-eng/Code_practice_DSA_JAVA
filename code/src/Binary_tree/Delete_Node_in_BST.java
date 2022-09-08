package Binary_tree;

public class Delete_Node_in_BST {

	public static void main(String[] args) {
		
	}
	
	public static TreeNodee deleteNode(TreeNodee root, int key) {
		if(root == null) return root;
		
		if(key<root.val) {
			root.left = deleteNode(root.left, key);
		}else if(key>root.val) {
			root.right=deleteNode(root.right, key);
		}else {
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			
			root.val = minvalue(root.right);
			root.right = deleteNode(root.right, root.val);
		}
		return root;
    }

	private static int minvalue(TreeNodee root) {
		int minv = root.val;
		while(root.left!=null) {
			minv= root.left.val;
			root=root.left;
		}
		return minv;
	}

	
}

//Definition for a binary tree node.
class TreeNodee {
  int val;
  TreeNodee left;
  TreeNodee right;
  TreeNodee() {}
  TreeNodee(int val) { this.val = val; }
  TreeNodee(int val, TreeNodee left, TreeNodee right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
  
}
