package Arrays;

import java.util.Scanner;

public class KConcat {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = scn.nextInt();
		while(test>0) {
			int N = scn.nextInt();
			int K = scn.nextInt();
			int arr[]=new int[N*2];
			int arrsum=0;
			for(int i=0;i<N;i++) {
				arr[i]=scn.nextInt();
				arrsum+=arr[i];
			}
			int subsum1=maxSubarraySum(arr, N);
			System.arraycopy(arr, 0, arr, N, N);
			int subsum2=maxSubarraySum(arr,2*N);
			if(K==1) {
				System.out.println(subsum1);
			}
			else {
				if((subsum1!=subsum2)&&(K>2)) {
					subsum2=Math.max(subsum2,(K-2)*(arrsum)+subsum2)
;				}
				System.out.println(Math.max(subsum1,Math.max(K*arrsum, subsum2)));
			}
		}
	}
	public static int maxSubarraySum(int arr[],int num) {
		int maxsumhere=0;
		int maxsumsofar=arr[0];
		for(int i=0;i<num;i++) {
			maxsumhere=Math.max(arr[i]+maxsumhere, arr[i]);
			maxsumsofar=Math.max(maxsumsofar, maxsumhere);
		}
		return maxsumsofar;
	}

}
