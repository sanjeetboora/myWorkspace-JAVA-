package Lecture32;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;



import java.util.Set;

public class Graph {

	private class Edge {
		Vertex one;
		Vertex two;
		int weight;

		Edge(Vertex one, Vertex two, int weight) {
			this.one = one;
			this.two = two;
			this.weight = weight;
		}
	}

	private class Vertex {
		String name;
		HashMap<Vertex, Edge> neightbours;

		Vertex(String name) {
			this.name = name;
			this.neightbours = new HashMap<>();
		}

		@Override
		public boolean equals(Object other) {
			Vertex ov = (Vertex) other;
			return this.name.equals(ov.name);
		}

		@Override
		public int hashCode() {
			return this.name.hashCode();
		}
	}

	private HashMap<String, Vertex> vertices;

	public Graph() {
		this.vertices = new HashMap<>();
	}

	public int numVertices() {
		return this.vertices.size();
	}

	private Vertex getVertex(String v) {
		return this.vertices.get(v);
	}

	public boolean containsvertex(String v) {
		Vertex vtx = this.getVertex(v);
		if (vtx != null)
			return true;
		else
			return false;
	}

	public void addVertex(String v) {
		if (this.containsvertex(v)) {
			return;
		}
		Vertex vtx = new Vertex(v);
		this.vertices.put(v, vtx);
	}

	public void removeVertex(String v) {
		if (!this.containsvertex(v)) {
			return;
		}
		Vertex vtx = this.getVertex(v);
		Set<Vertex> nbrvertices = vtx.neightbours.keySet();
		for (Vertex nbrvtx : nbrvertices) {
			nbrvtx.neightbours.remove(vtx);
		}
		this.vertices.remove(v);
	}

	public int numEdges() {
		int rv = 0;
		Collection<Vertex> allVertices = this.vertices.values();
		for (Vertex vtx : allVertices) {
			rv += vtx.neightbours.size();
		}
		return rv / 2;
	}

	public boolean containsEdge(String v1, String v2) {
		Vertex vtx1 = this.getVertex(v1), vtx2 = this.getVertex(v2);
		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		
		return vtx1.neightbours.containsKey(vtx2);

	}

	public void addEdge(String v1, String v2, int weight) {
		Vertex vtx1 = this.getVertex(v1), vtx2 = this.getVertex(v2);
		if (vtx1 == null || vtx2 == null || this.containsEdge(v1, v2)) {
			return;
		}
		Edge commonedge = new Edge(vtx1, vtx2, weight);
		vtx1.neightbours.put(vtx2, commonedge);
		vtx2.neightbours.put(vtx1, commonedge);

	}

	public void removeEdge(String v1, String v2) {
		Vertex vtx1 = this.getVertex(v1), vtx2 = this.getVertex(v2);
		if (vtx1 == null || vtx2 == null || !this.containsEdge(v1, v2)) {
			return;
		}
		vtx1.neightbours.remove(vtx2);
		vtx2.neightbours.remove(vtx1);
	}
	

	public void display() {
		Set<Map.Entry<String, Vertex>> allEntries = this.vertices.entrySet();
		for (Map.Entry<String, Vertex> entry : allEntries) {
			Vertex vtx = entry.getValue();
			String toPrint = vtx.name + "=>";
			Set<Vertex> nbrs = vtx.neightbours.keySet();
			for (Vertex nbr : nbrs) {
				toPrint += nbr.name + ", ";
			}
			toPrint += "END";
			System.out.println(toPrint);
		}
	}

	HashMap<Vertex, Boolean> check = new HashMap<>();

	public boolean haspath1(String v1, String v2) {

		Vertex vtx1 = this.getVertex(v1), vtx2 = this.getVertex(v2);

		if (this.containsEdge(v1, v2))
			return true;
		else {
			check.put(vtx1, true);
			Set<Vertex> nbrs = vtx1.neightbours.keySet();
			for (Vertex nbr : nbrs) {
				if (!check.containsKey(nbr)) {
					check.put(nbr, true);
					if (haspath1(nbr.name, v2))
						return true;
				}

			}

		}
		return false;
	}

