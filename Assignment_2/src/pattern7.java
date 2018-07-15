import java.util.Scanner;

public final class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int row=1,col=0,val=1;
		while(row<=N){
			col=N-row;
			while(col!=0){
				System.out.print(" \t");
				col=col-1;
				
			}
			col=1;
			val=row;
			while(col<=row){
				System.out.print(val+"\t");
				val=val+1;
				col=col+1;			
			}
			col=1;
			val=2*(row-1);
			int o=row-1;
			while(col<=o){
				System.out.print(val+"\t");
				val=val-1;
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}

	}

}
