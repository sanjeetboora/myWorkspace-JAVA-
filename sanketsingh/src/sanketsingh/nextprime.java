package sanketsingh;

public class nextprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(NextPrime(4));
	}public static int NextPrime(int n){
		    int i = n;
		    for (; i < 2 * n; --i)
		    {
		    	if(ifprime(i)){
		    		break;
		    	}
		    }return i;
		}
	public static boolean ifprime(int n){
		boolean val=true;
		int i=2;
		int rem=0;
		while(i*i<=n){
			rem = n % i;
			if(rem==0){
				val =false;
				return val;
				}
			i=i+1;
		}return val;
	}

}
