package Binary_search_tree;

public class Valid_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean ValidBST(TreeNode root) {
		return ValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private static boolean ValidBST(TreeNode root, long minValue, long maxValue) {

		if(root==null) return true;
		
        if(root.val<=minValue || root.val >=maxValue) return false;
		
		return ValidBST(root.left,minValue,root.val) && ValidBST(root.right,root.val,maxValue);
	}

}
