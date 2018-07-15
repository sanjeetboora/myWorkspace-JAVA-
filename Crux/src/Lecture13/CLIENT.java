package Lecture13;

import java.util.ArrayList;

public class CLIENT {

	public static void main(String[] args) {
//		System.out.println(getboardpath(3, 0));
		// permutationpart2("Sanket", "");
//		System.out.println(getMPWDiag(2, 2, 0, 0));
		// printmpwdiag(2, 2, 0, 0," ");
		printss("abdc", "");

	}

	public static ArrayList<String> getboardpath(int size, int current) {
		// positive base case
		if (current == size) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("\n");
			return baseresult;

		}
		if (current > size) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}

		ArrayList<String> recresult = null, myresult = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			// i is the value on the dice
			recresult = getboardpath(size, current + i);
			for (int j = 0; j < recresult.size(); j++) {
				myresult.add(i + "," + recresult.get(j));
			}
		}
		return myresult;
	}

	public static void printss(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printss(ros, osf + "");
		printss(ros, osf + cc);
	}

	public static void printssWASCII(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printssWASCII(ros, osf + "");
		printssWASCII(ros, osf + cc);
		printssWASCII(ros, osf + (int) cc);
	}

	public static void permutation(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			permutation(ros, osf + cc);
		}

	}

	public static void permutationpart2(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}
		boolean[] used = new boolean[26];
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			if (used[cc - 'a'] == false) {
				permutationpart2(ros, osf + cc);
				used[cc - 'a'] = true;
			}

		}
	}

	public static int countmazepath(int endrow, int endcol, int currentrow, int currentcol) {
		if (currentrow == endrow && currentcol == endcol) {
			return 1;
		}
		if (currentrow > endrow || currentcol > endcol) {
			return 0;
		}
		int myresult = 0;
		int hresult = countmazepath(endrow, endcol, currentrow, currentcol + 1);

		int vresult = countmazepath(endrow, endcol, currentrow + 1, currentcol);
		myresult = hresult + vresult;
		return myresult;
	}

	public static int countmazepathWdiagonal(int endrow, int endcol, int currentrow, int currentcol) {
		if (currentrow == endrow && currentcol == endcol) {
			return 1;
		}
		if (currentrow > endrow || currentcol > endcol) {
			return 0;
		}
		int myresult = 0, dresult = 0;

		int hresult = countmazepathWdiagonal(endrow, endcol, currentrow, currentcol + 1);

		int vresult = countmazepathWdiagonal(endrow, endcol, currentrow + 1, currentcol);

		if (currentrow == currentcol || currentrow + currentcol == endcol) {
			dresult = countmazepathWdiagonal(endrow, endcol, currentrow + 1, currentcol + 1);
		} else
			dresult = 0;
		myresult = hresult + vresult + dresult;
		return myresult;
	}

	public static int countmazepathWdiagonalWithoutcondition(int endrow, int endcol, int currentrow, int currentcol) {
		if (currentrow == endrow && currentcol == endcol) {
			return 1;
		}
		if (currentrow > endrow || currentcol > endcol) {
			return 0;
		}
		int myresult = 0, dresult=0;

		int hresult = countmazepathWdiagonalWithoutcondition(endrow, endcol, currentrow, currentcol + 1);

		int vresult = countmazepathWdiagonalWithoutcondition(endrow, endcol, currentrow + 1, currentcol);

		dresult = countmazepathWdiagonalWithoutcondition(endrow, endcol, currentrow + 1, currentcol + 1);

		myresult = hresult + vresult + dresult;
		return myresult;
	}

	public static ArrayList<String> getMPWDiag(int endrow, int endcol, int currentcol, int currentrow) {
		ArrayList<String> recresult = null;
		ArrayList<String> myresult = new ArrayList<>();
		if (currentrow == endrow && currentcol == endcol) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("\n");
			return baseresult;
		}
		if (currentrow > endrow || currentcol > endcol) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}

		ArrayList<String> hresult = new ArrayList<>();
		ArrayList<String> vresult = new ArrayList<>();
		ArrayList<String> dresult = new ArrayList<>();
		hresult = getMPWDiag(endrow, endcol, currentrow, currentcol + 1);
		vresult = getMPWDiag(endrow, endcol, currentrow + 1, currentcol);
		dresult = getMPWDiag(endrow, endcol, currentrow + 1, currentcol + 1);
		for (int i = 0; i < hresult.size(); i++) {
			myresult.add("H" + hresult.get(i));
		}
		for (int j = 0; j < vresult.size(); j++) {
			myresult.add("V" + vresult.get(j));
		}
		for (int k = 0; k < dresult.size(); k++) {
			myresult.add("D" + dresult.get(k));
		}

		return myresult;
	}

	public static void printmpwdiag(int endrow, int endcol, int currentcol, int currentrow, String psf) {
		if (currentrow == endrow && currentcol == endcol) {
			System.out.println(psf);
			return;
		}
		if (currentrow > endrow || currentcol > endcol) {
			return;
		}
		printmpwdiag(endrow, endcol, currentcol + 1, currentrow, psf + "H");
		printmpwdiag(endrow, endcol, currentcol, currentrow + 1, psf + "V");
		printmpwdiag(endrow, endcol, currentcol + 1, currentrow + 1, psf + "D");

	}
}
