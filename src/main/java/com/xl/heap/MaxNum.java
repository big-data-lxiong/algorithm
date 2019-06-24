package com.xl.heap;

public class MaxNum {

  public static void main(String[] args){

    int[] as = {1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15,-12};

    int[] max = new int[3];

    for(int i = 0; i < max.length; i++){
      max[i] = as[i];
    }

    buildMinHeap(max);

    getMinNum(max, as);

    printf(max);
  }

  private static void printf(int[] max) {
    for (int i = 0; i < max.length; i++) {
      System.out.println(max[i]);
    }

  }

  private static void getMaxNum(int[] max, int[] as) {
    for(int i = 10; i < as.length; i++){
      if(max[0] > as[i]){
        max[0] = as[i];
        maxHeap(0, max);
      }
    }

  }

  private static void getMinNum(int[] min, int[] as) {
    for(int i = 10; i < as.length; i++){
      if(min[0] < as[i]){
        min[0] = as[i];
        minHeap(0, min);
      }
    }

  }

  public static void buildMaxHeap(int[] arr){
    int len = arr.length;
    for (int i = len/2; i >=0 ; i--){
      maxHeap(i, arr);
    }
  }

  public static void buildMinHeap(int[] arr){
    int len = arr.length;
    for (int i = len/2; i >=0 ; i--){
      minHeap(i, arr);
    }
  }

  public static void maxHeap(int index, int[] arr){
    int len = arr.length;
    int l = 2 * index + 1;
    int r = 2 * index + 2;
    int largestIndex = index;

    if(l < len && arr[largestIndex] < arr[l]){
      largestIndex = l;
    }
    if(r < len && arr[largestIndex] <arr[r]){
      largestIndex = r;
    }

    if(largestIndex != index){
      swap(arr, largestIndex, index);
      maxHeap(largestIndex, arr);
    }

  }

  public static void minHeap(int index, int[] arr){
    int len = arr.length;
    int l = 2 * index + 1;
    int r = 2 * index + 2;
    int minIndex = index;

    if(l < len && arr[minIndex] > arr[l]){
      minIndex = l;
    }
    if(r < len && arr[minIndex] > arr[r]){
      minIndex = r;
    }

    if(minIndex != index){
      swap(arr, minIndex, index);
      minHeap(minIndex, arr);
    }

  }

  private static void swap(int[] arr, int largestIndex, int index) {
    int temp = arr[largestIndex];
    arr[largestIndex] = arr[index];
    arr[index] = temp;
  }



}
