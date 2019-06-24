package com.xl.sort;

public class MergeSort {

  public int[] arr;

  public int[] temp;

  public MergeSort(int[] arr){
    this.arr = arr;
    temp = new int[arr.length];
  }

  public void sort(){
    mergeSort(0, arr.length-1);
  }

  public void mergeSort(int low, int high){
    if(low >= high) return;

    int mid = (low + high)/2;
    mergeSort(low, mid);
    mergeSort(mid + 1, high);

    merge(low, mid, high );
  }

  public void merge(int low, int mid, int high){
    int i = low;
    int j = mid + 1;
    int k = low;
    while(i <= mid && j <= high){
      if(arr[i] < arr[j]){
        temp[k++] = arr[i++];
      }else{
        temp[k++] = arr[j++];
      }
    }

    while(i <= mid) {
      temp[k++] = arr[i++];
    }

    while (j <= high){
      temp[k++] = arr[j++];
    }

    k = low;
    j = low;
    //将temp中的元素全部拷贝到原数组中
    while(j <= high){
      arr[j++] = temp[k++];
    }

  }

  public void print() {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "    ");
    }
  }

}
