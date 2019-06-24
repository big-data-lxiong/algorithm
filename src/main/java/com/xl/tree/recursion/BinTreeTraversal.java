package com.xl.tree.recursion;

import com.xl.tree.BinTreeNode;

public class BinTreeTraversal {

  public void preTraversal(BinTreeNode node){
    if(node == null) return;

    print(node);
    preTraversal(node.left);
    preTraversal(node.right);
  }

  public void midTraversal(BinTreeNode node){
    if(node == null) return;

    midTraversal(node.left);
    print(node);
    midTraversal(node.right);
  }

  public void postTraversal(BinTreeNode node){
    if(node == null) return;

    postTraversal(node.left);
    postTraversal(node.right);
    print(node);
  }

  public void print(BinTreeNode node){
    System.out.print(node.getElement().getValue() + "     ");
  }

}
