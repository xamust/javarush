package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/
// /home/xamust/Документы/123
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);
        TreeSet<Symbol> treeSet = new TreeSet<Symbol>(new SymbolTree());
        while(fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            treeSet.add(new Symbol(data));
        }
        for(Symbol s : treeSet)
        {
            System.out.print(s.toInteger() + " ");
        }
    }
    public static class SymbolTree implements Comparator<Symbol>
    {

        @Override
        public int compare(Symbol symbol, Symbol symbol2)
        {
            if(symbol.getLine() == symbol2.getLine())
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }

    public static class Symbol
    {
        public int data;

        public Symbol(int data)
        {
            this.data = data;
        }

        public int getLine()
        {
            return data;
        }
        public int toInteger(){
            return data;
        }
    }
}
