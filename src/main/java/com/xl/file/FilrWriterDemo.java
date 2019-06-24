package com.xl.file;

import java.io.FileWriter;
import java.io.IOException;

public class FilrWriterDemo {

  public static void main(String[] args) throws IOException
  {

    FileWriter fw = new FileWriter("/Users/lxiong1/Desktop/1.txt");
    fw.write("asd");
    fw.flush();
    fw.close();
  }


}
