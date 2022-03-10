package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();

        String[] mass = {"арбуз","ягода", "банан","трава", "вишня","ягода", "груша", "фрукт", "дыня", "овощ", "ежевика" , "куст", "жень-шень","корень", "земляника", "ягода", "ирис" , "цветок", "картофель", "клубень"};

        for(int i = 0; i < 20;)
        {
            map.put(mass[i],mass[i+1]);
            i = i + 2;
        }

        for (Map.Entry<String,String> putt : map.entrySet())
        {
            String key = putt.getKey();
            String value = putt.getValue();
            System.out.println(key + " - "+ value);
        }
    }
}
