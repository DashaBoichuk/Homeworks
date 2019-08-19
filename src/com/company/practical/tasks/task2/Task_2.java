package com.company.practical.tasks.task2;

public class Task_2 {
    public static void main(String[] args) {
        Plants plant = null;
        try {
            plant = new Plants(7, Color.BLUE, Type.TYPE_1);
        } catch (ColorException e) {
            e.printStackTrace();
        }
        System.out.println(plant);

    }
}
