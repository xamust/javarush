package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> child0 = new ArrayList<Human>();
       Human children1 = new Human("Илья",true,3, child0);
       Human children2 = new Human("Маша",false,2,child0);
       Human children3 = new Human("Наташа",false,1,child0);
       ArrayList<Human> child1 = new ArrayList<Human>();
       child1.add(children1);
       child1.add(children2);
       child1.add(children3);
       Human father = new Human("Миша",true,45,child1);
       Human mother = new Human("Ирина",false,43,child1);
       ArrayList<Human> child2 = new ArrayList<Human>();
       child2.add(father);
       ArrayList<Human> child3 = new ArrayList<Human>();
       child3.add(mother);
       Human ded1 = new Human("Вася",true,75,child2);
       Human ded2 = new Human("Миша",true,86,child3);
       Human baba1 = new Human("Маня",false,75,child2);
       Human baba2 = new Human("Феня",false,75,child3);

       System.out.println(ded1.toString());
       System.out.println(ded2.toString());
       System.out.println(baba1.toString());
       System.out.println(baba2.toString());
       System.out.println(father.toString());
       System.out.println(mother.toString());
       System.out.println(children1.toString());
       System.out.println(children2.toString());
       System.out.println(children3.toString());

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
