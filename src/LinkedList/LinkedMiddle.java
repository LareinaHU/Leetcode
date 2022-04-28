package LinkedList;

import java.util.LinkedList;

public class LinkedMiddle {
    public class ListNode {
        int val;
        ListNode next;
    }

    public static ListNode LinkedMiddleNode(ListNode head) {
        ListNode i = head, j = head;
        while (j != null && i != null) {
            i = i.next;
            j = j.next.next;
        }
        return i;
    }

    public static void main(String[] args) {
        LinkedList<Integer> aa = new LinkedList<>();
        aa.add(11);
        aa.add(22);
        aa.add(33);
        aa.add(44);
        aa.add(55);
        aa.add(66);
        System.out.println(aa);


    }
}

