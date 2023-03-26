package com.softserve.hw8;

import java.util.ArrayList;

/*1) Задати два списки (ArrayList), які містять цілі значення.
   Кількість елементів у списках може бути різною, а самі елементи можуть дублюватися.
   Вияснити, чи контент елементів у списках співпадає.
   Наприклад, вміст наступних списків є однаковий [1, 2, 1, 2, 3] та [3, 3, 2, 2, 1, 1]
   Для коду використати пакет com.softserve.edu.hw08
   Запушати код на github у свою вітку.*/
public class Arrays {
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(0);
        list1.add(7);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(0);
        list2.add(9);
        list2.add(7);

       list2.retainAll(list1);
       System.out.println("Same elements in list 1 and list 2 = " + list2);
    }
}
