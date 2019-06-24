package com.xl.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class DemoReentrantLock {

  private static ReentrantLock reentrantLock = new ReentrantLock(true);

  public static void main(String[] args){

    Condition condition = reentrantLock.newCondition();
    reentrantLock.lock();

    try {
      try {
        condition.await();
        condition.signal();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }finally {
      reentrantLock.unlock();
    }

  }

}
