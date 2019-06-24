package com.xl.string;

import java.util.StringJoiner;

public class TestStringJoiner {

  public static void main(String[] args){
    String str = "";
    StringJoiner stringJoiner = new StringJoiner(",", "[", "]");

    stringJoiner.add("we").add("will").add("family");
    System.out.println(stringJoiner.toString());

  }

}
