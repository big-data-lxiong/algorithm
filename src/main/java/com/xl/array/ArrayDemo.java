package com.xl.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {

  public static void main(String[] args){
    int[] arr = new int[5];
    Integer[] arr1 = {1,2,3,4,4};
    int[] arr2 = new int[]{1,2,3,4,5,6};

    int[][] arr4 = new int[1][2];
    int[][] arr5 = {{1},{1}};
    int[][] arr6 = new int[][]{{1},{3}};

    int a = 999999999;

    Comparator cmp = new ComparatorImp();

    Arrays.sort(arr1, cmp);

//    for (Integer aa: arr1){
//      System.out.println(aa.toString());
//    }

    Arrays.stream(arr1).forEach(aaa -> {System.out.print(aaa);});
  }

}
