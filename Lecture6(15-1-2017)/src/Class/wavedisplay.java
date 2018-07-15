package Class;

public class wavedisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=TwoDarrayTakeInput.takerectinput();
		//TwoDarrayTakeInput.display(TwoDarrayTakeInput.takerectinput());
		wavedisplay(arr);

	}
	public static void wavedisplay(int arr[][]) {
		for (int col=0;col<arr[0].length;col++) {
			if(col%2==0){
				for(int row=0;row<arr.length;row++){
					System.out.print(arr[row][col]);
				}
				
			}else{
				for(int row=arr.length-1;row>=0;row--){
					System.out.print(arr[row][col]);
				}
		}
			
	}
	}
}


