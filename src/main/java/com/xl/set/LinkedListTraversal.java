package com.xl.set;

import java.util.*;

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

    System.out.println();
    testLinkedList();
    testQueue();
    testStack();
  }

  public static void testArrayList(){
    ArrayList<Integer> arrayList = new ArrayList<>();

    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);

    System.out.println("------------linkedList start---------------");
    System.out.println("------------linkedList end---------------");
  }

  public static void testLinkedList(){
    LinkedList<Integer> list = new LinkedList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println("------------linkedList start---------------");
    System.out.println(list.peek());
    System.out.println(list.poll());
    System.out.println("------------linkedList end---------------");
  }

  public static void testQueue(){
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);

    System.out.println("------------queue start---------------");
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println("------------queue end---------------");

  }

  public static void testStack(){
    Stack<Integer> stack = new Stack<>();

    stack.add(1);
    stack.add(2);
    stack.add(3);
    stack.add(4);

    System.out.println("------------stack start---------------");
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println("------------stack end---------------");
  }

  public static void testVector(){
    Vector<Integer> vector = new Vector<>();

    vector.add(1);
    vector.add(2);
    vector.add(3);
    vector.add(4);

    System.out.println("------------vector start---------------");
    System.out.println("------------vector end---------------");
  }



}
