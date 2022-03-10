package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        //напишите здесь ваш код
        int minimum = 0;
        int number_of_numbers = Integer.parseInt(reader.readLine());
        while (number_of_numbers <= 0)
        {
            number_of_numbers = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < number_of_numbers; i++)
        {
         minimum = Integer.parseInt(reader.readLine());
            if (minimum >= maximum)
            {maximum = minimum;}
        }

        System.out.println(maximum);
    }

}
