



	// Java implementation to check if 
	// characters of a given string can 
	// be rearranged to form a palindrome 
	import java.io.*; 
	import java.util.*; 
	import java.math.*; 
	  
	class Check { 
	
		static int no_of_chars = 256;
		
		static boolean checkPalindrome(String str) {
			
			int count[] = new int[no_of_chars];
			Arrays.fill(count,0);
			
			for(int i=0;i<str.length();i++) {
				count[(int)(str.charAt(i))]++;
			}
			int odd = 0;
			
			for(int i=0; i<no_of_chars;i++) {
				if((count[i] & 1)==1)
					odd++;
				if(odd>1)
					return false;
			}
			
			return true;
			
		}
			
	
	
	  
	// Driver program 
	public static void main(String args[]) 
	{ 
	    if (checkPalindrome("geeksforgeeks")) 
	    System.out.println("Yes"); 
	    else
	    System.out.println("No"); 
	  
	    if (checkPalindrome("geeksogeeks")) 
	    System.out.println("Yes"); 
	    else
	    System.out.println("No"); 
	}
	}


