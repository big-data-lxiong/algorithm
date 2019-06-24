package com.xl.concurrent.atomic;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCylicBarirer {

  public static void main(String[] args) {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("t1 prepare");
        try {
          cyclicBarrier.await();
          System.out.println("t1 end");
        } catch (InterruptedException e) {
          e.printStackTrace();
        } catch (BrokenBarrierException e) {
          e.printStackTrace();
        }
      }
    }).start();


    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("t2 prepare");
        try {
          cyclicBarrier.await();
          System.out.println("t2 end");
        } catch (InterruptedException e) {
          e.printStackTrace();
        } catch (BrokenBarrierException e) {
          e.printStackTrace();
        }
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("t3 prepare");
        try {
          cyclicBarrier.await();
          System.out.println("t3 end");
        } catch (InterruptedException e) {
          e.printStackTrace();
        } catch (BrokenBarrierException e) {
          e.printStackTrace();
        }
      }
    }).start();


  }


}

