package Binary_tree;

public class MainClass {

	public static void main(String[] args) {
		BinaryTree btree = new BinaryTree();
		Node root = btree.createBinaryTree();
		
		btree.inorderTraversal(root);
	}

}
