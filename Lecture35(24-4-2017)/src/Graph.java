import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
	public Graph() {
		this.vertices = new HashMap<>();
	}

	private class Vertex {
		String name;
		HashMap<String, Integer> neighbors;

		Vertex(String name) {
			this.name = name;
			this.neighbors = new HashMap<>();
		}
	}

	private HashMap<String, Vertex> vertices;

	public int numVertices() {
		return this.vertices.size();
	}

	public boolean containsVertex(String Vname) {
		return this.vertices.containsKey(Vname);

	}

	public void addVertex(String Vname) throws Exception {
		if (this.containsVertex(Vname)) {
			throw new Exception("vertex already exists");
		} else {
			Vertex vtx = new Vertex(Vname);
			this.vertices.put(Vname, vtx);

		}

	}

	public void removeVertex(String Vname) throws Exception {
		if (!this.containsVertex(Vname)) {
			throw new Exception("vertex does not exists");
		} else {
			Vertex vtx = this.vertices.get(Vname);
			Set<String> nbrs = vtx.neighbors.keySet();
			for (String nbr : nbrs) {
				Vertex nbrvtx = this.vertices.get(nbr);
				nbrvtx.neighbors.remove(Vname);
			}
			this.vertices.remove(Vname);

		}

	}

	public int numEdge() {
		int count = 0;
		Set<String> verticesNames = this.vertices.keySet();
		for (String vname : verticesNames) {
			Vertex vtx = this.vertices.get(vname);
			count += vtx.neighbors.size();
		}
		count = count / 2;
		return count;
	}

	public boolean containsEdge(String V1name, String V2name) {
		Vertex vtx1 = this.vertices.get(V1name);
		Vertex vtx2 = this.vertices.get(V2name);
		if (vtx1 == null || vtx2 == null) {
			return false;
		} else {
			return vtx1.neighbors.containsKey(V2name);
		}

	}

	public void addEdge(String V1name, String V2name, int weight) throws Exception {
		Vertex vtx1 = this.vertices.get(V1name);
		Vertex vtx2 = this.vertices.get(V2name);
		if (vtx1 == null || vtx2 == null) {
			throw new Exception("vertex does not exist");
		} else {
			vtx1.neighbors.put(V2name, weight);
			vtx2.neighbors.put(V1name, weight);
		}

	}

	public void removeEdge(String V1name, String V2name) throws Exception {
		Vertex vtx1 = this.vertices.get(V1name);
		Vertex vtx2 = this.vertices.get(V2name);
		if (vtx1 == null || vtx2 == null) {
			throw new Exception("vertex does not exist");
		} else {
			vtx1.neighbors.remove(V2name);
			vtx2.neighbors.remove(V1name);
		}

	}

	public void display() {
		Set<String> verticesNames = this.vertices.keySet();
		String str = "";
		for (String vname : verticesNames) {
			str = vname + " => ";
			Vertex vtx = this.vertices.get(vname);

			Set<String> nbrNames = vtx.neighbors.keySet();
			for (String nbrname : nbrNames) {
				str += nbrname + "(" + vtx.neighbors.get(nbrname) + ")" + " , ";

			}
			System.out.println(str);
		}
	}

	public boolean HasPathFromTo(String V1name, String V2name) {
		Vertex vtx1 = this.vertices.get(V1name);
		Vertex vtx2 = this.vertices.get(V2name);
		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		HashMap<String, Boolean> visited = new HashMap<>();
		visited = new HashMap<>();
		// return this.HasPathFromToDFS(vtx1, vtx2, visited);
		// return this.HasPathFromToBFS(vtx1, vtx2, visited);
		return this.HasPathFromToDFSI(vtx1, vtx2, visited);

	}

	private boolean HasPathFromToDFS(Vertex vtx1, Vertex vtx2, HashMap<String, Boolean> visited) {
		if (visited.containsKey(vtx1.name)) {
			return false;
		}

		visited.put(vtx1.name, true);

		if (vtx1.neighbors.containsKey(vtx2.name)) {
			return true;
		}

		Set<String> nbrs = vtx1.neighbors.keySet();
		for (String nbr : nbrs) {
			Vertex nvtx = this.vertices.get(nbr);
			if (this.HasPathFromToDFS(nvtx, vtx2, visited) == true) {
				return true;
			}
		}
		return false;
	}

	private boolean HasPathFromToBFS(Vertex vtx1, Vertex vtx2, HashMap<String, Boolean> visited) {
		LinkedList<Vertex> Queue = new LinkedList<>();
		Queue.addLast(vtx1);

		while (!Queue.isEmpty()) {
			Vertex vtx = Queue.removeFirst();
			if (!visited.containsKey(vtx.name)) {
				visited.put(vtx.name, true);
				if (vtx.neighbors.containsKey(vtx2.name)) {
					return true;
				}

				Set<String> nbrs = vtx.neighbors.keySet();
				for (String nbr : nbrs) {
					Vertex nbrvtx = this.vertices.get(nbr);
					if (!visited.containsKey(nbrvtx.name)) {
						Queue.addLast(nbrvtx);
					}
				}
			}
		}
		return false;
	}

	private boolean HasPathFromToDFSI(Vertex vtx1, Vertex vtx2, HashMap<String, Boolean> visited) {
		LinkedList<Vertex> Stack = new LinkedList<>();

		Stack.addFirst(vtx1);

		while (!Stack.isEmpty()) {
			Vertex vtx = Stack.removeFirst();
			if (!visited.containsKey(vtx.name)) {
				visited.put(vtx.name, true);
				if (vtx.neighbors.containsKey(vtx2.name)) {
					return true;
				}
				Set<String> nbrs = vtx.neighbors.keySet();
				for (String nbr : nbrs) {
					Vertex nbrvtx = this.vertices.get(nbr);
					if (!visited.containsKey(nbrvtx.name)) {

						Stack.addFirst(nbrvtx);
					}
				}
			}
		}
		return false;
	}

	public boolean IsConnected() {
		HashMap<String, Boolean> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		String zvn = this.vertices.keySet().iterator().next();
		Vertex zv = this.vertices.get(zvn);
		Stack.addFirst(zv);

		while (!Stack.isEmpty()) {
			Vertex vtx = Stack.removeFirst();
			if (!visited.containsKey(vtx.name)) {
				visited.put(vtx.name, true);
				Set<String> nbrs = vtx.neighbors.keySet();
				for (String nbr : nbrs) {
					Vertex nbrvtx = this.vertices.get(nbr);
					if (!visited.containsKey(nbrvtx.name)) {
						Stack.addFirst(nbrvtx);
					}
				}
			}
		}
		return this.vertices.size() == visited.size();
	}

	public void BFT() {
		HashMap<String, Boolean> visited = new HashMap<>();
		LinkedList<Vertex> Queue = new LinkedList<>();
		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			if (!visited.containsKey(vname)) {
				Vertex vtx1 = this.vertices.get(vname);
				Queue.addLast(vtx1);

				while (!Queue.isEmpty()) {
					Vertex vtx = Queue.removeFirst();

					if (!visited.containsKey(vtx.name)) {
						System.out.print(vtx.name + " , ");

						visited.put(vtx.name, true);

						Set<String> nbrs = vtx.neighbors.keySet();
						for (String nbr : nbrs) {
							Vertex nbrvtx = this.vertices.get(nbr);
							if (!visited.containsKey(nbrvtx.name)) {
								Queue.addLast(nbrvtx);
							}
						}

					}
				}
				System.out.print("end");
				System.out.println();

			}
		}

	}

	public void DFT() {
		HashMap<String, Boolean> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			if (!visited.containsKey(vname)) {
				Vertex vtx1 = this.vertices.get(vname);
				Stack.addFirst(vtx1);

				while (!Stack.isEmpty()) {
					Vertex vtx = Stack.removeFirst();

					if (!visited.containsKey(vtx.name)) {
						System.out.print(vtx.name + " , ");

						visited.put(vtx.name, true);

						Set<String> nbrs = vtx.neighbors.keySet();
						for (String nbr : nbrs) {
							Vertex nbrvtx = this.vertices.get(nbr);
							if (!visited.containsKey(nbrvtx.name)) {
								Stack.addFirst(nbrvtx);
							}
						}

					}
				}
				System.out.print("end");
				System.out.println();

			}
		}
	}

	public boolean Acyclic() {
		HashMap<String, Boolean> visited = new HashMap<>();
		LinkedList<Vertex> Stack = new LinkedList<>();
		Set<String> vnames = this.vertices.keySet();
		boolean flag = false;

		for (String vname : vnames) {
			if (!visited.containsKey(vname)) {
				Vertex vtx1 = this.vertices.get(vname);
				Stack.addFirst(vtx1);

				while (!Stack.isEmpty()) {
					Vertex vtx = Stack.removeFirst();

					if (!visited.containsKey(vtx.name)) {
						visited.put(vtx.name, true);

						Set<String> nbrs = vtx.neighbors.keySet();
						for (String nbr : nbrs) {
							Vertex nbrvtx = this.vertices.get(nbr);
							if (!visited.containsKey(nbrvtx.name)) {
								Stack.addFirst(nbrvtx);
							}
						}

					} else {
						flag = true;
					}
				}

			}
		}
		return flag;
	}

	public boolean isBipartite() {
		HashMap<String, String> visited = new HashMap<>();
		LinkedList<Pair> Stack = new LinkedList<>();
		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			if (!visited.containsKey(vname)) {
				Vertex vtx1 = this.vertices.get(vname);
				Pair one = new Pair(vtx1, "R");
				Stack.addFirst(one);

				while (!Stack.isEmpty()) {
					Pair rvtx = Stack.removeFirst();

					if (!visited.containsKey(rvtx.vtx.name)) {
						visited.put(rvtx.vtx.name, rvtx.color);

						Set<String> nbrs = rvtx.vtx.neighbors.keySet();
						for (String nbr : nbrs) {
							Vertex nbrvtx = this.vertices.get(nbr);
							if (!visited.containsKey(nbrvtx.name)) {
								Pair np = new Pair(nbrvtx, rvtx.color.equals("R") ? "G" : "R");
								Stack.addFirst(np);
							} else {
								String earliercolor = visited.get(nbrvtx.name);
								String currcolor = rvtx.color.equals("R") ? "G" : "R";
								if (!earliercolor.equals(currcolor)) {
									return false;
								}
							}
						}
					}
				}
			}
		}
		return true;
	}

	private class Pair {
		Vertex vtx;
		String color;

		Pair(Vertex vtx, String color) {
			this.vtx = vtx;
			this.color = color;
		}
	}

	public HashMap<String, Integer> djikstra(String src) {
		HashMap<String, Integer> hm = new HashMap();
		Heap<Pairheap> heap = new Heap(true);
		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			Pairheap ph = new Pairheap(vname, Integer.MAX_VALUE);
			heap.add(ph);
			hm.put(vname, Integer.MAX_VALUE);
		}
		for (String vname : vnames) {
			Pairheap ph = new Pairheap(vname, Integer.MAX_VALUE);
			int actual_cost = this.vertices.get(vname).neighbors.get(vname);
			if (actual_cost < ph.cost) {

			}

			heap.add(ph);
			hm.put(vname, Integer.MAX_VALUE);
		}

		return hm;
	}

	private class Pairheap implements Comparable<Pairheap> {
		String vtx;
		int cost;

		Pairheap(String vtx, int cost) {
			this.vtx = vtx;
			this.cost = cost;
		}

		@Override
		public int compareTo(Pairheap o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
