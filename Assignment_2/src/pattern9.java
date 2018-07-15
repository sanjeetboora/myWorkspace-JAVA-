import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int row=1,col=1,val=1;
		while(row<=N){
			col=1;
			val=1;
			while(col<=row){
				System.out.print(val + "\t");
				val=val+1;
				col=col+1;
			}
			col=1;
			int k =(N-row);
			col=k;
			while(col>0){
				System.out.print("\t");
				col=col-1;
			}
			col=1;
			 k =(N-row-1);
			col=k;
			while(col>0){
				System.out.print("\t");
				col=col-1;
			}
			col=1;
			val=row;
			while(col<=row && val!=0){
				if(val==N){
					val=val-1;
				}
				System.out.print(val + "\t");
				val=val-1;
				col=col+1;
			}
			System.out.println();
			row=row+1;
			
		}
		

	}

}
