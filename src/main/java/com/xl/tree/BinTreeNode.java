package com.xl.tree;

public class BinTreeNode {

  public Element element;
  public BinTreeNode left;
  public BinTreeNode right;

  public BinTreeNode(){

  }

  public BinTreeNode(Element element){
    this.element = element;
  }

  public Element getElement() {
    return element;
  }

  public void setElement(Element element) {
    this.element = element;
  }

  public BinTreeNode getLeft() {
    return left;
  }

  public void setLeft(BinTreeNode left) {
    this.left = left;
  }

  public BinTreeNode getRight() {
    return right;
  }

  public void setRight(BinTreeNode right) {
    this.right = right;
  }

}
