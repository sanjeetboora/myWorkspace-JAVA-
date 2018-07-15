
public class detecting_pattern_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="cccbacc";
		String patt="cba";
		System.out.println(bruteforcing(src,patt ));

	}

	public static int bruteforcing(String src, String patt) {
		int i = 0, j = 0;
		while (i <= src.length() - patt.length()) {
			j = 0;
			while (j < patt.length()) {
				if (src.charAt(i + j) != (patt.charAt(j))) {
					break;
				}
				j++;
			}
			if (j == patt.length()) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
