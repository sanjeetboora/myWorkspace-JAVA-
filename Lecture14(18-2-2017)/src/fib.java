import java.util.Scanner;

public class fib {

	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		System.out.println(fibofN(number));
	}
	public static int fibofN(int num){
		if(num==0||num==1){
			return num;
		}
		int fbnm1=fibofN(num-1);
		int fbnm2=fibofN(num-2);
		int fbn= fbnm1+ fbnm2;
		return fbn;
	}
}
