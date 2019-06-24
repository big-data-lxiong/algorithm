package com.xl.string;

import java.util.ArrayList;
import java.util.List;

public class SubStringList {

  public static void main(String[] args){
    String str = "abcdefg";

    List<String> list = new ArrayList<>();

    int len = str.length();
    for(int i = 0; i < len; i++){
      for(int j = i + 1; j < len + 1; j++){
        list.add(str.substring(i,j));
      }
    }

    list.forEach(x -> System.out.println(x));

  }

}
