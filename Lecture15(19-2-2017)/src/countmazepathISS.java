import java.util.Scanner;

public class countmazepathISS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		System.out.println(countMazePaths(rows, cols));
	}

	public static int countMazePaths(int endrow, int endcol) {
		int[] storage = new int[endcol + 1];
		for (int i = 0; i < storage.length; i++) {
			storage[i] = 1;
		}
		
		for (int row = endrow - 1; row >= 0; row--) {
			for (int col = endcol - 1; col >= 0; col--) {
				
				storage[col] += storage[col + 1];
			}
		}

		return storage[0];
	}

}
