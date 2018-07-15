
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
	private class Vertex {
		String name;
		HashMap<String, Integer> neighbors;

		Vertex(String name) {
			this.name = name;
			this.neighbors = new HashMap<>();
		}
	}

	private HashMap<String, Vertex> vertices;

	public Graph() {
		this.vertices = new HashMap<>();
	}

	public int numVertices() {
		return this.vertices.size();
	}

	public boolean containsVertex(String vname) {
		return this.vertices.containsKey(vname);
	}

	public void addVertex(String vname) throws Exception {
		if (this.containsVertex(vname)) {
			throw new Exception("Vertex already contained");
		}

		Vertex vtx = new Vertex(vname);
		this.vertices.put(vname, vtx);
	}

	public void removeVertex(String vname) throws Exception {
		if (!this.containsVertex(vname)) {
			throw new Exception("Vertex not contained");
		}

		Vertex vtx = this.vertices.get(vname);
		Set<String> nbrNames = vtx.neighbors.keySet();

		for (String nbrName : nbrNames) {
			Vertex nbrVtx = this.vertices.get(nbrName);
			nbrVtx.neighbors.remove(vname);
		}

		this.vertices.remove(vname);
	}

	public int numEdges() {
		int rv = 0;
		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			Vertex vtx = this.vertices.get(vname);
			rv += vtx.neighbors.size();
		}

		rv = rv / 2;

		return rv;
	}

	public boolean containsEdge(String v1name, String v2name) {
		Vertex vtx1 = this.vertices.get(v1name);
		Vertex vtx2 = this.vertices.get(v2name);

		if (vtx1 == null || vtx2 == null) {
			return false;
		}

		return vtx1.neighbors.containsKey(v2name);
	}

	public void addEdge(String v1name, String v2name, int weight) throws Exception {
		Vertex vtx1 = this.vertices.get(v1name);
		Vertex vtx2 = this.vertices.get(v2name);

		if (vtx1 == null || vtx2 == null) {
			throw new Exception("Vertex does not exist");
		}

		vtx1.neighbors.put(v2name, weight);
		vtx2.neighbors.put(v1name, weight);
	}

	public void removeEdge(String v1name, String v2name) throws Exception {
		Vertex vtx1 = this.vertices.get(v1name);
		Vertex vtx2 = this.vertices.get(v2name);

		if (vtx1 == null || vtx2 == null) {
			throw new Exception("Vertex does not exist");
		}

		vtx1.neighbors.remove(v2name);
		vtx2.neighbors.remove(v1name);
	}

	public void display() {
		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			Vertex vtx = this.vertices.get(vname);
			String str = vname + " => ";

			Set<String> nbrNames = vtx.neighbors.keySet();
			for (String nbrName : nbrNames) {
				str += nbrName + "(" + vtx.neighbors.get(nbrName) + "), ";
			}

			str += "END";
			System.out.println(str);
		}
	}

	public boolean hasPathFromTo(String v1name, String v2name) {
		Vertex vtx1 = this.vertices.get(v1name);
		Vertex vtx2 = this.vertices.get(v2name);

		if (vtx1 == null || vtx2 == null) {
			return false;
		}

		HashMap<String, Boolean> visited = new HashMap<>();
		// return this.hasPathFromToDFS(vtx1, vtx2, visited, "");
		// return this.hashPathFromToBFS(vtx1, vtx2, visited);
		return this.hashPathFromToDFSI(vtx1, vtx2, visited);
	}

	private boolean hasPathFromToDFS(Vertex vtx1, Vertex vtx2, HashMap<String, Boolean> visited, String osf) {
		if (visited.containsKey(vtx1.name)) {
			return false;
		}

		visited.put(vtx1.name, true);

		if (vtx1.neighbors.containsKey(vtx2.name)) {
			System.out.println(osf + vtx1.name + ", " + vtx2.name);
			return true;
		}

		Set<String> nbrNames = vtx1.neighbors.keySet();
		for (String nbrName : nbrNames) {
			Vertex nbrVtx = this.vertices.get(nbrName);

			if (this.hasPathFromToDFS(nbrVtx, vtx2, visited, osf + vtx1.name + ", ") == true) {
				return true;
			}
		}

		return false;
	}

	private boolean hashPathFromToBFS(Vertex vtx1, Vertex vtx2, HashMap<String, Boolean> processed) {
		LinkedList<Vertex> queue = new LinkedList<>();

		if (!processed.containsKey(vtx1.name)) {
			queue.addLast(vtx1);
		}

		while (!queue.isEmpty()) {
			Vertex rvtx = queue.removeFirst();

			// work area
			if (!processed.containsKey(rvtx.name)) {
				processed.put(rvtx.name, true);

				if (rvtx.neighbors.containsKey(vtx2.name)) {
					return true;
				}

				Set<String> nbrNames = rvtx.neighbors.keySet();
				for (String nbrName : nbrNames) {
					Vertex nbrVtx = this.vertices.get(nbrName);
					if (!processed.containsKey(nbrVtx.name)) {
						queue.addLast(nbrVtx);
					}
				}
			}
		}

		return false;
	}

	private boolean hashPathFromToDFSI(Vertex vtx1, Vertex vtx2, HashMap<String, Boolean> processed) {
		LinkedList<Vertex> stack = new LinkedList<>();

		if (!processed.containsKey(vtx1.name)) {
			stack.addFirst(vtx1);
		}

		while (!stack.isEmpty()) {
			Vertex rvtx = stack.removeFirst();

			// work area
			if (!processed.containsKey(rvtx.name)) {
				processed.put(rvtx.name, true);

				if (rvtx.neighbors.containsKey(vtx2.name)) {
					return true;
				}

				Set<String> nbrNames = rvtx.neighbors.keySet();
				for (String nbrName : nbrNames) {
					Vertex nbrVtx = this.vertices.get(nbrName);
					if (!processed.containsKey(nbrVtx.name)) {
						stack.addFirst(nbrVtx);
					}
				}
			}
		}

		return false;
	}

	public boolean IsConnected() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();

		String zvn = this.vertices.keySet().iterator().next();
		Vertex zvtx = this.vertices.get(zvn);
		if (!processed.containsKey(zvn)) {
			queue.addLast(zvtx);
		}

		while (!queue.isEmpty()) {
			Vertex rvtx = queue.removeFirst();

			// work area
			if (!processed.containsKey(rvtx.name)) {
				processed.put(rvtx.name, true);

				// processing = print the guy and put its neigbors in
				// System.out.println(rvtx.name);

				Set<String> nbrNames = rvtx.neighbors.keySet();
				for (String nbrName : nbrNames) {
					Vertex nbrVtx = this.vertices.get(nbrName);
					if (!processed.containsKey(nbrVtx.name)) {
						queue.addLast(nbrVtx);
					}
				}
			}
		}

		return processed.size() == this.vertices.size();
	}

	public void BFT() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();

		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			Vertex vtx = this.vertices.get(vname);
			if (!processed.containsKey(vname)) {
				queue.addLast(vtx);

				while (!queue.isEmpty()) {
					Vertex rvtx = queue.removeFirst();

					// work area
					if (!processed.containsKey(rvtx.name)) {
						processed.put(rvtx.name, true);

						System.out.print(rvtx.name + ", ");

						Set<String> nbrNames = rvtx.neighbors.keySet();
						for (String nbrName : nbrNames) {
							Vertex nbrVtx = this.vertices.get(nbrName);
							if (!processed.containsKey(nbrVtx.name)) {
								queue.addLast(nbrVtx);
							}
						}

					}
				}

				System.out.println("END");
			}
		}
	}

	public void DFT() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Vertex> stack = new LinkedList<>();

		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			Vertex vtx = this.vertices.get(vname);
			if (!processed.containsKey(vname)) {
				stack.addFirst(vtx);

				while (!stack.isEmpty()) {
					Vertex rvtx = stack.removeFirst();

					// work area
					if (!processed.containsKey(rvtx.name)) {
						processed.put(rvtx.name, true);

						System.out.print(rvtx.name + ", ");

						Set<String> nbrNames = rvtx.neighbors.keySet();
						for (String nbrName : nbrNames) {
							Vertex nbrVtx = this.vertices.get(nbrName);
							if (!processed.containsKey(nbrVtx.name)) {
								stack.addFirst(nbrVtx);
							}
						}
					}
				}

				System.out.println("END");
			}
		}
	}

	public boolean IsCyclic() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Vertex> stack = new LinkedList<>();

		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			Vertex vtx = this.vertices.get(vname);
			if (!processed.containsKey(vname)) {
				stack.addFirst(vtx);

				while (!stack.isEmpty()) {
					Vertex rvtx = stack.removeFirst();

					// work area
					if (!processed.containsKey(rvtx.name)) {
						processed.put(rvtx.name, true);

						// System.out.print(rvtx.name + ", ");

						Set<String> nbrNames = rvtx.neighbors.keySet();
						for (String nbrName : nbrNames) {
							Vertex nbrVtx = this.vertices.get(nbrName);
							if (!processed.containsKey(nbrVtx.name)) {
								stack.addFirst(nbrVtx);
							}
						}
					} else {
						return true;
					}
				}

				// System.out.println("END");
			}
		}

		return false;
	}

	public boolean IsBipartite() {
		HashMap<String, String> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		Set<String> vnames = this.vertices.keySet();

		for (String vname : vnames) {
			Vertex vtx = this.vertices.get(vname);
			if (!processed.containsKey(vname)) {
				stack.addFirst(new Pair(vtx, "R"));

				while (!stack.isEmpty()) {
					Pair rp = stack.removeFirst();

					// work area
					if (!processed.containsKey(rp.vtx.name)) {
						processed.put(rp.vtx.name, rp.color);

						// System.out.print(rvtx.name + ", ");

						Set<String> nbrNames = rp.vtx.neighbors.keySet();
						for (String nbrName : nbrNames) {
							Vertex nbrVtx = this.vertices.get(nbrName);
							if (!processed.containsKey(nbrVtx.name)) {
								Pair np = new Pair(nbrVtx, rp.color.equals("R") ? "G" : "R");
								stack.addFirst(np);
							} else {
								String colorOfLastProcessing = processed.get(nbrVtx.name);
								String colorOfCurrentProcessing = rp.color.equals("R") ? "G" : "R";

								if (!colorOfCurrentProcessing.equals(colorOfLastProcessing)) {
									return false;
								}

							}
						}
					}
				}

				// System.out.println("END");
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
		HashMap<String, Integer> rv = new HashMap<>();
		Heap<DjikstraPair> heap = new Heap<>(true);

		Set<String> vnames = this.vertices.keySet();
		for (String vname : vnames) {
			Vertex vtx = this.vertices.get(vname);

			DjikstraPair p = new DjikstraPair(vtx, 0);

			if (!vname.equals(src)) {
				p.cost = Integer.MAX_VALUE;
			}

			heap.add(p);
			rv.put(vname, p.cost);
		}

		while (!heap.isEmpty()) {
			DjikstraPair rp = heap.removeHP();

			Set<String> nbrNames = rp.vtx.neighbors.keySet();
			for (String nbrName : nbrNames) {
				Vertex nbrVtx = this.vertices.get(nbrName);

				int newCostForNbr = rv.get(rp.vtx.name) + rp.vtx.neighbors.get(nbrName);
				int oldCostForNbr = rv.get(nbrName);

				if (newCostForNbr < oldCostForNbr) {
					rv.put(nbrName, newCostForNbr);

					DjikstraPair ov = new DjikstraPair(nbrVtx, oldCostForNbr);
					DjikstraPair nv = new DjikstraPair(nbrVtx, newCostForNbr);
					heap.update(ov, nv);
				}
			}
		}

		return rv;
	}

	private class DjikstraPair implements Comparable<DjikstraPair> {
		Vertex vtx;
		int cost;

		public DjikstraPair(Vertex vtx, int cost) {
			this.vtx = vtx;
			this.cost = cost;
		}

		@Override
		public int compareTo(DjikstraPair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

		public boolean equals(Object o) {
			DjikstraPair op = (DjikstraPair) o;
			return this.vtx.name.equals(op.vtx.name);
		}

		public int hashCode() {
			return this.vtx.name.hashCode();
		}
	}

	public Graph prims() throws Exception {
		Graph rv = new Graph();
		HashMap<String, PrimsPair> map = new HashMap();
		Heap<PrimsPair> hp = new Heap(true);
		Set<String> vtxnames = this.vertices.keySet();
		for (String vtxname : vtxnames) {
			Vertex vtx=this.vertices.get(vtxname);
				PrimsPair np = new PrimsPair(this.vertices.get(vtx), Integer.MAX_VALUE, null);
				hp.add(np);
				map.put(vtxname, np);
		}
		PrimsPair rp=hp.removeHP();
		if(){
			
		}
		Set<String>nbrnames = rp.vtx.neighbors;
		for (String vtx : vtxnames) {
			PrimsPair np = new PrimsPair(this.vertices.get(vtx), Integer.MAX_VALUE, null);
			hp.add(np);
			map.put(vtx, np);
	}

		return rv;

	}

	private class PrimsPair implements Comparable<PrimsPair> {
		Vertex vtx;
		int cost;
		Vertex avvtx;

		public PrimsPair(Vertex vtx, int cost, Vertex avvtx) {
			this.vtx = vtx;
			this.cost = cost;
			this.avvtx = avvtx;
		}

		@Override
		public int compareTo(PrimsPair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

		public boolean equals(Object o) {
			PrimsPair op = (PrimsPair) o;
			return this.vtx.name.equals(op.vtx.name);
		}

		public int hashCode() {
			return this.vtx.name.hashCode();
		}
	}

}