	public boolean HasPath(String v1, String v2) throws Exception {
		Vertex vtx1 = this.getVertex(v1);
		Vertex vtx2 = this.getVertex(v2);

		if (vtx1 == null || vtx2 == null)
			return false;
		else {
			// HashMap<Vertex, Boolean> visited = new HashMap<>();
			// visited = new HashMap<>();
			// visited.put(vtx1, true);
			return this.HasPathDFSI(vtx1, vtx2);
		}
	}

	private boolean HasPathDFS(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> visited) {
		if (v1.neightbours.containsKey(v2)) {
			return true;
		}
		Set<Vertex> nbrs = v1.neightbours.keySet();
		for (Vertex nbr : nbrs) {
			if (!visited.containsKey(nbr)) {
				visited.put(nbr, true);
				if (this.HasPathDFS(nbr, v2, visited)) {
					return true;

				}
			}
		}
		return false;

	}

	private boolean HasPathBFS(Vertex v1, Vertex v2) throws Exception {
		HashMap<Vertex, Vertex> visited = new HashMap<>();
		LinkedList<Vertex> Queue = new LinkedList<>();
		visited.put(v1, v1);
		Queue.addLast(v1);

		while (!Queue.isEmpty()) {
			Vertex vtx = Queue.removeFirst();
			if (vtx.neightbours.containsKey(v2))
				return true;
			Set<Vertex> nbrs = vtx.neightbours.keySet();
			for (Vertex nbr : nbrs) {
				if (!visited.containsKey(nbr)) {
					visited.put(nbr, nbr);
					Queue.addLast(nbr);
				}
			}
		}
		return false;
	}

	private boolean HasPathDFSI(Vertex v1, Vertex v2) throws Exception {
		HashMap<Vertex, Vertex> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		visited.put(v1, v1);
		Stack.addFirst(v1);

		while (!Stack.isEmpty()) {
			Vertex vtx = Stack.removeFirst();
			if (vtx.neightbours.containsKey(v2))
				return true;
			Set<Vertex> nbrs = vtx.neightbours.keySet();
			for (Vertex nbr : nbrs) {
				if (!visited.containsKey(nbr)) {
					visited.put(nbr, nbr);
					Stack.addFirst(nbr);
				}
			}
		}
		return false;
	}

	public void bft() throws Exception {
		HashMap<Vertex, Vertex> visited = new HashMap<>();
		LinkedList<Vertex> Queue = new LinkedList<>();
		Collection<Vertex> allVertices = this.vertices.values();
		for (Vertex vtx : allVertices) {
			if (!visited.containsKey(vtx)) {
				visited.put(vtx, vtx);
				Queue.addLast(vtx);
			}
			while (!Queue.isEmpty()) {
				Vertex vtx2 = Queue.removeFirst();
				System.out.println(vtx2.name);

			}
		}

	}

	public void dft() throws Exception {
		HashMap<Vertex, Vertex> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		Collection<Vertex> allVertices = this.vertices.values();
		for (Vertex vtx : allVertices) {
			if (!visited.containsKey(vtx)) {
				visited.put(vtx, vtx);
				Stack.addFirst(vtx);
			}
			while (!Stack.isEmpty()) {
				Vertex vtx2 = Stack.removeFirst();
				System.out.println(vtx2.name);
				Set<Vertex> nbrs = vtx2.neightbours.keySet();
				for (Vertex nbr : nbrs) {
					if (!visited.containsKey(nbr)) {
						visited.put(nbr, nbr);

						Stack.addFirst(nbr);
					}
				}

			}
		}

	}

	public boolean isConnected() {
		HashMap<Vertex, Vertex> visited = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		Vertex[] allvertices = new Vertex[this.vertices.size()];
		this.vertices.values().toArray(allvertices);
		visited.put(allvertices[0], allvertices[0]);
		queue.addLast(allvertices[0]);
		while (!queue.isEmpty()) {
			Vertex vtx = queue.removeFirst();

			Set<Vertex> nbrs = vtx.neightbours.keySet();
			for (Vertex nbr : nbrs) {
				if (!visited.containsKey(nbr)) {
					visited.put(nbr, nbr);
					queue.addLast(nbr);
				}
			}
		}
		return this.vertices.size() == visited.size();
	}

