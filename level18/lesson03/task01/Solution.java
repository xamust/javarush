package com.javarush.test.level18.lesson03.task01;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);
        int mem = 0;
        while(fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            if(data>mem) mem = data;
        }
        System.out.println(mem);
        bufferedReader.close();
        fileInputStream.close();
    }
}
