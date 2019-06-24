package com.xl.thread;

import java.util.concurrent.*;

public class TestThread {

  public static void main(String[] args) throws ExecutionException, InterruptedException {


  }

  public static void testFixedThreadPool(){
    ExecutorService excutorService = Executors.newFixedThreadPool(1);
    Future futureTask = excutorService.submit(new RunnableDemo(), "success-testFixedThreadPool");

    System.out.println(futureTask.isDone());
  }

  public static void testCachedThreadPool(){
    ExecutorService excutorService = Executors.newCachedThreadPool();
    Future future = excutorService.submit(new RunnableDemo(), "success-testCachedThreadPool");
    try {
      System.out.println(future.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

  public static void testSingleThread(){

  }

  public static void testScheduleThreadPool(){

  }

}
