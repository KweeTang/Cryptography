package com.caesar.cipher;

import org.junit.Test;
import edu.duke.*;

public class CaeserCipherTest {
	
	@Test
	public void testCaesar()
	{
	 System.out.println(CaesarCipher.encrypt("First legion attach East Flank!", 23));
	 
	 System.out.println(CaesarCipher.encryptTwoKeys("First Legion", 23, 17));
		
	}
}
