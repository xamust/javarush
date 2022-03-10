package com.javarush.test.level08.lesson11.home04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        //find minimum here - найти минимум тут
        for (int i = 0; i < array.size(); i++)
        {
            for (int j = 0; j < array.size() - 1; j++)
            {
                int temp = array.get(j);
                if(array.get(j) > array.get(j+1))
                {
                    array.set(j,array.get(j+1));
                    array.set(j+1,temp);
                }
            }
        }

        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number = Integer.parseInt(reader.readLine());
        boolean isTenNumbers = false;
        int count = 0;
        while (!isTenNumbers)
        {
            int number_N = Integer.parseInt(reader.readLine());
            if(number_N%1==0)
            {
                list.add(number_N);
                count++;
                if(count == number) isTenNumbers = true;
            }
        }
        return list;
    }
}
