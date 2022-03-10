package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код

    private String Fullname;

    public void initialize(String name)
    {
        this.Fullname = name;
    }
    public void initialize(String name,int age)
    {
        this.Fullname = name + age;
    }
    public void initialize(String name, int age, String sex)
    {
        this.Fullname = name + age + sex;
    }

}
