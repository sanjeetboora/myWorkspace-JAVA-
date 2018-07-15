import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int row=1,col=0,val=1,z=N-1;
		while(row<=N){
			col=N-row;
			while(col!=0){
				System.out.print("\t");
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
		row=1;
		while(row<=z){
			col=1;
			while(col<=row){
				System.out.print("\t");
				col=col+1;
			}
			col=z-row+1;
			val=z-row+1;
			while(col!=0){
				System.out.print(val +"\t");
				val=val+1;
				col=col-1;
			}
			col=z-row;
			val=2*(z-row);
			while(col>0){
				System.out.print(val + "\t");
				val=val-1;
				col=col-1;
			}
			
			System.out.println();
			row=row+1;
		}
	}
}
