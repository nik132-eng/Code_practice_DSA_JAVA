package Binary_search_tree;

public class Find_Distance_between_two_Nodes {

	public static void main(String[] args) {
		
	}
	
	static int findDistance(Node root,int a,int b) {
		
		if(root==null) return 0;
		
		if(a<root.data && b<root.data) return findDistance(root.left, a, b);
		
		if(a>root.data && b>root.data) return findDistance(root.right, a, b);
		
		return distance(root,a);
		
	}

	private static int distance(Node root, int a) {
		if(root.data==a) return 0;
		
		if(root.data>a) return 1+distance(root.left, a);
		return 1+distance(root.right, a);
	}

}
