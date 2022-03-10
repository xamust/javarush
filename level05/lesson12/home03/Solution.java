package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12/*высота, см*/ /*5 /* длина хвоста, см */


public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //Напишите тут ваш код

        Cat tomCat = new Cat("Tom",25,323);
        Dog dogDog = new Dog("Dog",33,32);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //Напишите тут ваши классы

    public static class Dog
    {
        String name;
        int height;
        int tooth;

        public Dog(String name, int height, int tooth)
        {
            this.name = name;
            this.height = height;
            this.tooth = tooth;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int mustache;

        public Cat(String name, int height, int mustache)
        {
            this.name = name;
            this.height = height;
            this.mustache = mustache;
        }
    }

}
