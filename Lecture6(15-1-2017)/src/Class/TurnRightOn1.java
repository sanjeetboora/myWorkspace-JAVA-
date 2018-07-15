package Class;

import java.util.Scanner;

public class TurnRightOn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = TwoDarrayTakeInput.takerectinput();
		TwoDarrayTakeInput.display(arr);

		int j = arr.length * arr[0].length;
		int i = 1;
		int dir = 0, row = 0, col = 0;
		while (i <= j) {
			dir=(dir+arr[row][col])%4;

			if (dir == 0) {
				col++;
			} else if (dir == 1) {
				row++;
			} else if (dir == 2) {
				col--;

			} else if (dir == 3) {
				row--;
			}
		}

	}

}
