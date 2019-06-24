package com.xl.shell;

import java.io.IOException;

public class ShellDemo {

  public static void main(String[] args){

    String shell = "echo \"gggg\" >> /Users/lxiong1/Desktop/2.txt";
    String[] cmds = {"/bin/bash", "-c", shell};

    try {
      Process pro = Runtime.getRuntime().exec(cmds);
      pro.waitFor();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
