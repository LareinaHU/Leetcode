package Heap;

import java.util.PriorityQueue;

public class Merge23Heap {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> (a.val - b.val));
        for (ListNode List : lists) {
            if (List != null) {
                heap.offer(List);
            }
        }
        ListNode res = new ListNode(0), cur = res;
        while (!heap.isEmpty()) {
            ListNode top = heap.poll();
            cur.next = top;
            cur = cur.next;
            if (top.next != null) {
                heap.offer(top.next);

            }
        }
        return res.next;
    }
}
