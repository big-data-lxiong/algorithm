package com.xl.string;

import java.util.StringTokenizer;

public class TestStringTokenizer {

  public static void main(String[] args){
    String str = "we  will     be         ";
    StringTokenizer stringTokenizer = new StringTokenizer(str);

    System.out.println(stringTokenizer.countTokens());

    while(stringTokenizer.hasMoreTokens()){
      System.out.println(stringTokenizer.nextToken());
    }
  }

}
