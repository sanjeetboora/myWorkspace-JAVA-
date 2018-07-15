import java.util.*;

public class intersection_of_two_arrays {

		public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int size = scn.nextInt();
			int[] arr1 =takeInput(size);
			int[] arr2 = takeInput(size);
			display(arrayintersection(arr1, arr2));
		}

		public static int[] takeInput(int size) {
			int[] rv = null;
			
			rv = new int[size];
			for (int i = 0; i < rv.length; i++) {
				rv[i] = scn.nextInt();
			}
			return rv;
		}

		public static ArrayList<Integer> arrayintersection(int[] arr1, int[] arr2) {

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int b = 0, f = arr1.length, g = arr2.length, size = 0;
			if (f >= g) {
				size = f;
			} else {
				size = g;
			}

			int[] rv = new int[size];
			ArrayList<Integer> al = new ArrayList<>();
			for (int j = 0; j < f; j++) {
				for (int i = 0; i < g; i++) {
					if (arr1[j] == arr2[i]) {
						al.add(arr1[j]);
						b++;
						if (j < f - 1) {
							j++;
						}

					}

				}
			}
			return al;
		}

		public static void display(ArrayList<Integer> al) {
			System.out.print("[");
			for (int val = 0; val < al.size(); val++) {
				System.out.print(al.get(val));
				if(val!=al.size()-1){
				System.out.print( ", ");}
			}System.out.print("]");
		}
	}
