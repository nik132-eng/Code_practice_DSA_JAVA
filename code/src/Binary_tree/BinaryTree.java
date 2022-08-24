package Binary_tree;

import java.util.Scanner;

public class BinaryTree {

	Scanner sc;
	Node root;
	
	public BinaryTree() {
		sc=new Scanner(System.in);
	}

	//create binary tree and return the root node	
	Node createBinaryTree() {
		System.out.println("Enter node data");
		int data = sc.nextInt();
		
		if(data==-1) return null;
		
		Node node = new Node(data);
		System.out.println("Enter "+data +"'s left data");
		node.left = createBinaryTree();
		System.out.println("Enter "+data +"'s right data");
		node.right = createBinaryTree();
		
		return node;
	}
	
	void inorderTraversal(Node root) {
		if(root==null) return;
		
		// LNR
		inorderTraversal(root.left);   // left
		System.out.println(root.data); // Data
		inorderTraversal(root.right);  // Right
		
	}
	
	void preOrderTraversal(Node root) {
		if(root==null) return;
		
		// NLR
		System.out.println(root.data);  // data
		preOrderTraversal(root.left);    // left
		preOrderTraversal(root.right);   // right
		
	}
	
	void postOrderTraversal(Node root) {
		if(root==null) return;
		
		// LRN
		postOrderTraversal(root.left);    // left
		postOrderTraversal(root.right);   // right
		System.out.println(root.data);  // data
		
	}
	
	int HeightOfBinaryTree(Node root) {
		if(root==null) return 0;
		
		int lh= HeightOfBinaryTree(root.left);
		int rh= HeightOfBinaryTree(root.right);
		
		return Math.max(lh, rh) + 1;
	}
	
	void printNodes_K_Distance(Node root,int k) {
		if(root==null) return ;
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		printNodes_K_Distance(root.left, k-1);
		printNodes_K_Distance(root.right, k-1);
	}
}

class Node{
	
	int data;
	Node left,right;
	
	public Node(int data) {
		this.data=data;
	}
}
