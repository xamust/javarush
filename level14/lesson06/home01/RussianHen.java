package com.javarush.test.level14.lesson06.home01;

/**
 * Created by xamust on 16.10.14.
 */
class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 100;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - "+Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
