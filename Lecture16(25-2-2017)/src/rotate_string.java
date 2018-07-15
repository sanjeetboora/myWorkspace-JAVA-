
public class rotate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotatesentence("abcd efg ijklm nop qrstuvw", 2, 1));
	}

	public static String rotatesentence(String str, int rword, int lletter) {
		String[] words = str.split(" ");
		rword = rword % words.length;
		if (rword < 0) {
			rword = rword + words.length;
		}
		// logic
		String temp = words[0];
		for (int i = 0; i < rword; i++) {

			words[i] = words[i + 1];
			words[i] = temp;
		}
		for (int i = 0; i < words.length; i++) {
			words[i] = rotatetheword(words[i], lletter);
		}
		String joinedString = String.join(" ", words);
		return str.join(" ", words);

	}

	public static String rotatetheword(String word, int cr) {
		char[] chars = word.toCharArray();
		// cr=cr*-1;
		cr = cr % chars.length;
		if (cr < 0) {
			cr = cr + chars.length;
		}
		// logic to rotate words array
		for (int i = 0; i < chars.length; i++) {
			rotateleft(chars, cr);
		}
		return word;
	}

	public static void rotateleft(char[] arr, int rot) {
		char temp = arr[0];
		for (int i = 0; i < rot - 1; i++) {
			arr[i] = arr[i + 1];
			arr[i] = temp;
		}

	}
}
