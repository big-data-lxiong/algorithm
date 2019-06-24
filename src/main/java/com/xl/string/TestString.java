package com.xl.string;

public class TestString {

  public static void main(String[] args){
    String str1 = "xiong liang";
    String str2 = "xiong" + " liang";
    String str3 = "xiong " + "liang";
    System.out.println(str1 == str2);
    System.out.println(str2 == str3);
  }

}
