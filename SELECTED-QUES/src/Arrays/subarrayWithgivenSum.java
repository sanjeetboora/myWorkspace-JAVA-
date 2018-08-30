package Arrays;
import java.util.*;
public class subarrayWithgivenSum {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scn.nextInt();
		int arr[]=new int[N];
		int sum=scn.nextInt();
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		int subarr[] = subarrayequalsSum(arr,N,sum);
		for(int k=0;k<subarr.length;k++) {
			System.out.print(subarr[k]+", ");
		}
	}
	public static int[] subarrayequalsSum(int arr[],int N,int sum){
		int currsum=0,startidx=0,i=0;
		for( i=0;i<N;i++) {
			currsum+=arr[i];
			if(currsum>sum) {
				while(currsum>sum && startidx<i) {
					currsum-=arr[startidx];
					startidx++;
				}
			}
			if(currsum==sum) {
				break;
			}
			
		}
		int result[]=new int[i-startidx+1];
		for(int k=0;k<result.length;k++) {
			result[k]=arr[startidx];
			startidx++;
		}
		return result;
	}

}
