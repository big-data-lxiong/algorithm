package com.xl.string;

import java.util.ArrayList;

public class WordCount {

  public static void main(String[] args){
    String str = "hello   ni      hao  !";
    ArrayList<String> list = new ArrayList<String>();

    String[] arr = str.split(" ");

    for(String s : arr){
      if(s.length() > 0){
        list.add(s);
      }
    }

    System.out.println(list.size());


  }

}
