import java.util.Scanner;

public class countboardpath {

	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		System.out.println(CBP(0,number));
	}
	public static int CBP(int curr,int last){
		
		if(curr==last){
			return 1;
		}
		if(curr>last){
			return 0;
		}
		int rv=0;
		for (int dice =1;dice<=6;dice++){
			rv+=CBP(curr+dice,last);
		}return rv;
	}
}
