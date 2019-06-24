package com.xl.concurrent.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class UsePriorityBlockingQueue {

  public static void main(String[] args) throws InterruptedException {
    PriorityBlockingQueue<Task> q = new PriorityBlockingQueue<>();
    Task t1 = new Task();
    t1.setId(3);
    t1.setName("id is 3");

    Task t2 = new Task();
    t2.setId(1);
    t2.setName("id is 1");

    Task t3 = new Task();
    t3.setId(4);
    t3.setName("id is 4");

    q.add(t1);
    q.add(t2);
    q.add(t3);

    System.out.println("the container is: " + q);
    System.out.println(q.poll().getId());
    System.out.println("the container is: " + q);
  }

}
