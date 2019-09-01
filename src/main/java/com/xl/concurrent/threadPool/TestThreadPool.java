package com.xl.concurrent.threadPool;

import java.util.concurrent.*;

public class TestThreadPool {

  public static void main(String[] args){

    int a = 0;

    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.submit(() -> {
      System.out.println(a);
    });


    ExecutorService threadPool = new ThreadPoolExecutor(1, 5, 30, TimeUnit.MILLISECONDS,
      new LinkedBlockingDeque<Runnable>(1024), Executors.defaultThreadFactory(),
      new ThreadPoolExecutor.AbortPolicy());
  }

}
