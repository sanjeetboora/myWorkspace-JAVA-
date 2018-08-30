package Arrays;

import java.util.*;

public class MinTrainPlatforms {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		int dep[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < N; i++) {
			dep[i] = scn.nextInt();
		}
//		int arr[]= {900,940,950,1100,1500,1800};
//		int dep[]= {910, 1200, 1120, 1130, 1900, 2000};

		System.out.println(minPlatforms(arr, dep, N));

	}
	public static int minPlatforms(int arr[], int dep[], int N){
		int platforms=1,minplatforms=1,a=1,d=0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		while(a<N && d<N) {
			if(arr[a]<=dep[d]) {
				a++;
				platforms++;
				if(platforms>minplatforms) {
					minplatforms=platforms;
				}
			}else {
				d++;
				platforms--;
			}
		}
		return minplatforms;
	}

}
