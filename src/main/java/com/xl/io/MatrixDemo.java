package com.xl.io;

import java.util.Scanner;

public class MatrixDemo {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入坐标个数：");
    int num = scanner.nextInt();

    XY[] xy = new XY[num];
    for(int i = 0; i < num; i++){
      xy[i] = new XY();
      xy[i].setX(scanner.nextInt());
      xy[i].setY(scanner.nextInt());
    }

    for(int i = 0; i < num; i++){
      boolean isNN = true;
      for(int j = 0; j < num; j++){
        if(xy[i].getX() < xy[j].getX() && xy[i].getY() < xy[j].getY()){
          isNN = false;
        }
      }
      if(isNN == true) {
        System.out.println("坐标为：" + xy[i].getX() + " -- " + xy[i].getY());
      }
    }
  }

}
