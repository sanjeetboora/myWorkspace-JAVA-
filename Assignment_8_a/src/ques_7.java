import java.util.ArrayList;
import java.util.Scanner;

//Take as input N, a number. Take N more inputs and store that in an array. Take as
//	input target, a number
//a. Write a recursive function which counts the number of subsets of the array
//	 which sum to target. Print the value returned.
//b. Write a recursive function which returns the subsets of the array which sum
//	 to target. Return type of function should be ArrayList<ArrayList<Integer>.
//	 Print the value returned.
//c. Write a recursive function which prints subsets of the array which sum to
//	 target. Return type of functions is void.
public class ques_7 {

	// TODO Auto-generated method stub
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int size = scn.nextInt();
		int[] data = takeInput(size);
		int target = scn.nextInt();
		// System.out.println(countSplitArrays(data, 0, 0, 0));
		targetSubsetprint(data, 0, target,"");
		System.out.println(targetsubset(data, data.length-1, target));
		// printSplitArrays(data, 0, 0, "", 0, "");
	}
	
	public static void targetSubsetprint(int[] arr, int si, int target, String osf) {
		if (si == arr.length) {
			if (target == 0) {
				System.out.println(osf+"END");
			}
			return;
		}
		targetSubsetprint(arr, si + 1, target - arr[si], osf + arr[si] + ", ");
		targetSubsetprint(arr, si + 1, target, osf);
		
	}
	public static ArrayList<ArrayList<Integer>> targetsubset(int[] arr, int si, int sum1) {

		if (si == -1) {
			if (sum1 == 0) {
				ArrayList<ArrayList<Integer>> baseresult = new ArrayList<>();
				ArrayList<Integer> check = new ArrayList<>();
				baseresult.add(check);
				return baseresult;
			} else {
				ArrayList<ArrayList<Integer>> baseresult = new ArrayList<>();
				return baseresult;
			}
		}
		ArrayList<ArrayList<Integer>> myresult = new ArrayList<>();
		ArrayList<ArrayList<Integer>> recresult1 = targetsubset(arr, si -1, sum1 - arr[si]);
		ArrayList<ArrayList<Integer>> recresult2 = targetsubset(arr, si -1, sum1);
		for (int i = recresult2.size()-1; i >=0 ; i--) {
			ArrayList<Integer> adder = recresult2.get(i);
			myresult.add(adder);
		}
		for (int i = recresult1.size()-1; i >=0 ; i--) {
			ArrayList<Integer> adder = recresult1.get(i);
			ArrayList<Integer> rec=new ArrayList<>();
			rec.add(arr[si]);
			for(int j=0;j<adder.size();j++){
				rec.add(adder.get(j));
			}
			myresult.add(rec);
		}
		return myresult;
	}
	
	public static int[] takeInput(int size) {
		int[] rv = null;
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}
}
