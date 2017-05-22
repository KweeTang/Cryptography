package com.caesar.cipher;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordPlayTest {
	
	@Test
	public void testIsVowelPositive()
	{
		boolean result1 = WordPlay.isVowel('a');
		assertEquals(true, result1);
	}
	
	@Test
	public void testIsVowelNegative()
	{
		boolean result2 = WordPlay.isVowel('A');
		assertEquals(true, result2);
	}
	
	@Test
	public void testReplaceVowels()
	{
		String results = WordPlay.replaceVowels("Hello World", '*');	
		System.out.println(results);
		// assertEquals("H*ll* W*rld", results);
	}
	
	@Test
	public void testEmphasize()
	{
		String results = WordPlay.emphasize("Hello World", 'o');
		System.out.println(results);
	}
	
}
