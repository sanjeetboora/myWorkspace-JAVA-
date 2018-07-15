import java.util.Scanner;

public class TripletSumsToTarget {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		tripletsumstarget(insertionsort(arr));

	}public static int[] takeInput() {
		int[] rv = null;
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}
	public static void tripletsumstarget(int[] arr){
		int target = scn.nextInt();
		for(int i=0; i < arr.length/3;i++ ){
			for(int j=i+1; j < 2*(arr.length/3);j++ ){
				for(int k=j+1; k < arr.length;k++ ){
					int a=((arr[i])+(arr[j])+(arr[k]));
				    if(a==target){
					System.out.println(arr[i]+" , "+arr[j] +" and "+arr[k]);
				}
				}
			}
		}
	}
	 public static int[] insertionsort(int[] arr){
			int counter=1;
			while(counter<=arr.length-1){
				for(int i=counter;i>0;i--){
					if(arr[i-1]>arr[i]){
						swap(arr,i-1,i);
					}else{
						break;
					}
				}counter++;
				
			}return arr;

		}
	    public static void swap(int[] arr, int i, int j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}



}
