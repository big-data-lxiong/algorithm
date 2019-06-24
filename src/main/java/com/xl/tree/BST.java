package com.xl.tree;

public class BST extends BinTreeNode {

  public BinTreeNode root;
  public int size;

  public void insert(Element element) {
    if(root == null){
      root = new BST();
      root.setElement(element);
      size++;
    }else {
      BinTreeNode node = new BinTreeNode(element);
      if (root.element.getValue() > element.getValue()){
        root.setRight(node);
        size++;
      }else{
        root.setLeft(node);
        size++;
      }
    }

  }

  public void search(Element element) {

  }

  public int getSize(){
    return size;
  }


}
