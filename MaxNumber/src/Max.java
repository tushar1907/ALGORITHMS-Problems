
//Calculate maximum value using ‘+’ or ‘*’ sign between two numbers in a string

public class Max {

	public static void main(String[] args) {
		String str = "01891"; 
        System.out.println(calcMaxValue(str)); 

	}
	
	
	static int calcMaxValue(String str) {
		
		int res = str.charAt(0) - '0';
		
		for(int i=1; i< str.length(); i++) {
			if(str.charAt(i) == '0' || str.charAt(i) == '1' || res < 2) {
				res = res + (str.charAt(i) - '0');
			}
			else {
				res = res * (str.charAt(i) - '0');
			}
		}
		
		return res;
		
	}
}
