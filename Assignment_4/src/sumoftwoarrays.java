import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumoftwoarrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = takeinput();
		int[] arr2 = takeinput();
		int[] b=toIntArray(sumoftwoarray(arr1,arr2));
		display(b);

	}

	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
		int[] rv = null;
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static void display(int[] arr) {
		for (int i=arr.length-1;i>=0;i--) {
			if(i==arr.length-1 && arr[arr.length-1]==0){
				continue;
			}
			else{
				int val=arr[i];
				System.out.print(val + ", ");
			}
			
		}
		System.out.println("END");
	}
	public static ArrayList<Integer> sumoftwoarray(int[] arr1, int[] arr2) {
		int a = arr1.length, b = arr2.length, size;
		if (a > b) {
			size = a + 1;
		} else {
			size = b + 1;
		}
		ArrayList<Integer>rv=new ArrayList<>();
		int carry = 0;
		int ab = size;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		for (int k = ab-1 ; k >= 0; k--) {
				int sum = 0;
				
				if (i >= 0) {
					sum = sum + arr1[i];
				}
				if (j >= 0) {
					sum = sum + arr2[j];
				}
				int op=sum+carry;
				rv.add((op) % 10);
				carry = op / 10;
				i--;
				j--;
			}
		return rv;
	}
	public static int[] toIntArray(List<Integer> rv){
		  int[] ret = new int[rv.size()];
		  for(int i = 0;i < ret.length;i++)
		    ret[i] = rv.get(i);
		  return ret;
		}
}

