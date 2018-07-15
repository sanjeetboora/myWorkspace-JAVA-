import java.util.Scanner;

public class frbRS {


	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		System.out.println(fibofN(number,new int[number+1]));
	}
	public static int fibofN(int num,int[]strg){
		if(num==0||num==1){
			return num;
		}
		if(strg[num]!=0){
			return strg[num];
		}
		int fbnm1=fibofN(num-1,strg);
		int fbnm2=fibofN(num-2,strg);
		int fbn= fbnm1+ fbnm2;
		strg[num]=fbn;
		return fbn;
	}
}

