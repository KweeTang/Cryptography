package com.caesar.cipher;

import org.junit.Test;
import edu.duke.*;

public class CaeserCipherTest {
	
	@Test
	public void testCaesar()
	{
	 System.out.println(CaesarCipher.encrypt("First legion attach East Flank!", 23));
	 
	 System.out.println(CaesarCipher.encryptTwoKeys("First Legion", 23, 17));
		
	/*
	    int key = 23;
		
		FileResource fr = new FileResource();
		String message = fr.asString();
		String encrypted = CaesarCipher.encrypt(message, key);
		System.out.println("key is " + key + "\n" + encrypted);
	*/ 
	}
}
