
public class rotatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotate(421635, -957));
	}

	public static int rotate(int num, int rot) {
		int count = 0, copy = num;
		while (copy != 0) {
			copy = copy / 10;
			count = count + 1;
		}
		
			rot=rot%count;
		if(rot<0){
			rot=rot+count;
		}
//		if (rot > 0) {
//			for (int i = 0; i < rot; i++) {
//
//				int rem = num % 10;
//				num = num / 10;
//				num = ((int) rem * (int) Math.pow(10, count - 1)) + num;
//			}
//		}
//		if (rot < 0) {
//			for (int i = 0; i > rot; i--) {
//				int rem = num % 10;
//				num = num / 10;
//				num = ((int) rem * (int) Math.pow(10, count - 1)) + num;
//			}
//		}
		int divisor=int Math.pow(10, rot) ;
		int fp=num/10;
		int sp=num/10;
		
		
		return num;
	}
}
