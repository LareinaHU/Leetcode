package top100;

public class leetcode2 {

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

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyNode = new ListNode(-1);
            ListNode curr = dummyNode;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int x = (l1 == null) ? 0 : l1.val;
                int y = (l2 == null) ? 0 : l2.val;
                int sum = x + y + carry;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
            }
            while (l1 == null) {
                curr.next = l2.next;
            }
            while (l2 == null) {
                curr.next = l1.next;
            }
            return dummyNode.next;
        }
    }
}
