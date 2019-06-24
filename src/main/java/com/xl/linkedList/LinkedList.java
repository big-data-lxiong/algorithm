package com.xl.linkedList;

public class LinkedList {

  public Node first;

  public class Node {
    public int item;
    public Node next;

    public Node(int item, Node next){
      this.item = item;
      this.next = next;
    }
  }

}
