package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Binary_tree_vertical_order {

	public static void main(String[] args) {
		BinaryTree btree = new BinaryTree();
		Node root = btree.createBinaryTree();
		
		ArrayList<Integer> ans = verticalOrder(root);
		System.out.println(ans);
	}

	static ArrayList<Integer> verticalOrder(Node root){
		if(root==null) return null;
		Map<Integer,ArrayList<Integer>> map = new TreeMap<>(); 
		Queue<Pair> q = new LinkedList<>();
		
		q.add(new Pair(0,root));
		
		while(!q.isEmpty()) {
			Pair cur = q.poll();
			int key = cur.hd;
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<Integer>());
			}
			map.get(key).add(cur.node.data);
			
			if(cur.node.left!=null) {
				q.add(new Pair(key-1,cur.node.left));
			}
			if(cur.node.right!=null) {
				q.add(new Pair(key-1,cur.node.right));
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(ArrayList<Integer> e : map.values()) {
			ans.addAll(e);
		}
		
		return ans;
	}
	
	static class Pair{
		int hd;
		Node node;
		
		public Pair(int hd,Node node) {
			this.hd=hd;
			this.node=node;
		}
	}
}
