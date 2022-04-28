package LinkedList;

public class removeNth19 {
    class ListNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int L = 0;
        ListNode curr1 = dummy;
        while (curr1.next != null) {
            curr1 = curr1.next;
            L++;
        }
        ListNode curr2 = dummy;
        for (int i = 0; i < L - n; i++) {
            curr2 = curr2.next;
        }
        curr2.next = curr2.next.next;
        return dummy.next;
    }
}
