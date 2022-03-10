package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inp = new FileInputStream(r.readLine());
        String res="";
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> reslist = new ArrayList<Integer>();

        while(inp.available()>0)
        {
            int data = inp.read();
            list.add(data);
        }

        int[] count = new int[list.size()];
        for (int i=0; i<list.size(); i++)
        {
            count[i] = 0;
            for (int j = 0; j < list.size();j++)
            {
                if (list.get(i)==list.get(j)) count[i]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int h: count)
        {
            if (h>max) max = h;
        }

        for (int i = 0; i<list.size(); i++)
        {
            if (!reslist.contains(list.get(i))&&count[i]==max) reslist.add(list.get(i));
        }
        for (int y: reslist)
        {
            res = y + " ";
        }
        System.out.println(res);
        r.close();
        inp.close();
    }
}
