package com.javarush.test.level14.lesson08.home06;

/* MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Triller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
6. Добавить в MovieFactory.getMovie получение объекта Triller для ключа "triller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "triller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
        Movie movie = null;
        boolean isEmpty = false;
        //тут цикл по чтению ключей, пункт 1
        while (!isEmpty)
        {
            //создаем объект, пункт 2
            isEmpty = false;
            String str = reader.readLine();
            if(str.equals("soapOpera"))
            {
                movie = MovieFactory.getMovie(str);
                System.out.println(movie.getClass().getSimpleName());
            }
            else if (str.equals("triller"))
            {
                movie = MovieFactory.getMovie(str);
                System.out.println(movie.getClass().getSimpleName());
            }
            else if (str.equals("cartoon"))
            {
                movie = MovieFactory.getMovie(str);
                System.out.println(movie.getClass().getSimpleName());
            }
            else isEmpty = true;
        }
    }

    static class MovieFactory
    {

        static Movie getMovie(String key)
        {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
            }

            //Напишите тут ваш код, пункты 5,6
            else if("triller".equals(key))
            {
                movie = new Triller();
            }

            else if("cartoon".equals(key))
            {
                movie = new Cartoon();
            }

            return movie;
        }
    }

    static abstract class Movie
    {
    }

    static class SoapOpera extends Movie
    {
    }

    //Напишите тут ваши классы, пункт 3
    public static class Triller extends Movie
    {

    }
    public static class Cartoon extends Movie
    {

    }
}
