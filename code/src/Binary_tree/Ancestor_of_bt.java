package Binary_tree;

import java.util.ArrayList;

public class Ancestor_of_bt {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Node root = bt.createBinaryTree();
		ArrayList<Integer> ans = Ancestors(root, 7);
		System.out.println(ans);
	}
	
	public static ArrayList<Integer> Ancestors(Node root,int target){
		
		ArrayList<Integer> ans = new ArrayList<>();
		isPresent(root,target,ans);
		return ans;
	}

	private static boolean isPresent(Node root, int target, ArrayList<Integer> ans) {
		
		if(root==null) return false;
		if(root.data==target) return true;
		if(isPresent(root.left, target, ans) || isPresent(root.right, target, ans)) {
			ans.add(root.data);
			return true;
		}
		return false;
	}

}
