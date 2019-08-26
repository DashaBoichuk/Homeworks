package com.company.homework.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Chorna", "Olya");
        personMap.put("Bila", "Viktoria");
        personMap.put("Blue", "Ivan");

        System.out.println(personMap);


        personMap.values().removeIf(value -> value.contains("Olya"));

        System.out.println(personMap);

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        Set unionSet = Task_1.union(set1, set2);
        System.out.println(unionSet);
        Set intersectedSet = Task_1.intersect(set1, set2);
        System.out.println(intersectedSet);

    }

    private static Set union(Set<Integer> set1, Set<Integer> set2) {
        Set set = new HashSet();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }


    public static Set intersect(Set<Integer> set1, Set<Integer> set2) {
        Set set = new HashSet();
        set.addAll(set1);
        set.retainAll(set2);
        return set;
    }
}
