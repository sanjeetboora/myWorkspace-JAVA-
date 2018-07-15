import java.util.Scanner;

public class primeSOE {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		printprimeSOE( N);
	}
	public static void printprimeSOE(int n){
		boolean[] arr =new boolean[n+1];
		for(int i=2;i<arr.length;i++){
			arr[i]=true;
		}
		for(int i=2;i*i<=n;i++){
			if(arr[i]){
				for(int multiplier=i;i*multiplier<=n;multiplier++){
					arr[i*multiplier]=false;
				}
			}
		}
		for(int i=2;i<=n;i++){
			if(arr[i]){
				System.out.println(i);
				}
	}
	}

}
