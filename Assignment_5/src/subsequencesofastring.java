import java.util.Scanner;
public class subsequencesofastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
	subsequences(str);
	}
	public static void subsequences(String str){
	//	import java.util.*;
		//ArrayList<Integer>al=new ArrayList<>;
		//al.
		for (int j = 0; j < str.length(); j++){
			for (int i = j+1; i <= str.length(); i++) {
				
				String a=str.substring(j,i);
				StringBuilder sb = new StringBuilder(a);
				System.out.println(sb);
			}
	}
	}
}
