
public class mcm_rs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,20,30,40};
System.out.println(MCM(arr,0,arr.length-1,new int[arr.length+1][arr.length+1]));
	}
	public static int MCM(int[] arr,int si,int li,int[][]strg){
		int min=Integer.MAX_VALUE;
		if (li == si +1) {
			return 0;
		}
		if(strg[si][li]!=0){
			return strg[si][li];
		}
		for (int i = si + 1; i < li; i++) {
			int output = MCM(arr, si, i,strg);
			output += MCM(arr, i, li,strg);
			output += arr[si] * arr[i] * arr[li];

			if (output < min) {
				min = output;
			}	
			strg[si][li]=min;
		}
		return min;

	}
}
