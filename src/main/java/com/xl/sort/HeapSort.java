package com.xl.sort;

public class HeapSort {

  public int[] arr;

  public HeapSort(int[] arr) {
    this.arr = arr;
  }

  public void sort() {
    //build maxHeap;
    buildMaxHeap();
    //sort
    for (int i = arr.length - 1; i >= 0; i--) {
      maxHeapify(0, i);
      swap(0, i);
    }
  }

  public void buildMaxHeap() {
    for (int i = arr.length / 2; i >= 0; i--) {
      maxHeapify(i, arr.length - 1);
    }
  }

  public void maxHeapify(int index, int s) {
    int l = 2 * index + 1;
    int r = 2 * index + 2;
    int largestIndex = index;

    if (l <= s && arr[l] > arr[index])
      largestIndex = l;
    if (r <= s && arr[r] > arr[largestIndex])
      largestIndex = r;

    if (largestIndex != index) {
      swap(index, largestIndex);
      maxHeapify(largestIndex, s);
    }

  }

  private void swap(int index, int largestIndex) {
    int temp = arr[index];
    arr[index] = arr[largestIndex];
    arr[largestIndex] = temp;
  }

  public void print() {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "    ");
    }
  }

}
