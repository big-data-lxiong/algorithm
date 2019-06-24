package com.xl.set;

import java.util.LinkedList;

public class LinkedListTraversal {

  public static void main(String[] args){
    LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    list.stream().forEach(x -> {
      System.out.print(x + " ");
    });

    System.out.println();

    list.forEach(x -> {
      System.out.print(x + " ");
    });
  }

}
