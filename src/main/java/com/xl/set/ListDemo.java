package com.xl.set;

import java.util.LinkedList;

public class ListDemo {

  public static void main(String[] args){
    LinkedList<Integer>  list = new  LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);


    LinkedList<Integer> list2 = list;

    list2.remove();

    System.out.println(list.size());
    System.out.println(list2.size());

  }

}
