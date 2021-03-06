package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists23 {
    public class ListNode {
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

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<Integer>();
        for(ListNode ln: lists){
            while(ln != null){
                l.add(ln.val);
                ln = ln.next;
            }
        }
//?????
        Collections.sort(l);
        ListNode head = new ListNode(0);
        ListNode h = head;
        for(int i : l){
            ListNode t = new ListNode(i);
            h.next = t;
            h = h.next;
        }
        h.next = null;
        return head.next;

    }

    public static void main(String[] args) {


        PriorityQueue<Integer> q = new PriorityQueue<>();
    }

}
