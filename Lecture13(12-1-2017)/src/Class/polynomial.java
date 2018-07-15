package Class;

public class polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(poly(3, 2));
	}

	public static int poly(int n, int x) {
		int b = x;
		int poly = 0;
		for (int i = n; i >= 1; i--) {
			poly+=i*b;
		b=b*x;
		}
		return poly;
	}
}