	public ArrayList<ArrayList<String>> getConnected() {
		ArrayList<ArrayList<String>> rv = new ArrayList<>();

		HashMap<Vertex, Vertex> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		Collection<Vertex> allVertices = this.vertices.values();
		for (Vertex vtx : allVertices) {
			if (!visited.containsKey(vtx)) {
				ArrayList<String> x = new ArrayList<>();

				visited.put(vtx, vtx);

				Stack.addFirst(vtx);

				while (!Stack.isEmpty()) {
					Vertex vtx2 = Stack.removeFirst();
					x.add(vtx2.name);
					Set<Vertex> nbrs = vtx2.neightbours.keySet();
					for (Vertex nbr : nbrs) {
						if (!visited.containsKey(nbr)) {
							visited.put(nbr, nbr);

							Stack.addFirst(nbr);
						}
					}
				}
				rv.add(x);

			}
		}

		return rv;
	}

	public boolean isBipartite() {
		HashMap<Vertex, String> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		Collection<Vertex> allVertices = this.vertices.values();
		for (Vertex vtx : allVertices) {
			if (!visited.containsKey(vtx)) {
				visited.put(vtx, "RED");
				Stack.addFirst(vtx);
			}
			while (!Stack.isEmpty()) {
				Vertex vtx2 = Stack.removeFirst();
				Set<Vertex> nbrs = vtx2.neightbours.keySet();
				for (Vertex nbr : nbrs) {
					String covtx = visited.get(vtx2);
					String CtoApplyonNbr = covtx.equals("RED") ? "Green" : "RED";
					if (!visited.containsKey(nbr)) {
						visited.put(nbr, CtoApplyonNbr);

						Stack.addFirst(nbr);
					} else {
						String actualAcoNbr = visited.get(nbr);
						if (actualAcoNbr.equals(CtoApplyonNbr))
							continue;
						else
							return false;
					}
				}

			}
		}
		return true;
	}

	public boolean IsBipartite1() {

		Boolean b = true;
		HashMap<Vertex, Boolean> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		Collection<Vertex> allVertices = this.vertices.values();
		for (Vertex vtx : allVertices) {
			if (!visited.containsKey(vtx)) {
				visited.put(vtx, b);
				Stack.addFirst(vtx);
				while (!Stack.isEmpty()) {
					vtx = Stack.removeFirst();

					b = visited.get(vtx);

					Set<Vertex> nbrs = vtx.neightbours.keySet();
					for (Vertex nbr : nbrs) {
						if (!visited.containsKey(nbr)) {
							visited.put(nbr, !b);
							Stack.addFirst(nbr);
						} else if (visited.get(nbr) != (!b))
							return false;
					}
				}
			}

		}
		return true;
	}

	public boolean IsAcyclic() throws Exception {
		HashMap<Vertex, Vertex> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		Collection<Vertex> allVertices = this.vertices.values();
		for (Vertex vtx : allVertices) {
			if (!visited.containsKey(vtx)) {
				visited.put(vtx, null);
				Stack.addFirst(vtx);
			}
			while (!Stack.isEmpty()) {
				Vertex vtx2 = Stack.removeFirst();
				Set<Vertex> nbrs = vtx2.neightbours.keySet();
				for (Vertex nbr : nbrs) {
					if (!visited.containsKey(nbr)) {
						visited.put(nbr, vtx2);

						Stack.addFirst(nbr);
					} else {
						Vertex ReasonForVertex = visited.get(vtx2);
						if (ReasonForVertex == nbr) {
							continue;
						}
						return false;
					}
				}
			}
		}
		return true;
	}

	private class Pair implements Comparable<Pair> {
		int cost;
		Vertex vtx;
		Edge edge; // to be used prims

		Pair(int cost, Vertex vtx) {
			this.cost = cost;
			this.vtx = vtx;
		}

		// to be used by prims
		Pair(int cost, Vertex vtx, Edge edge) {
			this.cost = cost;
			this.vtx = vtx;
			this.edge = edge;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}
	}

