package com.xl.sercurity;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class DES {

	private KeyGenerator keygen;
	private SecretKey deskey;
	private Cipher cipher;
	private byte[] cipherByte;

	public DES() throws NoSuchAlgorithmException, NoSuchPaddingException {
		keygen = KeyGenerator.getInstance("DES");
		deskey = keygen.generateKey();
		cipher = Cipher.getInstance("DES");
	}

	public byte[] Encrytor(String str) throws InvalidKeyException,
		IllegalBlockSizeException, BadPaddingException {
		cipher.init(Cipher.ENCRYPT_MODE, deskey);
		byte[] src = str.getBytes();
		cipherByte = cipher.doFinal(src);
		return cipherByte;
	}

	public byte[] Decryptor(byte[] buff) throws InvalidKeyException,
		IllegalBlockSizeException, BadPaddingException {
		cipher.init(Cipher.DECRYPT_MODE, deskey);
		cipherByte = cipher.doFinal(buff);
		return cipherByte;
	}

	public static void main(String[] args) throws Exception {
		DES de1 = new DES();
		String msg ="皇子讲java密码技术";
		byte[] encontent = de1.Encrytor(msg);
		byte[] decontent = de1.Decryptor(encontent);
		System.out.println("明文:" + msg);
		System.out.println("密文:" + new String(encontent));
		System.out.println("解密:" + new String(decontent));
	}

}
