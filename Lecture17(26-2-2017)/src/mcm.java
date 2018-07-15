
public class mcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,20,30,40};
System.out.println(MCM(arr,0,arr.length-1));
	}
	public static int MCM(int[] arr,int si,int li){
		int min=Integer.MAX_VALUE;
		if (li == si +1) {
			return 0;
		}
		for (int i = si + 1; i < li; i++) {
			int output = MCM(arr, si, i);
			output += MCM(arr, i, li);
			output += arr[si] * arr[i] * arr[li];

			if (output < min) {
				min = output;
			}
		}
		
		return min;
	}

}
