package com.company.practical.task1;

import java.util.LinkedList;

public class Task_1_Linked {
    public static void main(String[] args) {
        LinkedList<Integer> myCollection = new LinkedList();
        myCollection.add(1);
        myCollection.add(6);
        myCollection.add(1);
        myCollection.add(7);
        myCollection.add(1);
        myCollection.add(30);
        myCollection.add(9);
        myCollection.add(30);
        myCollection.add(1);
        myCollection.add(2);

        int count = 10;

        LinkedList<Integer> newCollection = new LinkedList<>();
        for (int i = 0; i < count; i++){
            if (myCollection.get(i) > 5) newCollection.add(i);
        }
        System.out.println(newCollection);

        for (int i = 0; i < count; i++){
            if (myCollection.get(i) > 20){
                myCollection.remove(i);
                count --;
            }
        }
        System.out.println(myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        count += 3;

        for (int i = 0; i < count; i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }

    }
}
