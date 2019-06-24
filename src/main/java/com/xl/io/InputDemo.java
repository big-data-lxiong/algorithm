package com.xl.io;

import java.util.Scanner;

public class InputDemo {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入第一串字符：");

    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = scanner.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(a[i]);
    }

    scanner.close();

  }

}
