package com.xl.sort.tree.nonrecursion;

import com.xl.sort.util.BinTreeUtil;
import com.xl.tree.BinTreeNode;
import com.xl.tree.recursion.BinTreeTraversal;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBinTreeTraversal {

  public static BinTreeNode node;

  @BeforeClass
  public static void init(){
    node = BinTreeUtil.create();
  }

  @Test
  public void testPreTraversal(){
    new BinTreeTraversal().preTraversal(node);
    System.out.println();
  }

  @Test
  public void testMidTraversal(){
    new BinTreeTraversal().midTraversal(node);
    System.out.println();

  }

  @Test
  public void testPostTraversal(){
    new BinTreeTraversal().postTraversal(node);
    System.out.println();
  }


}
