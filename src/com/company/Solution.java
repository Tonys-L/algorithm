package com.company;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(8);

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode = new Solution().addTwoNumbers(listNode1, listNode4);
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        ListNode curL1 = l1;
        ListNode curL2 = l2;
        while (curL1 != null && curL2 != null) {
            int val = curL1.val + curL2.val;
            if (val >= 10) {
                if (curL1.next != null) {
                    curL1.next.val++;
                } else if (curL2.next != null) {
                    curL2.next.val++;
                }
                val = val % 10;
            }
            if (head == null) {
                head = new ListNode(val);
                tail = head;
            } else {
                tail.next = new ListNode(val);
                tail = tail.next;
            }
            curL1 = curL1.next;
            curL2 = curL2.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}