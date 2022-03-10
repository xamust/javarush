package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(b < a && a < c){
            System.out.println(a);
        }
        if(a < b && b < c){
            System.out.println(b);
        }
        if(a < c && c < b){
            System.out.println(c);
        }
        if(c < a && a < b){
            System.out.println(a);
        }
        if(c < b && b < a){
            System.out.println(b);
        }
        if(b < c && c < a){
            System.out.println(c);
        }
    }
}
