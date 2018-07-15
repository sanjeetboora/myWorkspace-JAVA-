import java.util.Scanner;

public class integral_part_of_sqrt {
	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	System.out.println("Enter number ");
	int N = scn.nextInt();
	System.out.println(sqrtinteg(N));

}
	public static int sqrtinteg(int num) {
		double a=1.0;
		int i=1,b=1,x=num;
		while(i<=num/2){
			a=num/(i*i);
			if(a==1){
			  b=i;
			}
			i=i+1;
		}
		if(x==0){
			b=0;
		}
		return b;
	}
	}
