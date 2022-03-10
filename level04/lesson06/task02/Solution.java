package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int number4 = scanner.nextInt();

        if(number1 > number2 && number1 > number3 && number1 > number4)
        {
            System.out.println(number1);
        }
        if(number2 > number1 && number2 > number3 && number2 > number4)
        {
            System.out.println(number2);
        }
        if(number3 > number2 && number3 > number1 && number3 > number4)
        {
            System.out.println(number3);
        }
        if(number4 > number1 && number4 > number3 && number4 > number1)
        {
            System.out.println(number4);
        }

    }
}
