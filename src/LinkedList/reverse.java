package LinkedList;

import java.util.LinkedList;

public class reverse {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {

        ListNode L4 = new ListNode(44, null);
        ListNode L3 = new ListNode(33, L4);
        ListNode L2 = new ListNode(22, L3);
        ListNode L1 = new ListNode(11, L2);
        ListNode head = L1;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        reverseList(L1);
        while (L4 != null) {
            System.out.println(L4.val);
            L4 = L4.next;
        }
    }

}
