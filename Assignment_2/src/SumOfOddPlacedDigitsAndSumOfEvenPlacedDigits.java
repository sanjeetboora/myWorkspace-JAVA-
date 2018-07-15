import java.util.Scanner;

public class SumOfOddPlacedDigitsAndSumOfEvenPlacedDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N=scn.nextInt();
		int oddsum=0;
		int evensum=0;
		int rem=0,count=0;
		while(N!=0){
			rem = N%10;
			if(count%2==0){
				evensum=evensum+rem;
			}
			else if(count%2 != 0){
				oddsum=oddsum+rem;
			}
			count=count+1;
			N=N/10;								
		}System.out.println("sum of odd placed digits = "+ oddsum);
		System.out.println("sum of even placed digits = "+ evensum);
	}

}
