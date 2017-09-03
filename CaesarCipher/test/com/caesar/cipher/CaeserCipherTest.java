package com.caesar.cipher;

import org.junit.Test;
import edu.duke.*;

public class CaeserCipherTest {
	
	@Test
	public void testCaesarEncrypt()
	{
	 System.out.println(CaesarCipher.encrypt("First legion attach East Flank!", 23));
	 
	}
	
	@Test
	public void testCaesarEncryptTwoKeys()
	{
		System.out.println(CaesarCipher.encryptTwoKeys("First Legion", 23, 17));
	}
	
}
