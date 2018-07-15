import java.util.Scanner;

public class Main {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
		System.out.println(ifexpressionbalanced(data, ""));
	}
	public static int abc(String data){
		if (data.length() == 0) {
			return 0;
			} 
	     
		
		return 0;
	}
	     public static boolean expressionbalanced(String data) {
	    	 for(int i=0;i<data.length();i++){
		    	 char ch = data.charAt(i);
		    	 if ("[{(".indexOf(ch) == -1 && "]})".indexOf(ch) == -1){
		    		 return true;
		    	 }
		    	 else{
		    		 return false;
		    	 }
	     }
	     }
	public static boolean ifexpressionbalanced(String data, String brcktexp) {
		if (data.length() == 0) {
			if (brcktexp.length() == 0) {
				return true;
			} 
			else {
				return false;
			}
		}

		char ch = data.charAt(0);
		String ros = data.substring(1);
		if ("[{(".indexOf(ch) != -1) {
			return ifexpressionbalanced(ros, brcktexp + ch);
		} 
		if ("[{(".indexOf(ch) == -1 && "]})".indexOf(ch) == -1 ) {
			return ifexpressionbalanced(ros, brcktexp);
		} 
		else if ("]})".indexOf(ch) != -1) {
			if (brcktexp.length() == 0) {
				return false;
			}
		}
		char lb = brcktexp.charAt(brcktexp.length() - 1);
		if ("[{(".indexOf(lb) != "]})".indexOf(ch)) {
			return false;
		} 
		else {
			return ifexpressionbalanced(ros, brcktexp.substring(0, brcktexp.length() - 1));
		}

	}

}
