package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/
// /home/xamust/Документы/123
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);
        int mem = fileInputStream.read();
        while(fileInputStream.available()>0)
        {

            int data = fileInputStream.read();
            if(data<mem) mem = data;
        }
        System.out.println(mem);
        bufferedReader.close();
        fileInputStream.close();
    }
}
