package top100;


import java.util.ArrayList;
import java.util.List;

public class dedupe {
    public static int dedu(List<Integer> list){
        int a = list.get(0);
        for(int i = 1; i < list.size(); i++){
            a ^= list.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(dedu(list));
    }
}
