package Class;

public class spiraldisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = TwoDarrayTakeInput.takerectinput();
		TwoDarrayTakeInput.display(arr);
		spiraldisplay(arr);

	}

	public static void spiraldisplay(int arr[][]) {
		int j = arr.length * arr[0].length;
		int i = 1;
		int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
		while (i <= j) {

			for (int row = minr; i <= j && row <= maxr; row++) {
				System.out.print(arr[row][minc] + "\t");
				i++;
			}
			minc++;
			for (int col = minc; i <= j && col <= maxc; col++) {
				System.out.print(arr[maxr][col] + "\t");
				i++;
			}
			maxr--;
			for (int row = maxr; i <= j && row >= minr; row--) {
				System.out.print(arr[row][maxc] + "\t");
				i++;
			}
			maxc--;
			for (int col = maxc; i <= j && col >= minc; col--) {
				System.out.print(arr[minr][col] + "\t");
				i++;
			}
			minr++;

		}

	}
}
