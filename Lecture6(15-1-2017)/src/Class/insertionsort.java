package Class;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		insertionsort(arr);
	}
	public static void insertionsort(int[] arr){
		int counter=1;
		while(counter<=arr.length-1){
			for(int i=counter;i>0;i--){
				if(arr[i-1]>arr[i]){
					swap.swap(arr,i-1,i);
				}else{
					break;
				}
			}counter++;
			
		}display(arr);

	}public static void display(int[] arr) {
		for (int val : arr) {
			
			System.out.print(val + " ");
		}
		System.out.println();
	}
	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
