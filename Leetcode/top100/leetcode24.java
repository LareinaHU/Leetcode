package top100;

public class leetcode24 {
    class ListNode {
        ListNode next;
        int val;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }
    }
//iterative method
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        dummy.next = head;
        //iterative
        while (curr.next != null || curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = curr.next.next;
        }
        return dummy.next;
    }
}
