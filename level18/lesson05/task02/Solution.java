package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки ввода-вывода

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/
// /home/xamust/Документы/123
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        if (fileInputStream.available() > 0) {
            //читаем весь файл одним куском
            int counter = 0;
            byte[] buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            for (byte bt : buffer)
            {
                if(bt==44) counter ++;
            }
            System.out.print(counter);
        }
        bufferedReader.close();
        fileInputStream.close();
    }
}
