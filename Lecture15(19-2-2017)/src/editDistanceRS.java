
public class editDistanceRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abdgf";
		String s2 = "acdsf";
		System.out.println(editdistance(s1, s2, new int[s1.length() + 1][s2.length() + 1]));

	}

	public static int editdistance (String s1, String s2, int[][] storage){
	if(s1.length()==0){
		return s2.length();
	}
	if(s2.length()==0){
		return s1.length();
	}
	char ch1=s1.charAt(0);
	String ros1=s1.substring(1);

	char ch2=s2.charAt(0);
	String ros2=s2.substring(1);int rv=0;
    if(ch1==ch2){
	 rv=0+editdistance(ros1,ros2,storage);
}
else{
	int frp=1+editdistance(ros1,ros2,storage);
	int fin=1+editdistance(ros1,s2,storage);
	int frm=1+editdistance(s1,ros2,storage);
	rv=Math.min(frm,Math.min(fin, frp));
}
    storage[s1.length()-1][s2.length()-1] = rv;
    return storage[0][0];
}
}
