package com.xl.concurrent.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

  public static void main(String[] args){

    int a = 0;

    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.submit(() -> {
      System.out.println(a);
    });


  }

}
