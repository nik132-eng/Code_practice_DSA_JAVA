package Binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Left_side_view {

	public static void main(String[] args) {
		Binary_Tree btree = new Binary_Tree();
		TreeNode root = btree.createBinaryTree_leet();
		
		List<Integer> ans = leftSideView(root);
		System.out.println(ans);
	}

	 public static List<Integer> leftSideView(TreeNode root) {
			ArrayList<Integer> ans = new ArrayList<>();
			int level=0;
			leftSideView(root,level,ans);
			return ans; 
		 }

		private static void leftSideView(TreeNode root, int level, ArrayList<Integer> ans) {
			if(root==null) return;
			
			if(ans.size()==level) {
				ans.add(root.val);
			}
			
			leftSideView(root.left,level+1,ans);
			leftSideView(root.right,level+1,ans);
			
		}
		
}
