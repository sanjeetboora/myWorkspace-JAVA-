import java.util.Scanner;
public class life_universe {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		printlessthan42(N);
	}
	public static void printlessthan42(int N){
		while(N==42){
			return;
		}
		 
		if(N!=42){
		System.out.println(N);
		N = scn.nextInt();
		printlessthan42(N);
	}
		
	}

}
