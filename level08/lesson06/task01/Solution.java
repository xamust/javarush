package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
    public static Object createArrayList()
    {
        //Напишите тут ваш код
        List<String> list = new ArrayList<String>();

        return (ArrayList<String>) list;

    }

    public static Object createLinkedList()
    {
        //Напишите тут ваш код
        List<String> list = new LinkedList<String>();

        return (LinkedList<String>) list;
    }
}
