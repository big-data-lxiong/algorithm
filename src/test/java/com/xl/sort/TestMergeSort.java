package com.xl.sort;

public class TestMergeSort {

  public static void main(String[] args){

    int[] arr = {2,3,9,4,1,7,0,45,32,11};
    MergeSort mergeSort = new MergeSort(arr);

    mergeSort.sort();
    mergeSort.print();
  }


}
