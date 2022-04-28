package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class peeklast {
    public static void main(String[] args) {
        LinkedList<List<Integer>> hh = new LinkedList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(11);
        ll.add(22);
        hh.add(ll);
        LinkedList<Integer> lll = new LinkedList<>();
        lll.add(111);
        lll.add(222);
        hh.add(lll);
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(3333);
        aa.add(4444);
        hh.add(aa);
        System.out.println(hh);
        hh.peek();
        System.out.println(hh.peek());
        System.out.println(hh.peekLast());
        System.out.println(hh.peekFirst());
        System.out.println(hh);

    }
}
