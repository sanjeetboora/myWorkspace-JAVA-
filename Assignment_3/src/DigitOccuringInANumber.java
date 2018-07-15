import java.util.Scanner;

public class DigitOccuringInANumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number ");
		int N = scn.nextInt();
		System.out.println("Enter digit ");
		int dig = scn.nextInt();
		
		System.out.println(digoccur(N,dig));

	}
	public static int digoccur(int num, int digit) {
		int i=1,rem=0,count=0;
		while(i<=num){
			rem=num%10;
			if(rem==digit){
				count=count+1;
			}
			
			num=num/10;
			i=i+1;
	}
		return count;
	}
}

