import java.util.Scanner;

public class PairSumsTarget {
	  public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = takeInput();
		     pairsumstarget(insertionsort(arr));

		}
	    public static int[] takeInput() {
			int[] rv = null;
			int size = scn.nextInt();
			rv = new int[size];
			for (int i = 0; i < rv.length; i++) {
				rv[i] = scn.nextInt();
			}

			return rv;
		}
		public static void pairsumstarget(int[] arr){
			int target = scn.nextInt();
			for(int i=0; i < arr.length/2;i++ ){
				for(int j=arr.length-1; j >(arr.length/2)-1;j-- ){
					if(((arr[i])+(arr[j]))==target){
						System.out.println(arr[i]+" and "+arr[j]);
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
