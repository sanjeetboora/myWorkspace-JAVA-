
public class stack_balanced_expression {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack st = new stack(5);
		try {
			st.push(10);
			st.display();
			st.push(80);
			st.display();
			st.push(30);
			st.display();
			st.push(40);
			st.display();

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
	public static boolean brackets(String str)throws Exception{
		stack tt = new stack(5);

		char ch=str.charAt(0);
		String ros=str.substring(1);
		if ("[{(".indexOf(ch) != -1) {
			tt.push(ch);
			
			return ifexpressionbalanced(ros, brcktexp + ch);
		} 
			
		}
	}
	


