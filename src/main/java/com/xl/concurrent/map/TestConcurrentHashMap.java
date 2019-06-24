package com.xl.concurrent.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {

  public static void main(String[] args) throws InterruptedException {
    Map<Long, String> map = new ConcurrentHashMap<>();

    for (long i = 0; i < 5; i++) {
      map.put(i, i + "");
    }

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        map.put(1001l, "100");
        System.out.println("ADD: " + 100);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        Set<Map.Entry<Long, String>> set = map.entrySet();
        Iterator<Map.Entry<Long, String>> its =  set.iterator();
        while(its.hasNext()){
          Map.Entry<Long, String> entry = its.next();
          System.out.println(entry.getKey() + " --> " + entry.getValue());
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });


    thread1.start();
    thread2.start();

    Thread.sleep(3000);
    System.out.println("--------");

    for (Map.Entry<Long, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

}
