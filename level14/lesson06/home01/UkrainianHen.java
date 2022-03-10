package com.javarush.test.level14.lesson06.home01;

/**
 * Created by xamust on 16.10.14.
 */
class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 80;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - "+Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}