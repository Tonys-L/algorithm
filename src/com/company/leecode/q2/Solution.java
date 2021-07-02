package com.company.leecode.q2;

class Solution {

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);
        listNode2.next.next.next.next = new ListNode(9);

        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(2);

        ListNode result = addTwoNumbers(listNode1, listNode2);
        System.out.println("111");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode cur = null;
        int i = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            if (l1 != null) {
                cur = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = l2;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            int sumVal = v1 + v2 + i;
            cur.val = sumVal % 10;
            i = sumVal / 10;

        }

        if (i > 0) {
            cur.next = new ListNode(i);
        }

        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}