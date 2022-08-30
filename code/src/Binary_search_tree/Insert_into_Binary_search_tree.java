package Binary_search_tree;

public class Insert_into_Binary_search_tree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		insertIntoBST(root, 5);
		

	}
	
	public static TreeNode insertIntoBST(TreeNode root, int key) {
		  TreeNode cur = root, parent=null;
			while(cur!=null) {
				if(cur.val<key) {
					parent=cur;
					cur=cur.right;
				}else if(cur.val>key) {
					parent=cur;
					cur=cur.left;
				}
			}
			TreeNode newNode = new TreeNode(key);
			if(parent==null) return newNode;
			
			if(key>parent.val) {
				parent.right=newNode;
			}else if(key < parent.val){
				parent.left=newNode;
			}
			return root;
    }

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}