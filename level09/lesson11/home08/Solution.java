package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] mass5 = new int[5];
        int[] mass2 = new int[2];
        int[] mass4 = new int[4];
        int[] mass7 = new int[7];
        int[] mass0 = new int[0];
        for(int i = 0; i < 5; i++) mass5[i] = i;
        for(int i = 0; i < 2; i++) mass2[i] = i;
        for(int i = 0; i < 4; i++) mass4[i] = i;
        for(int i = 0; i < 7; i++) mass7[i] = i;
        list.add(mass5);
        list.add(mass2);
        list.add(mass4);
        list.add(mass7);
        list.add(mass0);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
