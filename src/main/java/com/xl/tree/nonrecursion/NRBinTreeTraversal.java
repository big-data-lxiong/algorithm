package com.xl.tree.nonrecursion;

import com.xl.tree.BinTreeNode;
import com.xl.tree.Element;
import java.util.Stack;

public class NRBinTreeTraversal {

	public static void main(String[] args) {
		preTraversal(getTree());
	}

	public static void preTraversal(BinTreeNode root) {

		Stack<BinTreeNode> queue = new Stack<>();
		if(root != null){
			queue.add(root);
		}
		while(!queue.isEmpty()){
			BinTreeNode node = queue.pop();
			System.out.println(node.element.getValue());
			BinTreeNode left =	node.left;
			BinTreeNode  right = node.right;
			if(right != null){
				queue.add(right);
			}
			if(left != null){
				queue.add(left);
			}
		}
	}

	public static BinTreeNode getTree(){
		BinTreeNode root = new BinTreeNode();
		root.setElement(new Element(1));

		BinTreeNode l1 = new BinTreeNode();
		l1.setElement(new Element(2));
		BinTreeNode r1 = new BinTreeNode();
		r1.setElement(new Element(3));

		root.setLeft(l1);
		root.setRight(r1);

		return root;
	}

}
