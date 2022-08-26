package Binary_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Inorder_traversal {

	public static void main(String[] args) {
		Binary_Tree bt = new Binary_Tree();
		TreeNode node = bt.createBinaryTree_leet();
		
		List<Integer> ans = inorderTraversal(node);
		System.out.println(ans);
	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		ArrayDeque<TreeNode> stack = new ArrayDeque<>();
		
		TreeNode cur = root;
		
		while(cur!=null || !stack.isEmpty()) {
			while(cur!=null) {
				stack.push(cur);
				cur=cur.left;
			}
			
			TreeNode pop = stack.pop();
			ans.add(pop.val);
			
			cur = pop.right;
		}
		return ans;
    }

}
