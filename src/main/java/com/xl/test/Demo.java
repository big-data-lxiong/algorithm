package com.xl.test;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo {

  public static void main(String[] args){
    int[] arr = {1, 1, 1, 1};
    int k = 0;
    TreeSet<Integer> set = dedupe(arr);

    if(k==0){
      System.out.println("the result is :" + set.size());
    }else {
      Object[] arr1 = set.toArray();
      int count = 0;

      for (int i = 0; i < arr1.length; i++) {
        int a = (Integer) arr1[i];
        if(set.contains(a - k)){
          count++;
        }
      }

      System.out.println("the result is :" + count);
    }
  }

  private static TreeSet<Integer> dedupe(int[] arr) {
    TreeSet<Integer> set = new TreeSet<Integer>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }

    return set;
  }


}
