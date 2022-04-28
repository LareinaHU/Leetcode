package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GreeyA {
    //166 尚硅谷 老韩图解Java数据结构和算法 贪心算法解决集合覆盖代码实现
    public static void main(String[] args) {

        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashSet<String> SS1 = new HashSet<>();
        SS1.add("BeiJing");
        SS1.add("ShangHai");
        SS1.add("TianJin");

        HashSet<String> SS2 = new HashSet<>();
        SS2.add("GuangZhou");
        SS2.add("BeiJing");
        SS2.add("ShenZhen");

        HashSet<String> SS3 = new HashSet<>();
        SS3.add("ChengDu");
        SS3.add("ShangHai");
        SS3.add("HangZhou");

        HashSet<String> SS4 = new HashSet<>();
        SS4.add("ShangHai");
        SS4.add("TianJin");

        HashSet<String> SS5 = new HashSet<>();
        SS5.add("HangZhou");
        SS5.add("DaLian");

        map.put("K1", SS1);
        map.put("K2", SS2);
        map.put("K3", SS3);
        map.put("K4", SS4);
        map.put("K5", SS5);

        HashSet<String> allareas = new HashSet<>();
        allareas.addAll(SS1);
        allareas.addAll(SS2);
        allareas.addAll(SS3);
        allareas.addAll(SS4);
        allareas.addAll(SS5);
        System.out.println(allareas);

        //创建ArrayList，存放选择的电台集合
        ArrayList<String> selects = new ArrayList<>();

        //define a temp set,在遍历过程中，存放遍历过程中的电台覆盖的地区和当前还没有覆盖的地区的交集
        HashSet<String> tempSet = new HashSet<>();

        //define maxKey:保存在一次遍历过程中，能够覆盖最大未覆盖地区对应的电台key
        String maxKey = null;
        //如果maxkey不为null.则会加入到selectes
        while (allareas.size() != 0) {
            //每进行一次while，需要对maxKey置空
            maxKey = null;
            //遍历map，取出对应key
            for (String key : map.keySet()) {
                //每进行一次for
                tempSet.clear();
                HashSet<String> areas = map.get(key);
                tempSet.addAll(areas);
                //求交集
                tempSet.retainAll(allareas);
                //如果当前这个集合包含的未覆盖地区的数量，比maxKey指向的集合地区还多
                //就需要重置maxkey
                //贪婪，每次选择最优
                if (tempSet.size() > 0 && (maxKey == null || tempSet.size() > map.get(maxKey).size())) {
                    maxKey = key;
                }

            }
            //maxKey != null, 就应该将其加入selectes
            if (maxKey != null) {
                selects.add(maxKey);
                // 将maxkey指向的广播电台覆盖的地区，从allaareas里面去掉
                allareas.removeAll(map.get(maxKey));
            }
        }
        System.out.println(selects);
    }
}