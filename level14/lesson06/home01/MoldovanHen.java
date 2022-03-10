package com.javarush.test.level14.lesson06.home01;

/**
 * Created by xamust on 16.10.14.
 */
class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 50;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - "+Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
