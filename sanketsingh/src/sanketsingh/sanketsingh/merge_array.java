package sanketsingh;

public class merge_array {
	public static void main(String[] args) {
		int[] arr1 = { Integer.MAX_VALUE, 1, 4, 5, Integer.MAX_VALUE, 7, 8, 9, Integer.MAX_VALUE, 15 };
		int[] arr2 = { 2, 5, 7, 11 };
		int l1 = arr1.length, l2 = arr2.length;
		move_to_end(arr1, arr2, l1, l2);
		mergearray(arr1, arr2, l1, l2);
		int i=0;
		while(i<l1){
			System.out.print(arr1[i]+" , ");
			i++;
		}

	}

	public static void move_to_end(int[] arr1, int[] arr2, int l1, int l2) {
		int j = l1 - 1;
		for (int i = l1 - 1; i >= 0; i--) {
			if (arr1[i] != Integer.MAX_VALUE) {
				arr1[j] = arr1[i];
				j--;
			}
		}
	}

	public static void mergearray(int[] arr1, int[] arr2, int l1, int l2) {
		int i = l2;

		/* Current index of i/p part of arr1[] */
		int j = 0;

		/* Current index of arr2[] */
		int k = 0;

		/* Current index of of output arr1[] */
		while (k < (l1)) {
			/*
			 * Take an element from mPlusN[] if a) value of the picked element
			 * is smaller and we have not reached end of it b) We have reached
			 * end of N[]
			 */
			if(j>=l2){
				break;
			}
			if ((i < (l1) && arr1[i] <= arr2[j]) || (j == l1)) {
				arr1[k] = arr1[i];
				k++;
				i++;
			} else // Otherwise take element from N[]
			{
				arr1[k] = arr2[j];
				k++;
				j++;
			}
			
		}
	}

}
