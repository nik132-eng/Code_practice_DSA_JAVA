package Binary_tree;

import java.util.ArrayList;

public class Lowest_Ancestor_of_bt {

	public static void main(String[] args) {

		Binary_Tree bt = new Binary_Tree();
		TreeNode root = bt.createBinaryTree_leet();

//		TreeNode ans = lowestCommonAncestor(root,1,3);
//		System.out.println(ans);
		
	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
		
		if(root==null) return null;
		if(root.val==p.val || root.val==q.val) return root;
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(right==null) return left;
		if(left==null) return right;
		
		return root;
//		---------------------------------------------------------------------------------
		
//		ArrayList<TreeNode> l1 = new ArrayList<>();
//		ArrayList<TreeNode> l2 = new ArrayList<>();
//		
//		isPresent(root, p.val, l1);
//		isPresent(root, q.val, l2);
//		
//		int i=l1.size();
//		int j=l2.size();
//		
//		while(i >= 0 && j>=0 && l1.get(i).val==l2.get(j).val) {
//			i--;
//			j--;
//		}
//		
//		if(i==l1.size()) return null;
//		return l1.get(i+1);
	}
	
	private static boolean isPresent(TreeNode root, int target, ArrayList<TreeNode> l1) {
		
		if(root==null) return false;
		if(root.val==target) return true;
		if(isPresent(root.left, target, l1) || isPresent(root.right, target, l1)) {
			l1.add(root);
			return true;
		}
		return false;
	}

}
