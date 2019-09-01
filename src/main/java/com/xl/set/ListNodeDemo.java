package com.xl.set;

public class ListNodeDemo {

	public static void main(String[] args) {
		ListNode head = getListNode();
		tranversal(head);

		ListNode dummy = new ListNode(0);

		while(head != null){
			ListNode cur = head;
			head = head.next;
			cur.next = dummy.next;
			dummy.next = cur;
		}

		tranversal(dummy.next);
	}

	private static ListNode getListNode() {
		ListNode head = new ListNode(0);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);

		head.next = one;
		one.next =two;
		two.next = three;
		three.next = four;
		four.next = five;

		return head;
	}

	private static void tranversal(ListNode listNode){
		while(listNode != null){
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}

}
