package binaryTree;

import utils.BinaryTreeUtils;
import utils.LinkedListUtils;
import utils.ListNode;
import utils.TreeNode;

public class ConvertFromListToBinaryTree {

	public static void main(String[] args) {
		ListNode head = buildList();
		LinkedListUtils.print(head);
		TreeNode root = sortedListToBST(head);
		BinaryTreeUtils.inorder(root);
	}
	
	public static TreeNode sortedListToBST(ListNode head) {
		ListNode mid = halfList(head, null);
		TreeNode root = new TreeNode(mid.data());
		
		if (head == null) {
			return null;
		}
		
		if (mid.next() == null) {
			return root;
		}

		ListNode leftList = copyLinkedList(head, mid);
		ListNode rightList = copyLinkedList(mid.next(), null);
		
		if (leftList != null) {
			root.left = sortedListToBST(leftList);	
		}
		
		if (rightList != null) {
			root.right = sortedListToBST(rightList);	
		}
				
		return root;
	}
	
	public static ListNode copyLinkedList(ListNode from, ListNode to) {
		ListNode p = from;
		ListNode n = null;
		ListNode q = null;
		ListNode head = null;
		
		while(p != null && p != to) {
			q = n;
			n = new ListNode(p.data());
			if (q != null) {
				q.next(n);	
			} else {
				head = n;
			}
			p = p.next();
		}
		
		return head;
	}
	
	public static ListNode halfList(ListNode head, ListNode tail) {
		ListNode p = head;
		ListNode q = head;
		int counter = 0;
		
		if (head == null) {
			return null;
		}
		
		if (head.next() == null) {
			return head;
		}
		
		while(p != null && p != tail) {
			p = p.next();
			counter++;
			if (counter % 2 == 0 && p != null) {
				q = q.next();
			}
		}
		
		return q;
	}
	
	public static ListNode buildList() {
		ListNode head = new ListNode(1);
		
		ListNode n1 = new ListNode(3);
//		head.next(n1);
		ListNode n2 = new ListNode(4);
//		n1.next(n2);
		ListNode n3 = new ListNode(7);
//		n2.next(n3);
		ListNode n4 = new ListNode(8);
//		n3.next(n4);
		ListNode n5 = new ListNode(9);
//		n4.next(n5);
		ListNode n6 = new ListNode(11);
//		n5.next(n6);
		ListNode n7 = new ListNode(13);
//		n6.next(n7);
		
		return head;
	}
}
