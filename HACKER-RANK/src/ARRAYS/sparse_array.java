package ARRAYS;
import java.util.*;
import java.util.Scanner;

public class sparse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    int N= s.nextInt();
	    int Q = 0;
	    int count = 0;
	    String[] str = new String[N];

	    for(int i = 0; i < N; i++) {
	    	str[i] = s.next();
	    }

	    while(s.hasNextInt())
	        N = s.nextInt();

	    String[] strToCheck = new String[N];
	    for(int i = 0; i < N; i++) {
	    	strToCheck[i] = s.next();
	    }

	    for(int j = 0; j < strToCheck.length; j++){
	        for(int i = 0; i < str.length; i++){
	            if(str[i].equals(strToCheck[j]))
	               count++;
	        }
	        System.out.println(count);
	        count = 0;
	    }
	}
	}