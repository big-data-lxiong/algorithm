package com.xl.concurrent.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomicInteger {

  public static void main(String[] args){
    AtomicInteger atomicInteger = new AtomicInteger();
    CountDownLatch countDownLatch = new CountDownLatch(6);

    Thread t1 = new Thread(){

      @Override
      public void run(){
        atomicInteger.addAndGet(1);
        countDownLatch.countDown();
      }

    };

    Thread t2 = new Thread(){

      @Override
      public void run(){
        atomicInteger.addAndGet(1);
        countDownLatch.countDown();
      }
    };

    Thread t3 = new Thread(){

      @Override
      public void run(){
        atomicInteger.addAndGet(1);
        countDownLatch.countDown();
      }
    };

    Thread t4 = new Thread(){

      @Override
      public void run(){
        atomicInteger.addAndGet(1);
        countDownLatch.countDown();
      }
    };

    Thread t5 = new Thread(){

      @Override
      public void run(){
        atomicInteger.addAndGet(1);
        countDownLatch.countDown();
      }
    };

    Thread t6 = new Thread(){

      @Override
      public void run(){
        atomicInteger.addAndGet(1);
        countDownLatch.countDown();
      }
    };

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();

    try {
      countDownLatch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(atomicInteger.get());

  }




}