	public HashMap<String, Integer> dijikstra(String src) {
		HashMap<String, Integer> rv = new HashMap<>();
		Heap<Pair> vtxHeap = new Heap<>(true);
		HashMap<Vertex, Pair> vtxMap = new HashMap<>();
		Set<Map.Entry<String, Vertex>> allEntries = this.vertices.entrySet();
		for (Map.Entry<String, Vertex> entry : allEntries) {
			Vertex vtx = entry.getValue();
			Pair p = null;
			if (vtx.name.equals(src)) {
				p = new Pair(0, vtx);
			} else {
				p = new Pair(Integer.MAX_VALUE, vtx);
			}
			vtxHeap.add(p);
			vtxMap.put(vtx, p);
		}

		while (!vtxHeap.isEmpty()) {
			Pair tpair = vtxHeap.remove();
			Vertex tvtx = tpair.vtx;
			Set<Map.Entry<Vertex, Edge>> nbrEntries = tvtx.neightbours.entrySet();
			for (Map.Entry<Vertex, Edge> nbrentry : nbrEntries) {
				Vertex ovtx = nbrentry.getKey();
				Edge oedge = nbrentry.getValue();
				Pair opair = vtxMap.get(ovtx);

				int oldscore = opair.cost;
				int newscore = tpair.cost + oedge.weight;

				if (newscore < oldscore) {
					opair.cost = newscore;
					vtxHeap.updatePriority(opair);
				}
			}
		}
		Set<Map.Entry<Vertex, Pair>> pairEntries = vtxMap.entrySet();
		for (Map.Entry<Vertex, Pair> pairentry : pairEntries) {
			rv.put(pairentry.getKey().name, pairentry.getValue().cost);
		}
		return rv;
	}
	public Graph prims() {
		Graph rv = new Graph();

		Heap<Pair> vtxHeap = new Heap<>(true);
		HashMap<Vertex, Pair> vtxMap = new HashMap<>();

		boolean first = true;
		Set<Map.Entry<String, Vertex>> allEntries = this.vertices.entrySet();
		for (Map.Entry<String, Vertex> entry : allEntries) {
			Vertex vtx = entry.getValue();

			Pair p = null;
			if (first) {
				first = false;
				p = new Pair(0, vtx);
			} else {
				p = new Pair(Integer.MAX_VALUE, vtx);
			}

			vtxHeap.add(p);
			vtxMap.put(vtx, p);
		}

		while (!vtxHeap.isEmpty()) {
			Pair tpair = vtxHeap.remove();
			Vertex tvtx = tpair.vtx;

			// processing
			if (rv.numVertices() == 0) {
				rv.addVertex(tvtx.name);
			} else {
				rv.addVertex(tvtx.name);
				rv.addEdge(tpair.edge.one.name, tpair.edge.two.name, tpair.edge.weight);
			}

			Set<Map.Entry<Vertex, Edge>> nbrEntries = tvtx.neightbours.entrySet();
			for (Map.Entry<Vertex, Edge> nbrEntry : nbrEntries) {
				if (rv.containsvertex(nbrEntry.getKey().name)) {
					continue;
				}

				Vertex ovtx = nbrEntry.getKey();
				Edge oedge = nbrEntry.getValue();
				Pair opair = vtxMap.get(ovtx);

				int oldScore = opair.cost;
				int newScore = oedge.weight;

				if (newScore < oldScore) {
					opair.cost = newScore;
					opair.edge = oedge;
					vtxHeap.updatePriority(opair);
				}
			}
		}

		return rv;
	}


	public static void main(String[] args) throws Exception {
		
		Graph ga = new Graph();
		Graph gb = new Graph();
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		for(int i=0;i<n;i++){
			ga.addVertex(Integer.toString(i));
			gb.addVertex(Integer.toString(i));
		}
		for(int i=0;i<m;i++){
			int e1=scn.nextInt();
			int e2=scn.nextInt();
			int a=scn.nextInt();
			int b=scn.nextInt();
			ga.addEdge(Integer.toString(e1), Integer.toString(e2), a);
			gb.addEdge(Integer.toString(e1), Integer.toString(e2), b);
		}
		
		Graph primsa = ga.prims();
//		primsa.display();
		int s1=0,s2=0;
		HashMap<String, Integer> map=primsa.dijikstra("0");
		Set<Map.Entry<String, Integer>> allEntries=map.entrySet();
		for(Map.Entry<String, Integer> entry:allEntries){
			s1+=entry.getValue();
		}
//		System.out.println(s1);
//		System.out.println("****");
		Graph primsb = gb.prims();
//		primsb.display();
		HashMap<String, Integer> mapp=primsb.dijikstra("0");
		Set<Map.Entry<String, Integer>> allEntriess=mapp.entrySet();
		for(Map.Entry<String, Integer> entry:allEntriess){
			s2+=entry.getValue();
		}
		System.out.println(s1+"/"+s2);
	}

}
