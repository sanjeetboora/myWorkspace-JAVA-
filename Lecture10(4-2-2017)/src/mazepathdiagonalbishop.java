
import java.util.Scanner;

public class mazepathdiagonalbishop {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	printmazepath(0, 0, 2, 2,"");
	}

	public static void printmazepath(int cc, int cr, int ec, int er,String ans) {
		if (cc > ec || cr > er) {
			return ;
		}
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}

		printmazepath(cc, cr + 1, ec, er,ans+"V");
		printmazepath(cc + 1, cr, ec, er,ans+"H");
		int i=1;
		while(cc+i<=ec && cr+i<=er){
		printmazepath(cc + i, cr+i, ec, er,ans+"D"+i);
		i++;
		}

	}
}

