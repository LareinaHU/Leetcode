package ninechapter13;

import java.util.LinkedList;
import java.util.List;

public class MyQueue {
    public LinkedList<Integer> list = new LinkedList<>();
    public void enqueue(int item) {
        // write your code here
        list.add(item);
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        // write your code here
        return list.remove();
    }
}
