import java.util.Scanner;

//	Take as input N, a number. Write a recursive function which prints counting from
//	1 to N in lexicographical order. In lexicographical (dictionary) order 10, 100 and
//	109 will be printed before 11.
public class ques_8 {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int target = scn.nextInt();
		lexi(0,target);
		
		}

	public static void lexi(long s, long num) {
		if (s == num) {
			System.out.println(s);
			return;
		}
		if (s > num) {
			return;
		}

		System.out.println(s);
		for (int i = (s == 0 ? 1 : 0); i <= 9; i++) {

			lexi(10 * s + i, num);

		}
	}

}
