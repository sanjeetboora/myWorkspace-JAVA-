package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class separate_the_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int times = scn.nextInt();
		boolean flag = true;
		for (int i = 0; i < times; i++) {
			String str = scn.next();
			if (str.length() == 1) {
				System.out.println("No");
			} else {
				String first = "aa";
				int count = 1;
				boolean flag1 = false, flag2 = false;
				abc: for (int j = 0; j < str.length() / 2; j++) {
					flag = true;
					flag1 = false;
					int count1 = count;
					if (flag2) {
						first = str.substring(j - count, j);
					} else {
						first = str.substring(j, j + count);
					}
					Long one = Long.valueOf(first);
					int start = 0;
					if (flag2) {
						start = j;
					} else {
						start = j + count;
					}

					int last = Math.min(start + count, str.length());
					if (one % 9 == 0) {

						last = Math.min(start + count + 1, str.length());
						count++;
						flag1 = true;
					}
					String sec = str.substring(start, last);
					Long two = Long.valueOf(sec);

					if (!(two == one + 1) || (first.charAt(0) == '0') || (sec.charAt(0) == '0')) {
						flag = false;
						if (!flag1) {
							count++;
						}
						j--;
						continue abc;
					}
					if (last != str.length() && flag == true) {
						flag2 = true;
						continue abc;
					}
					if (flag == true) {
						break;
					} else {
						continue;

					}
				}
				if (flag == true) {
					System.out.println("Yes " + first);
				} else {
					System.out.println("N0");
				}
			}

		}

	}

}
