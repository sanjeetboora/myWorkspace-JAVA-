package Arrays;

import java.util.*;

class Inter {
	int start;
	int end;

	public Inter(int s, int e) {
		this.start = s;
		this.end = e;
	}

}

class MyComparator implements Comparator<Inter> {

	@Override
	public int compare(Inter o1, Inter o2) {
		return o2.start - o1.start;

	}
}

public class mergeIntervals {
	public static Scanner scn = new Scanner(System.in);

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		Inter arr[] = new Inter[n];
		for (int i = 0; i < n; i++) {
			int st = scn.nextInt();
			int ei = scn.nextInt();
			Inter el = new Inter(st, ei);
			arr[i] = el;
		}
		// Inter arr[] = { { 6, 8 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };
		Arrays.sort(arr, new MyComparator());
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i].start + ", " + arr[i].end);
		}
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (idx != 0 && arr[i].end >= arr[idx - 1].start) {
				while (idx != 0 && arr[i].end >= arr[idx - 1].start) {
					arr[idx - 1].start = min(arr[idx - 1].start, arr[i].start);
					arr[idx - 1].end = max(arr[idx - 1].end, arr[i].end);
					idx--;
				}
			} else {
				arr[idx] = arr[i];
			}
			idx++;
		}
		System.out.println("-------------------SOLUTION-------------------");
		for (int i = 0; i < idx; i++) {
			System.out.println(arr[i].start + ", " + arr[i].end);
		}
	}
}
