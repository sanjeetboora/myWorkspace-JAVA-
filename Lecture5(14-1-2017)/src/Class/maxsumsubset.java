package Class;

public class maxsumsubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
        System.out.println(maxsum(arr));
	}

	public static int maxsum(int[] arr) {
		int counter = 0;
		int max = 0;
		
			for (int i = 0; i < arr.length; i++) {
				int sum = 0;
				for (int j = i; j <=arr.length-1 ; j++) {
					sum = sum + arr[j];	
					System.out.println("sum"+sum);
				}				
				if (max < sum) {
					max = sum;
				}			
		}
		return max;
	}

}
