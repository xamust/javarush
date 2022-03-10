package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/
// /home/xamust/Документы/123
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        while(fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            treeSet.add(data);
        }
        bufferedReader.close();
        fileInputStream.close();
        for(Integer i : treeSet)
        {System.out.print(i + " ");}
    }

}
