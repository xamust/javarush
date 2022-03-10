package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
//Напишите тут ваш код
    public static int top;
    public static int left;
    public static int width;
    public static int height;

    public int getTop()
    {return top;}

    public int getLeft()
    {return left;}

    public int getWidth()
    {return width;}

    public int getHeight()
    {return height;}

    public Rectangle(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;

    }

    public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;

    }

    public Rectangle(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = this.width;

    }

    public Rectangle(Rectangle rect)
    {
        this.top = rect.getTop();
        this.left = rect.getLeft();
        this.width = rect.getWidth();
        this.height = rect.getHeight();
    }
}
