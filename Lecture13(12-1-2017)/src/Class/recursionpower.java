package Class;

public class recursionpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(9, 3));
	}

	public static int power(int x, int pow) {
		if (pow == 0) {
			return 1;
		}
		int a = pow / 2;
		int xpow = power(x, a);
		if (pow % 2 == 0) {
			return xpow * xpow;
		} else if (pow % 2 != 0) {
			return xpow * xpow * x;
		}
		return 1;
	}
}
