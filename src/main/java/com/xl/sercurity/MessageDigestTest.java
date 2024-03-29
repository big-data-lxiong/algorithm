package com.xl.sercurity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		String source = "123123";
		String md5Str = getMd5(source);


		System.out.println(md5Str);

	}

	/**
	 * 通过md5进行加密
	 * @param source 要加密的数据
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private static String getMd5(String source) throws NoSuchAlgorithmException {
		//1.获取MessageDigest对象
		MessageDigest digest = MessageDigest.getInstance("md5");

		//2.执行加密操作
		byte[] bytes = source.getBytes();

		//在MD5算法这，得到的目标字节数组的特点：长度固定为16
		byte[] targetBytes = digest.digest(bytes);

		//3.声明字符数组
		char [] characters = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		//4.遍历targetBytes
		StringBuilder builder = new StringBuilder();
		for (byte b : targetBytes) {
			//5.取出b的高四位的值
			//先把高四位通过右移操作拽到低四位
			int high = (b >> 4) & 15;

			//6.取出b的低四位的值
			int low = b & 15;

			//7.以high为下标从characters中取出对应的十六进制字符
			char highChar = characters[high];

			//8.以low为下标从characters中取出对应的十六进制字符
			char lowChar = characters[low];

			builder.append(highChar).append(lowChar);
		}

		return builder.toString();
	}

}
