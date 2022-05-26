package top100;

public class leetcode19 {
    class ListNode {
        int val;
        ListNode next;

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        if(head == null){
            return null;
        }
        ListNode dummyNode = new ListNode(-1);
        // dummyNode.next = head;
        ListNode curr1 = head;

        while (curr1!= null) {
            size++;
            curr1 = curr1.next;
        }

        ListNode curr = dummyNode;
        dummyNode.next = head;
        for(int i = 0; i < size - n; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummyNode.next;

    }
}
