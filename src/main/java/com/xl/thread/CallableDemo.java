package com.xl.thread;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {

  @Override
  public String call() throws Exception {
    System.out.println("CallableDemo");
    return "hello";
  }

}
