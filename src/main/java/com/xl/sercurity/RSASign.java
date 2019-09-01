package com.xl.sercurity;

import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;

public class RSASign {

	public static byte[] sign(PrivateKey rsaPrivateKey, String msg) throws Exception{

		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(rsaPrivateKey.getEncoded());
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
		Signature signature = Signature.getInstance("MD5withRSA");
		signature.initSign(privateKey);
		signature.update(msg.getBytes());
		return signature.sign();
	}
	public static boolean verify(PublicKey rsaPublicKey, String msg, byte[] signatureByte) throws Exception {
		Signature signature = Signature.getInstance("MD5withRSA");
		signature = Signature.getInstance("MD5withRSA");
		signature.initVerify(rsaPublicKey);
		signature.update(msg.getBytes());
		return signature.verify(signatureByte);
	}

	public static void main(String[] args) throws Exception {
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(1024);
		KeyPair keyPair = keyPairGenerator.generateKeyPair();
		PublicKey rsaPublicKey = (RSAPublicKey)keyPair.getPublic();
		PrivateKey rsaPrivateKey = (RSAPrivateKey)keyPair.getPrivate();
		String msg = "皇子讲java密码技术";
		byte[] signature = RSASign.sign(rsaPrivateKey, msg);
		System.out.println("消息明文：" + msg);
		System.out.println("签名：" + new String(signature));
		boolean flag = RSASign.verify(rsaPublicKey, msg, signature);
		System.out.println("验签结果：" + flag);
	}

}
