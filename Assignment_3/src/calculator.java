import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		boolean a = true;
		while (a) {
			
			char ch = scn.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == 'x' || ch == 'X') {
				int result = 0;
				
				int num1 = scn.nextInt();
				
				int num2 = scn.nextInt();
				if (ch == 'x' || ch == 'X') {
					break;

				} else if (ch == '+') {
					result = num1 + num2;
					System.out.println(result);
				} else if (ch == '-') {
					result = num1 - num2;
					System.out.println(result);
				} else if (ch == '*') {
					result = num1 * num2;
					System.out.println(result);
				} else if (ch == '/') {
					result = num1 / num2;
					System.out.println(result);
				} else if (ch == '%') {
					result = num1 % num2;
					System.out.println(result);
				}
				
				}else{
					System.out.println("Invalid Operation.Try Again.");
			}
		}
	}
}
