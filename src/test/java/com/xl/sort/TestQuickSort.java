package com.xl.sort;

public class TestQuickSort {

  public static void main(String[] args){

    int[] arr = {21,3,9,4,1,7,0,99,45,32,11};
    QuickSort quickSort = new QuickSort(arr);

    quickSort.sort();
    quickSort.print();
  }

}
