package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        String s = "";
        BufferedReader b = new BufferedReader((new InputStreamReader(System.in)));
        FileReader inStream = new FileReader(b.readLine());
        BufferedReader br = new BufferedReader(inStream);
        while ((s=br.readLine())!= null)
        {
            System.out.println(s);
        }
        br.close();
    }
}
