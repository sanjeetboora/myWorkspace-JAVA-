import java.util.ArrayList;
import java.util.Scanner;

public class printAllSubsets {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] a = takeinput();;
		ArrayList<ArrayList<Integer>>b=getsubset(a);
		for(int i=0;i<b.size();i++){
			System.out.println(b.get(i));
		}

	}
	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
		int[] rv = null;
		System.out.println("enter size of array");
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter " + i + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static ArrayList<ArrayList<Integer>> getsubset(int[] arr) {
		ArrayList<ArrayList<Integer>> retval = new ArrayList<>();

		int range = (int) Math.pow(2, arr.length);
		int counter = 0;

		while (counter < range) {
			ArrayList<Integer> inner = new ArrayList<>();
			int dec = counter;
			int ic = 0;
			while (ic < arr.length) {
				int rem = dec % 2;

				if (rem == 1) {
					inner.add(arr[ic]);
				}
				dec /= 2;
				ic++;

			}
			retval.add(inner);
			counter++;
		}
		return retval;

	}
}
	