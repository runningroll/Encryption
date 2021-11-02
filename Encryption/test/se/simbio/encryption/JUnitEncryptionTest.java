/* Copyright (C) 2021 Sarun Makarabhiromya - All Rights Reserved
 * You may use, distribute and modify this code under the terms of the MIT license.
 */

package se.simbio.encryption;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;


import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNull;

public class JUnitEncryptionTest {
	
	   @Test 
	    public void testEncryptFunction() throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException, BadPaddingException, IllegalBlockSizeException {
	    	Encryption encryption  = Encryption.getDefault("key", "salt", new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
	    	assertNotNull(encryption);
	    	String data = null;
	    	assertNull(encryption.encrypt(data));
	    	
	    	encryption  = Encryption.getDefault("key", "salt", new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
	    	assertNotNull(encryption);
	    	data = "encrypting";
	    	assertNotNull(encryption.encrypt(data));
	    }
	    
	    @Test 
	    public void testDecryptFunction() throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException, BadPaddingException, IllegalBlockSizeException {
	    	Encryption encryption  = Encryption.getDefault("key", "salt", new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
	    	assertNotNull(encryption);
	    	String data = null;
	    	assertNull(encryption.decrypt(data));
	    	
	    	encryption  = Encryption.getDefault("key", "salt", new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
	    	assertNotNull(encryption);
	    	data = "encrypting";
	    	String encrypted = encryption.encrypt(data);
	    	assertNotNull(encryption.decrypt(encrypted));
	    }
	    
	   
	    
}
