package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    public static int centerX;
    public static int centerY;
    public static int radius;
    public static int width;
    public static String color;

    public void initialize(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerX;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerX;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color)
    {
        this.centerX = centerX;
        this.centerY = centerX;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
