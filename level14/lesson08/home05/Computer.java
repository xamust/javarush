package com.javarush.test.level14.lesson08.home05;

/**
 * Created by xamust on 18.10.14.
 */
public class Computer
{
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;


    public Computer()
    {
        this.mouse = new Mouse();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
    }

    public Keyboard getKeyboard()
    {
        return new Keyboard();
    }

    public Monitor getMonitor()
    {
        return new Monitor();
    }

    public Mouse getMouse()
    {
        return new Mouse();
    }
}
