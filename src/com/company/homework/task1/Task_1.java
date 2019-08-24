package com.company.homework.task1;

import java.util.HashMap;
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
    }

    public void union(Set set1, Set set2) {

    }

    public void intersect(Set set1, Set set2) {

    }
}
