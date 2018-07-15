package longMay2018;

import java.util.HashMap;
import java.util.Scanner;

public class gcdequalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int i=2;i<=50000;i++) {
			 boolean flag=false;
			 for(int j=2;j<=Math.pow(i,0.5);j++) {
				 if(i%j==0) {
					 flag=true;
					 break;
				 }
			 }
			 if(flag==false) {
				 map.put(i, 0);
			 }
		 }
		 System.out.println(map.size());
//		 int test = scn.nextInt();
//		 for(int k=0;k<test;k++) {
//			 int num = scn.nextInt();
//			 for(int l=0;l<num;l++) {
//			
//			 } 
//		 }
	}

}
