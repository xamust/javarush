package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date) throws Exception
    {

        DateFormat nowcurrentDate = new SimpleDateFormat("MMM dd yyyy", Locale.US);
        Date curdate = nowcurrentDate.parse(date);

        Date dateYearStart = new Date();
        dateYearStart.setHours(0);
        dateYearStart.setMinutes(0);
        dateYearStart.setSeconds(0);
        dateYearStart.setMonth(0);
        dateYearStart.setDate(1);

        long msTime = curdate.getTime() - dateYearStart.getTime();


        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTime / msDay);

        if (dayCount % 2 == 0)
        {
            return false;
        }
        return true;


    }
}
