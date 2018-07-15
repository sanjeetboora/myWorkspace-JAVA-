import java.util.HashMap;
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

	public boolean HasPathFromToDFS(String V1name, String V2name) {
		Vertex vtx1 = this.vertices.get(V1name);
		Vertex vtx2 = this.vertices.get(V2name);
		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		HashMap<String, Boolean> visited = new HashMap<>();
		visited = new HashMap<>();
		return this.HasPathFromToDFS(vtx1, vtx2, visited);
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

}
