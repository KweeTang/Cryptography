package com.caesar.cipher;

public class CaesarCipher {
	public static String encrypt(String input, int key)
	{
		// Write down alphabet
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// Compute the shifted alphabet using the key
		String ShiftedAlphabet = Alphabet.substring(key) + Alphabet.substring(0, key);
		
		// Make a StringBuilder with the String input
		StringBuilder encrypted = new StringBuilder(input);
		
		// Loop through each character in the input string
		for (int i=0; i < encrypted.length(); i++) {
			   // Look at the individual character in the encrypted string
			   char currChar = encrypted.charAt(i);
			   
			   // Check if currChar is lower case
			   boolean LowerCase = Character.isLowerCase(currChar);
			   
			   // If currChar is lower case, convert to upper case
			   if (LowerCase)
			   {
				   currChar = Character.toUpperCase(currChar);
			   }
			   
			   // Find the index of the current character in the Alphabet
			   int idx = Alphabet.indexOf(currChar);
			   
			  if (idx != -1)
			    { // current Char is in the Alphabet
				  // compute new character
				  char newChar = ShiftedAlphabet.charAt(idx);
				  
				  if (LowerCase) {
					  newChar = Character.toLowerCase(newChar);
				  }
				  
				  // Substitute currChar in Encrypted string with newChar
				  encrypted.setCharAt(i, newChar);
			   }
		  }
		// return encrypted string
		return encrypted.toString();
	}
	
	public static String encryptTwoKeys (String input, int key1, int key2)
	{
		// Write down Alphabet
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// Compute shifted alphabet (even)
		String ShiftedAlphabetEven = Alphabet.substring(key1) + Alphabet.substring(0, key1);
		
		// Compute shifted alphabet (odd)
		String ShiftedAlphabetOdd = Alphabet.substring(key2) + Alphabet.substring(0, key2);
		
		// Convert input to StringBuffer type
		StringBuffer sb = new StringBuffer(input);
		
		for (int i=0; i<sb.length(); i++)
		{ // Look at each character in the sb
		  char currChar = sb.charAt(i);	
			
		  // Find the index of the currChar
		  int idx = Alphabet.indexOf(currChar);
			
		  if (idx != -1)
		  	{	
			  if(i%2 == 0) {
		        // Look for the corresponding character in ShiftedAlphabetEven
				char newChar = ShiftedAlphabetEven.charAt(idx);
				sb.setCharAt(i, newChar);
			  }
			  else { // Look for the corresponding character in ShifteAlphabetOdd
				     char newChar = ShiftedAlphabetOdd.charAt(idx);
				     sb.setCharAt(i, newChar);
			  } 
			 // Replace currChar with newChar in sb
			 
		  	}
		  
		}
	 return sb.toString();	
	}
}
