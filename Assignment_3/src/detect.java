import java.util.Scanner;

public class detect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scn = new Scanner(System.in);

			System.out.println("Enter  number ");
			int num= scn.nextInt();
			int prev= scn.nextInt();
			int counter=2;
			boolean down=true;
			while(counter<=num){
				int curr =scn.nextInt();
				if(down){
					if(curr>prev){
						down=false;
					}
				}
				else{
					if(curr<prev){
						System.out.println("false");
						return;
					}
				}
				prev=curr;
				counter++;
			}
			System.out.println("true");
	}
}
