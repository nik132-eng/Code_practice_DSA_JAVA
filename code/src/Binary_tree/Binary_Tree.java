package Binary_tree;

import java.util.Scanner;

public class Binary_Tree{
	
	Scanner sc;
	TreeNode root;
	public Binary_Tree() {
		sc=new Scanner(System.in);
	}
	
	TreeNode createBinaryTree_leet() {
		System.out.println("Enter node data");
		int data = sc.nextInt();
		
		if(data==-1) return null;
		
		TreeNode node = new TreeNode(data);
		System.out.println("Enter "+data +"'s left data");
		node.left = createBinaryTree_leet();
		System.out.println("Enter "+data +"'s right data");
		node.right = createBinaryTree_leet();
		
		return node;
	}
	
		
	
}

//  Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      
  }
 
