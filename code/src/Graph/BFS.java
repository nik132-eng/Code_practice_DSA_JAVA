package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 4);

		System.out.println("-------Graph-------");
		g.printGraph();

		ArrayList<Integer> ans = bfsOfGraph(5, g.graph);
		System.out.println("\nBFS traversal :" + ans);
	}

	public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

		ArrayList<Integer> bfs = new ArrayList<>();
		boolean vis[] = new boolean[V];

		for (int i = 0; i < V; i++) {
			if (vis[i] == false) {
				Queue<Integer> q = new LinkedList<>();
				q.add(i);
				vis[i] = true;

				while (!q.isEmpty()) {
					Integer node = q.poll();
					bfs.add(node);
					for (Integer it : adj.get(node)) {
						if (vis[it] == false) {
							vis[it] = true;
							q.add(it);
						}
					}
				}
			}
		}

		return bfs;
	}

}
