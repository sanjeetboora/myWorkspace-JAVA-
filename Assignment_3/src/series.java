import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int N1 = scn.nextInt();
		System.out.println("Enter 2nd number ");
		int N2 = scn.nextInt();
		printarmstrong(N1,N2);

}
	public static void printarmstrong(int num1,int num2) {
		int i=1,s=0,count=1;
		while(count<=num1){
			s=3*i+2;
			if(s%num2!=0){
				System.out.println(s);
				count=count+1;
			}
			i=i+1;
			
		}
	}

}
