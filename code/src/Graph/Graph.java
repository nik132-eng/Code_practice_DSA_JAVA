package Graph;

import java.util.ArrayList;

public class Graph {
		ArrayList<ArrayList<Integer>> graph;
		int v;
		
		Graph(int nodes){
			v=nodes;
			graph = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<v;i++) {
				graph.add(new ArrayList<Integer>());
			}
		}
		
		void addEdge(int v,int u) {
			graph.get(v).add(u);
			graph.get(u).add(v);
		}
		
		void printGraph() {
			for(int i=0;i<v;i++) {
				System.out.print ("Node "+i);
				for(int x:graph.get(i)) System.out.print(" -> "+x);
				System.out.println();
			}
			
		}
}
