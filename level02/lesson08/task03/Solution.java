package com.javarush.test.level02.lesson08.task03;

/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
*/
public class Solution
{
    public static int min(int a, int b, int c)
    {
        int m2=0;
        //Напишите тут ваш код
        if (a <= b && a <= c)
        {m2 = a;}
        if (b <= a && b <= c)
        {m2 = b;}
        if (c <= a && c <= b)
        {m2 = c;}

        return m2;

    }

    public static void main(String[] args)
    {
        int m1 = min(1,2,3);



        System.out.println(m1);
    }
}