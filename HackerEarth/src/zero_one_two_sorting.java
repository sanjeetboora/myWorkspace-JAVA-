import java.util.ArrayList;
import java.util.Scanner;

public class zero_one_two_sorting {


		public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			String data = scn.nextLine();
			System.out.println(sortit(data));
		}

	public static ArrayList<String> sortit(String str) {
		int count=0,count1=0;
			ArrayList<String> myResult = new ArrayList<>();			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)=='0'){
					myResult.add(0,"0");
					count++;
				}
				else if(str.charAt(i)=='1'){
					myResult.add(count,"1");
					count1++;
				}
				else if(str.charAt(i)=='2'){
					myResult.add("2");
				}
			}
			return myResult;
		}


}
