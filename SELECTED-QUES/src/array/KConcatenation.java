package array;
import java.util.*;
//https://www.codechef.com/JAN18/problems/KCON
public class KConcatenation {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcase =scn.nextInt();
		for (int i = 0; i < testcase; i++) {
			int Num = scn.nextInt();
			int Kth = scn.nextInt();
			long[] arr= new long[Num*2];
			long sum=0;
			for (int j = 0; j < Num; j++) {
				arr[j]=scn.nextLong();
				sum+=arr[j];
			}
			long var1 = maxsumsubarray(arr, Num);
			System.arraycopy(arr, 0,arr,Num,Num);
			long var2 = maxsumsubarray(arr, Num*2);
			if(Kth==1) {
				System.out.println(var1);
			}else {
				if((var1!=var2)&&(Kth>2)) {
					var2=Math.max(var2+sum*(Kth-2),var2);
				}
				System.out.println(Math.max(var1, Math.max(Kth*sum, var2)));
			}
		}
	}
	public static long maxsumsubarray(long[]arr1,int arrSize) {
		long max_so_far=arr1[0],max_ending_here=0;
		for (int k = 0; k < arrSize; k++) {
			max_ending_here=Math.max(max_ending_here+arr1[k],arr1[k]);
			max_so_far=Math.max(max_ending_here,max_so_far);
		}
		return max_so_far;
	}
	

}
