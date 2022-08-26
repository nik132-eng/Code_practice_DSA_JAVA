package Binary_tree;

import java.util.List;

public class Diameter_of_binaryTree {

	public static void main(String[] args) {
		Binary_Tree bt = new Binary_Tree();
		TreeNode node = bt.createBinaryTree_leet();
		
		int ans = diameterOfBinaryTree(node);
		System.out.println(ans);
	}
	
	public static int diameterOfBinaryTree(TreeNode root) {
	    if(root==null) return 0;
	    
	    int ld = diameterOfBinaryTree(root.left);
	    int rd = diameterOfBinaryTree(root.right);
	    
	    int lh = height(root.left);
	    int rh = height(root.right);
	    
		int cur = lh + rh;
		return Math.max(Math.max(ld, rd), cur);
    }

	private static int height(TreeNode root) {
		if(root==null) return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		return Math.max(lh, rh)+1;
	}

}
