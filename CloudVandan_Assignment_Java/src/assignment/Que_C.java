package assignment;

public class Que_C {

	
    public static boolean isPangram(String str) {
       
        str = str.toLowerCase();
        
        boolean[] alphabet = new boolean[26];
        
       
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a';
                alphabet[index] = true;
            }
        }
        
        // Check if all letters from 'a' to 'z' are present
        
        for (boolean letter : alphabet) {
            if (!letter) 
                return false; 
            
        }
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "The quick brown fox jumps over the lazy dog";
	        System.out.println();
	        boolean isPangram = isPangram(input);
	        
	        if (isPangram) {
	        	System.out.println();
	            System.out.println("The input is a pangram.");
	        } else {
	        	System.out.println();
	            System.out.println("The input is not a pangram.");
	        }
	        
	       
	        
		
		

	}

}
