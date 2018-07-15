import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int i = 1, val = 1;
		while (i <= N) {
			int col = 1;
			while (col <= i) {
				if(col==1 || col==i){
					val=i;
				}
				else{
					val=0;
				}
				System.out.print(val + " ");
				col = col + 1;
			}
			System.out.println();
			i = i + 1;

		}
}
}
