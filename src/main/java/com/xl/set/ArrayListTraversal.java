package com.xl.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversal {

  public static void main(String[] args){



    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

//    traversal(list);

//    list.stream().forEach(x -> {System.out.print(x + " ");});
//    System.out.println();
//    list.forEach(x -> {System.out.print(x + " ");});

    Collections.sort(list);
    traversal(list);
  }

  public static void traversal(List<Integer> list){
    //first method
    for (int a:list) {
      System.out.print(a + " ");
    }
    System.out.println();


    //second method
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    //third method
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.print(iterator.next() + " ");
    }

  }

}
