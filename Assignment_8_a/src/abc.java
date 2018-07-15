
public class abc {

	public static void main(String[] args) {
		nokiia("123", "");

	}

	public static String nokiia(String str, String osf) {
		if (str.length() == 0) {
			// System.out.println(osf);
			return osf;
		}
//		for (int i = 0; i < str.length() - 1; i++) {
//			char cc = str.charAt(i);

			String ros = str.substring(1);
			for (int j = 0; j < 3; j++) {
				osf=((str.charAt(0)-'1')*3+'a')+nokiia(ros,osf);
				
			}
		return osf;
	}}


