import java.util.Scanner;

public class Check_if_num_is_armstrong {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number ");
		int N = scn.nextInt();
		System.out.println (armstrong(N));

}
	public static boolean armstrong(int num) {
		int rem=0,arm=0,n=num;
		boolean flag =true;
		while(num!=0){
			rem=num%10;
			arm=arm+(int)Math.pow(rem,3);
			num=num/10;
	}
		if(arm==n){
			flag=true;
		}
		else{
			flag=false;
		}
		
		return flag;
	}
}