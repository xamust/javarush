package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String xr = bf.readLine();
        int x = Integer.parseInt(xr);
        String s = bf.readLine();
        System.out.println(s + " захватит мир через " + x + " лет. Му-ха-ха!");

    }
}