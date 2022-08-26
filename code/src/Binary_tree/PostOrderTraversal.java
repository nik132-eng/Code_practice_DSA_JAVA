package Binary_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

	public static void main(String[] args) {
		Binary_Tree bt = new Binary_Tree();
		TreeNode node = bt.createBinaryTree_leet();
		
		List<Integer> ans = postorderTraversal(node);
		System.out.println(ans);
	}

	public static List<Integer> postorderTraversal(TreeNode root) {
		 ArrayList<Integer> ans = new ArrayList<>();
		 ArrayDeque<TreeNode> s1 = new ArrayDeque<>();
		 ArrayDeque<TreeNode> s2 = new ArrayDeque<>();
			
		 s1.push(root);
		 while(!s1.isEmpty()) {
			 TreeNode pop = s1.pop();
			 
			 s2.push(pop);
			 if(pop.left!=null) {
				 s1.push(pop.left);
			 }
			 if(pop.right!=null) {
				 s1.push(pop.right);
			 }
		 }
		  
		 while(!s2.isEmpty()) {
			 ans.add(s2.pop().val);
		 }
		 return ans;
    }
}

