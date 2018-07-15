package Lecture32;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GraphClient {

	public static void main(String[] args) throws Exception {
		Graph g = new Graph();

		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");

		g.addEdge("A", "B", 40);
		g.addEdge("D", "A", 10);
		g.addEdge("D", "C", 10);
		g.addEdge("C", "E", 2);
		g.addEdge("F", "E", 4);
		g.addEdge("F", "G", 2);
		g.addEdge("E", "G", 8);
		g.display();
		
		// println(g.numEdges());
//		System.out.println(g.HasPath("G", "A"));
//		// g.removeEdge("F", "E");
//		System.out.println(g.HasPath("A", "G"));
//		g.bft();
//		System.out.println("***");
//		g.dft();
//		System.out.println(g.getConnected());
//		System.out.println(g.isBipartite());
//		System.out.println("-**-");
//		// g.removeEdge("A", "B");
//		System.out.println(g.IsAcyclic());
		HashMap<String, Integer> map=g.dijikstra("A");
		Set<Map.Entry<String, Integer>> allEntries=map.entrySet();
		for(Map.Entry<String, Integer> entry:allEntries){
			System.out.print(entry.getKey()+",");
			System.out.print(entry.getValue());
			System.out.println();
		}

	}

}
