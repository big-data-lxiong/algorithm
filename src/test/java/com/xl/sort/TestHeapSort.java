package com.xl.sort;

public class TestHeapSort {

  public static void main(String[] args){

    int[] arr = {2,3,9,4,99,9090,1,7,0,45,32,11};
    HeapSort heapSort = new HeapSort(arr);

    heapSort.sort();
    heapSort.print();
  }


}
