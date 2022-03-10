package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Использовать функцию из задачи 1.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        //Напишите тут ваш код
        int m3=0;
        //Напишите тут ваш код
        if (a <= b && a <= c && a <= d)
        {m3 = a;}
        if (b <= a && b <= c && b <= d)
        {m3 = b;}
        if (c <= a && c <= b && c <= d)
        {m3 = c;}
        if (d <= a && d <= b && d <= c)
        {m3 = d;}
        return m3;

    }

    public static int min(int a, int b)
    {
        //Напишите тут ваш код
        int m2=0;
        //Напишите тут ваш код
        if (a <= b)
        {m2 = a;}
       else
        {m2 = b;}

        return m2;

    }

    public static void main(String[] args) throws Exception
    {
        if (min(5, 8, 6, 6) != 5)
        {
            System.out.println("1) Неправильно для a"); //вывод=5
        }
        if (min(-1, -3, -2, -5) != -5)
        {
            System.out.println("2) Неправильно для отрицательных чисел"); //вывод=-5
        }
        if (min(10, 5, 20, 42) != 5)
        {
            System.out.println("3) Неправильно для b"); //вывод=5
        }
        if (min(5, 5, 5, 5) != 5)
        {
            System.out.println("4) Неправильно для всех равных чисел"); //вывод=5
        }
        if (min(8, 7, 5, 6) != 5)
        {
            System.out.println("5) Неправильно для c"); //вывод=5
        }
        if (min(8, 7, 5, 5) != 5)
        {
            System.out.println("6) Неправильно для равных c и d"); //вывод=5
        }
        if (min(5, 5, 6, 6) != 5)
        {
            System.out.println("7) Неправильно для равных двух пар"); //вывод=5
        }
    }
}