package Arrays;
import java.util.*;

public class equilibriumSum {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scn.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(equiIndex(arr,N));
	}
	public static int equiIndex(int arr[],int num) {
		int sum=0, leftsum=0;
		for(int i=0;i<num;i++) {
			sum+=arr[i];
		}
		
		for(int j=0;j<num;j++) {
			sum-=arr[j];
			if(leftsum==sum) {
				return j;
			}
			leftsum+=arr[j];
			
		}
		return -1;
	}

}
