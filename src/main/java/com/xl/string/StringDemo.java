package com.xl.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class StringDemo {

  public static void main(String[] args){
    String str = "ab ab ab  ab     ab   a a a a";
    StringBuilder sb = new StringBuilder();

    char[] chs = str.toCharArray();
    int len = chs.length;
    int i = 0;
    HashSet<Character> set = new HashSet<Character>();
    Stack stack = new Stack();

    System.out.println(sb.toString());
  }

}
