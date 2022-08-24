package Binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Right_side_view {

	public static void main(String[] args) {
		Binary_Tree btree = new Binary_Tree();
		TreeNode root = btree.createBinaryTree_leet();
		
		List<Integer> ans = rightSideView(root);
		System.out.println(ans);
		
	}
	
	 public static List<Integer> rightSideView(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
		int level=0;
		rightSideView(root,level,ans);
		return ans; 
	 }

	private static void rightSideView(TreeNode root, int level, ArrayList<Integer> ans) {
		if(root==null) return;
		
		if(ans.size()==level) {
			ans.add(root.val);
		}
		
		rightSideView(root.right,level+1,ans);
		rightSideView(root.left,level+1,ans);
		
	}

}
