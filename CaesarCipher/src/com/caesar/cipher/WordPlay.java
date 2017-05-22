/**
 * 
 */
package com.caesar.cipher;

/**
 * @author yt85291
 *
 */
public class WordPlay {

	static public boolean isVowel(char ch)
	{
		String s1 = new String("aeiouAEOUI");
		// if ch is a vowel
		int idxVowel = s1.indexOf(ch);
		
		if(idxVowel == -1)
			return false;
		else
			return true;
	}
	static public String replaceVowels(String phrase, char ch)
	{
		StringBuilder sb = new StringBuilder(phrase);
		
		for(int idx=0; idx < sb.length();idx++)
		{
			if(isVowel(sb.charAt(idx)))
			{
				sb.replace(idx, idx+1, Character.toString(ch));
			}
		}
		return sb.toString();		
	}
	
  static public String emphasize (String phrase, char ch)
  {
	  StringBuilder sb = new StringBuilder(phrase);
	  
	  for (int idx=0; idx < sb.length(); idx++)
	  	{
		  if(isVowel(sb.charAt(idx)) == true && sb.charAt(idx) == ch || sb.charAt(idx) == Character.toLowerCase(ch))
		  {
			  if (idx % 2 == 0 )
			  {
			     sb.replace(idx, idx+1, Character.toString('*'));  
			  }
			  else {
				  sb.replace(idx,idx+1, Character.toString('+'));
			  }
		  }	  
	  	}
	  return sb.toString();
  }
	
}

