package LinkedList;

public class reverse206 {
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

    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode res = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return res;
//    }
        ListNode res = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextT = curr.next;

            curr.next.next = curr;
            curr.next = null;
            head = head.next;
        }
        return head;

    }

}