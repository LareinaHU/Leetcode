package LinkedList;

public class ReverseRecursion {
    static class Node{
        int val;
        Node next;
       public Node(int val, Node next){
           this.val = val;
           this.next = next;
       }
    }
    public static Node Reverse(Node first){
        if(first == null || first.next == null){
            return first;
        }
        Node RR = Reverse(first.next);
        System.out.println(RR.val);
        System.out.println("--------");
        first.next.next = first;
        first.next = null;
        return RR;
    }

    public static void main(String[] args) {
        Node L4 = new Node(44, null);
        Node L3 = new Node(33, L4);
        Node L2 = new Node(22, L3);
        Node L1 = new Node(11, L2);
        Node head = L1;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        Reverse(L1);
        while (L4 != null) {
            System.out.println(L4.val);
            L4 = L4.next;
        }
    
    }
}
