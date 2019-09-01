package com.xl.serilizable;

import java.io.*;

public class TransientReadTest {

	public static void main(String[] args) {

		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
				"/Users/lxiong1/ebay/code/algorithm/src/main/resources/user.txt"));
			User user = (User) is.readObject(); // 从流中读取User的数据
			is.close();

			System.out.println("\nread after Serializable: ");
			System.out.println("username: " + user.getUsername());
			System.err.println("password: " + user.getPasswd());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
