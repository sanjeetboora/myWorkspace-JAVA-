package Class;

import java.util.Scanner;

public class pattern1 {
	public static Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=scn.nextInt();
		int row=1;
		int col=1;
		printpattern1(number,row,col);
	}
	public static void printpattern1 (int num,int row,int col){

		if(row>num){
			return;
		}if(col>row){
			System.out.println();
			printpattern1 (num,row+1,1);
			return;
		}
			System.out.print("*"+'\t');
			printpattern1 (num,row,col+1);
			
		}
	}

