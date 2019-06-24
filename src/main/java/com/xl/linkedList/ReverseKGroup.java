package com.xl.linkedList;

import java.util.Stack;

public class ReverseKGroup {

  public static void main(String[] args){
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    prin(n1);
    ListNode nl = reverseKGroup(n1, 2);
    System.out.print("=======");
    prin(nl);
  }

  private static void prin(ListNode n1) {
    ListNode head = n1;
    while(head != null){
      System.out.print(head.val + "-");
      head = head.next;
    }
  }

  public static ListNode reverseKGroup(ListNode head, int k) {
    if(head == null || head.next == null){
      return head;
    }
    ListNode n = null;
    ListNode cur = null;
    ListNode first = head;
    Stack<ListNode> stack = new Stack<ListNode>();
    int count = 0;
    while(first != null){
      count++;
      stack.push(new ListNode(first.val));

      if(count == k){
        while(!stack.isEmpty()){
          ListNode element =  (ListNode)stack.pop();
          if(n == null){
            n = element;
            cur = element;
          }else{
            cur.next = element;
            cur = cur.next;
          }
        }

        stack = new Stack();
        count = 0;
      }

      first = first.next;
    }

    if(stack.size() > 0 && stack.size() < k){
      Stack<ListNode> stack1 = new Stack<ListNode>();
      while(!stack.isEmpty()){
        stack1.push((ListNode)stack.pop());
      }

      while(!stack1.isEmpty()){
        cur.next = (ListNode)stack1.pop();
        cur = cur.next;
      }

    }

    return n;
  }

}
