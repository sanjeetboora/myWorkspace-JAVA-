import java.util.Scanner;

public class Walking_robots {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			int result = howManyCollisions(sb);
			System.out.println(result);
		}
	}

	public static int howManyCollisions(StringBuilder s) {
		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			char first = s.charAt(i);
			if (first == 'r') {
				if(i <s.length() - 1.){
				for (int j = i + 1; j <=s.length() - 1; j++) {
					if (s.charAt(j) == 'l') {
						s.setCharAt(j, 'd');

						count += 2;
						break;
					} else if (s.charAt(j) == 'd') {
						//s.setCharAt(j,'m');
						count += 1;
						break;
					}
				}
				}
				else{
					continue;
				}
			} 
			else if (first == 'l') {
				if (i > 0) {
					for (int j = i - 1; j >= 0; j--) {
						if (s.charAt(j) == 'r') {
							s.setCharAt(j, 'd');
							count += 2;
							break;
						} else if (s.charAt(j) == 'd') {
							//s.setCharAt(j,'m');
							count += 1;
							break;
						}
					}
				} else {
					continue;
				}
			} 
			else if (first == 'd') {
				//s.setCharAt(i,'m');
				
				continue;

			}else{
				continue;
			}
		}
		return count;
	}

}
