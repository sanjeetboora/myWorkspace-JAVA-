import java.util.ArrayList;
import java.util.Scanner;

public class getmazepath {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(getthemazepath(0, 0, 3, 3));
//		System.out.println(getthemazepath.size(0,0,3,3));
	}

	public static ArrayList<String> getthemazepath(int cc, int cr, int ec, int er) {
		if (cc > ec || cr > er) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}
		if (cc == ec && cr == er) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> vertresult = getthemazepath(cc, cr + 1, ec, er);
		ArrayList<String> horizresult = getthemazepath(cc + 1, cr, ec, er);
		for (int i = 0; i < horizresult.size(); i++) {
			myresult.add("H" + horizresult.get(i));
		}
		for (int i = 0; i < vertresult.size(); i++) {
			myresult.add("V" + vertresult.get(i));
		}
		return myresult;
	}

}
