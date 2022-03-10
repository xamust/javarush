package com.javarush.test.level14.lesson06.home01;

/**
 * Created by xamust on 16.10.14.
 */
class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 60;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - "+Country.BELARUS+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
