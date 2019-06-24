package com.xl.sort.util;

import com.xl.tree.BinTreeNode;
import com.xl.tree.Element;

public class BinTreeUtil {

  public static BinTreeNode create(){

    BinTreeNode left1 = new BinTreeNode(new Element(2));
    left1.setLeft(new BinTreeNode(new Element(4)));
    left1.setRight(new BinTreeNode(new Element(5)));

    BinTreeNode right1 = new BinTreeNode(new Element(3));
    right1.setLeft(new BinTreeNode(new Element(6)));
    right1.setRight(new BinTreeNode(new Element(7)));

    BinTreeNode root = new BinTreeNode(new Element(1));
    root.setLeft(left1);
    root.setRight(right1);

    return root;
  }

}
