package top100;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode160 {
    class ListNode {
        ListNode next;
        int val;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode temp = headB;
            while (temp != null) {
                if (temp == headA) {
                    return headA;
                }
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }
}