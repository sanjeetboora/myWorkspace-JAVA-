package Arrays;

import java.util.Scanner;

public class rearrangeArrayinMaxMin_44 {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int N = scn.nextInt();
		// int k = scn.nextInt();
		// int arr[] = new int[N];
		// for (int i = 0; i < N; i++) {
		// arr[i] = scn.nextInt();
		// }

		String str = s.next();
		String r = "barclays";
		char arr[] = str.toCharArray();
		char comp[] = r.toCharArray();
		int min = Integer.MAX_VALUE;
		int left = 0, right = 0;
		for (int j = 0; j < arr.length-7; j++) {
			int count = 0;
			for (int k = 0; k < comp.length; k++) {
				if (arr[j + k] != comp[k]) {
					count++;
				}
			}
			if (count < min) {
				min = count;
				left = j;
				right = j+7;
			}
		}
		System.out.println(min);
		for(int m=0;m<8;m++)
		{
			if(comp[m]!=arr[left+m]) {
				System.out.print((left+m+1)+" ");
			}
		}

	}
}
