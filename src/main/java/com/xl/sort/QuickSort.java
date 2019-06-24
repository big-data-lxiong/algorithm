package com.xl.sort;

import java.util.Arrays;

public class QuickSort {

  public int[] arr;

  public QuickSort(int[] arr){
    this.arr = arr;
  }

  public void sort(){
    quickSort(0, arr.length-1);
  }

  public void quickSort(int start, int end){


    if(start >= end) return;
    int mid = findMidElement(start, end);
    quickSort(start, mid-1);
    quickSort(mid + 1, end);
  }

  private int findMidElement(int start, int end) {
    int left = start;
    int right = end;
    int temp = arr[left];

    while (left < right){
      while(left < right && arr[right] > temp){
        right --;
      }
      arr[left] = arr[right];

      while(left < right && arr[left] < temp){
        left ++;
      }
      arr[right] = arr[left];
    }

    arr[right] = temp;

    return right;
  }

  public void print(){
    Arrays.stream(arr).forEach(a -> System.out.print(a + "  "));
  }

}