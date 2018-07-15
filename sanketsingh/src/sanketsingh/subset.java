package sanketsingh;


import java.io.PrintStream;
import java.util.ArrayList;
public class subset {

	public static void main(String[] args) {

		// Initial set: it may contains repeated elements
		int[] members = { 1, 2, 3 };

		// The actual set
		ArrayList<Integer> set = new ArrayList<Integer>();

		// The repeated elements would not be inserted in the actual set.
		for (int n : members) {
			if (!set.contains(n)) {
				set.add(n);
			}
		}

		// Dump the set itself
		System.out.print("Set");
		dump(System.out, set);

		// extracts the subset
		ArrayList<ArrayList<Integer>> subSets = getSubsets(set);

		System.out.println("Subsets");
		// dump the subsets one by one
		for (ArrayList<Integer> subset : subSets) {
			dump(System.out, subset);
		}

	}

	// Extracts all subsets of the given set
	/*
	 * Remarks:
	 * 
	 * This method uses a recursive algorithm to find the subsets.
	 * 
	 * This is the algorithm: suppose we want to extract the subsets of
	 * 
	 * A = {a, b, c, ...}
	 * 
	 * First we separate the first element from A:
	 * 
	 * first-element: a B = {b, c, ...}
	 * 
	 * Now we use this recursive law:
	 * 
	 * The subsets of A are the collection of subsets of B, plus the collection
	 * of subsets of B once again, but this time the first element a is added to
	 * these subset:
	 * 
	 * Subsets-Of (A) = Subsets-Of (B) + ({a} + Subsets-Of (B))
	 * 
	 * For example, if A has only two members:
	 * 
	 * A = {a, b}
	 * 
	 * then
	 * 
	 * first-element = a B = {b}.
	 * 
	 * The subsets of B: {}, {b}
	 * 
	 * The subsets of B, a added: {a}, {a, b}
	 * 
	 * Now the whole collection is
	 * 
	 * Subsets of A: {}, {b}, {a}, {a, b}
	 * 
	 * If the set is an empty set {}, this function returns the only subset: {},
	 * and recursion terminates here.
	 * 
	 * The input of this method, set, is an ArrayList<Integer>. It could be an
	 * ArrayList of any type because we have not done any type specific
	 * operation on the elements. It could also be the generic type, E.
	 * 
	 * The output is an ArrayList of sets, That is the elements of ArrayList are
	 * ArrayList, themselves: ArrayList <ArrayList <E>>
	 * 
	 */
	private static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {

		ArrayList<ArrayList<Integer>> subsetCollection = new ArrayList<ArrayList<Integer>>();

		if (set.size() == 0) {
			subsetCollection.add(new ArrayList<Integer>());
		} else {
			ArrayList<Integer> reducedSet = new ArrayList<Integer>();

			reducedSet.addAll(set);

			int first = reducedSet.remove(0);
			ArrayList<ArrayList<Integer>> subsets = getSubsets(reducedSet);
			subsetCollection.addAll(subsets);

			subsets = getSubsets(reducedSet);

			for (ArrayList<Integer> subset : subsets) {
				subset.add(0, first);
			}

			subsetCollection.addAll(subsets);
		}

		return subsetCollection;
	}

	// This method dumps the elements of a set in one line
	// It dumps the set into the given PrintStream object.
	private static void dump(PrintStream out, ArrayList<Integer> set) {
			out.print("{");

			boolean first = true;
			for (int n : set) {
				if (first) {
					first = false;

				} else {
					out.print(", ");

				}
				out.printf("%1$d", n);
			}

			out.println("}");
		}
}