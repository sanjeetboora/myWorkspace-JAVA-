package Class;

import java.util.Scanner;

public class pattern2 {

		public static Scanner scn=new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number=scn.nextInt();
			int row=1;
			int col=1;
			printpattern1(number,row,col);
		}
		public static void printpattern1 (int num,int row,int col){

			if(row>num ){
				return;
			}if(col>row){
				
				printpattern1 (num,row+1,1);
				if(col!=num+1){
				System.out.println();
				}
				return;
			}
		
				printpattern1 (num,row,col+1);
				System.out.print("*");
			}
		}

