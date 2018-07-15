package ALGORITHMS.STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class gem_stones {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String[] s=new String[n];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	        int count=0;
	        int val=0;
	        for(char c='a';c<='z';c++){
	            
	            for(int i=0;i<n;i++){
	                
	                if(s[i].contains(String.valueOf(c))==true){
	                    count=count+1;
	                }
	                
	            }
	            if(count==n){
	               val=val+1; 
	            }
	            count=0;
	            
	        }
	        System.out.println(val);
	    }
	}
}

//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int num = scn.nextInt();
//		int count = 0;
//		int[] arr1 = new int[26];
//		for (int j = 1; j <= num; j++) {
//			String str = scn.next();
//			char[] strarr=str.toCharArray();
//			Arrays.sort(strarr);
//			arr1[str.charAt(0) - 97] += 1;
//			for (int i = 1; i < str.length(); i++) {
//				if (strarr[i]!=strarr[i-1]) {
//					arr1[str.charAt(i) - 97] += 1;
//				}
//			}
//
//		}
//		for (int z = 0; z < 26; z++) {
//			if (arr1[z] == num) {
//				count++;
//			}
//		}
//		System.out.println(count);
//
//	}
//}
