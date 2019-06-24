package com.xl.io;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayRange {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println("数组的个数：" + num);
    System.out.print("数组为：");
    int[] arr = new int[num];
    for(int i = 0; i <num; i++){
      arr[i] = scanner.nextInt();
    }

    System.out.println();

    ComputeMax(arr);
  }

  public static void ComputeMax(int[] arr){
    ArrayList<ArrayList<Integer>> list = getAllArrs(arr);
    ArrayList<Integer> listSum = new ArrayList<Integer>();
    for (ArrayList l :list){
      Integer[] a = (Integer[])l.toArray();
      Arrays.sort(a);
      int min = a[0];
      int sum = 0;
      for (int i = 0; i < a.length; i++) {
        sum = sum + a[i];
      }
      listSum.add(sum*min);
    }

    Integer[] sumArr = (Integer[])listSum.toArray();
    Arrays.sort(sumArr);
    System.out.println("最大值为：" + sumArr[sumArr.length-1]);
  }

  private static ArrayList<ArrayList<Integer>> getAllArrs(int[] arr) {
    ArrayList<ArrayList<Integer>> list =  new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++){
        ArrayList list1 = new ArrayList<Integer>();
        for (int k = arr.length -1 - j; k >= j; k--) {
          list1.add(arr[k]);
        }
        list.add(list1);
      }
    }

    return list;
  }
}
