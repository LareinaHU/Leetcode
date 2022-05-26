package ninechapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(0, 0);
        List<List<Integer>> b = new ArrayList<>();
        b.add(a);
        b.add(a);
        b.add(new ArrayList<Integer>(a));

        a.set(0, 1);
        System.out.println(b);
    }
}
