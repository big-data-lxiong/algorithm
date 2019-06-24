package com.xl.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraversal {

  public static void main(String[] args){

    HashSet<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < 10; i++) {
      set.add(i);
    }

    traversal(set);

    set.stream().forEach(x -> {
      System.out.print(x + " ");
    });

    System.out.println();

    set.forEach(x -> {
      System.out.print(x + " ");
    });
  }

  public static void traversal(HashSet<Integer> set){
    //the first method
    for (Integer a :set) {
      System.out.print(a + " ");
    }
    System.out.println();

    //the second method
    Iterator iterator = set.iterator();
    while ( iterator.hasNext()){
      System.out.print(iterator.next() + " ");
    }
    System.out.println();

    //the third method
  }

}
