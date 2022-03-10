package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 < number2 && number1 < number3)
        {
            if(number2 > number3)
            {
                System.out.println(number2);
                System.out.println(number3);
                System.out.println(number1);
            }
            else
            {
                System.out.println(number3);
                System.out.println(number2);
                System.out.println(number1);
            }
        }
        if(number2 < number1 && number2 < number3)
        {
            if(number1 > number3)
            {
                System.out.println(number1);
                System.out.println(number3);
                System.out.println(number2);
            }
            else
            {
                System.out.println(number3);
                System.out.println(number1);
                System.out.println(number2);
            }
        }
        if(number3 < number2 && number3 < number1)
        {
            if(number2 > number1)
            {
                System.out.println(number2);
                System.out.println(number1);
                System.out.println(number3);
            }
            else
            {
                System.out.println(number1);
                System.out.println(number2);
                System.out.println(number3);
            }
        }

    }
}
