import java.util.*;

public class permutaionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		permutationArr(0, arr);

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < size; i++) {
//		    list.add(scn.nextInt());
//			
//		}
//		Collections.reverse(list);
//	 my_permutationOf(list, size, null, true);
	}

	public static void permutationArr(int start, int[] input) {
		if (start == input.length) {
			System.out.print("[");
			for (int x = 0; x < input.length; x++) {
				if (x == input.length-1) {
					System.out.print(input[x] + "");
				} else {
					System.out.print(input[x] + ", ");
				}
			}
			System.out.println("]");
			return;
		}
		for (int i = start; i < input.length; i++) {
			int temp = input[i];
			input[i] = input[start];
			input[start] = temp;

			permutationArr(start + 1, input);

			int temp2 = input[i];
			input[i] = input[start];
			input[start] = temp2;
		}
	}
	public static void my_permutationOf(ArrayList<Integer> uniqueList, int permutationSize, ArrayList<Integer> permutation, boolean only) {
	    if (permutation == null) {
	        assert 0 < permutationSize && permutationSize <= uniqueList.size();
	        permutation = new ArrayList<>(permutationSize);
	        if (!only) {
	            System.out.println(Arrays.toString(permutation.toArray()));
	        }
	    }
	    for (int i : uniqueList) {
	        if (permutation.contains(i)) {
	            continue;
	        }
	        permutation.add(i);
	        if (!only) {
	            System.out.println(Arrays.toString(permutation.toArray()));
	        } else if (permutation.size() == permutationSize) {
	            System.out.println(Arrays.toString(permutation.toArray()));
	        }
	        if (permutation.size() < permutationSize) {
	            my_permutationOf(uniqueList, permutationSize, permutation, only);
	        }
	        permutation.remove(permutation.size() - 1);
	    }
	}
}
