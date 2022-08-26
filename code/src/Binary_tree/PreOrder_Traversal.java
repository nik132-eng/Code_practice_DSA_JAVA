package Binary_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PreOrder_Traversal {

	public static void main(String[] args) {
		Binary_Tree bt = new Binary_Tree();
		TreeNode node = bt.createBinaryTree_leet();
		
		List<Integer> ans = preorderTraversal(node);
		System.out.println(ans);
	}
	
	 public static List<Integer> preorderTraversal(TreeNode root) {
		 ArrayList<Integer> ans = new ArrayList<>();

		 if(root==null) return ans;
		 
		 ArrayDeque<TreeNode> stack = new ArrayDeque<>();
 		 stack.push(root);
		 while(!stack.isEmpty()) {
			 
			 TreeNode pop = stack.pop();
			 ans.add(pop.val);
			 
			 if(pop.right!=null) {
				 stack.push(pop.right);
			 }
			 if(pop.left!=null) {
				 stack.push(pop.left);
			 }			 
		 }
		 return ans;    
	    }

}
