package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree_Level_Order_Traversal {
		
	
	public static void main(String[] args) {
		Binary_Tree btree = new Binary_Tree();
		TreeNode root = btree.createBinaryTree_leet();
		
		List<List<Integer>> ans = levelOrder(root);
		
		System.out.println(ans);
	}
	
	 public static List<List<Integer>> levelOrder(TreeNode root) {
			
		 List<List<Integer>> ans = new ArrayList<List<Integer>>();
		 if(root == null) return ans;
		 Queue<TreeNode> q = new LinkedList<>();
		 q.add(root);
		 q.offer(null);
		 
		 ArrayList<Integer> curList = new ArrayList<>();
		 
		 while(!q.isEmpty()) {
			 TreeNode cur = q.poll();
			 if(cur==null) {
				 ans.add(curList);
				 if(q.isEmpty()) return ans;
				 q.offer(null);
				 curList = new ArrayList<>();
			 }else {
				 curList.add(cur.val);
				 
				 if(cur.left != null ) {
					 q.add(cur.left);
				 }
				 if(cur.right != null) {
					 q.add(cur.right);
				 }
			 }
			 
		 }
		 return ans;   
	    }
}
