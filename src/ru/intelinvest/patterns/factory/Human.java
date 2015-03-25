/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns.factory;

import ru.intelinvest.patterns.singleton.Logger;

/**
 *
 * @author Stanislav
 */
public class Human implements Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void doWork() {
        Logger.getInstance().log(this.getClass().getSimpleName()+" do work");
    }

    @Override
    public void doBreak() {
        Logger.getInstance().log(this.getClass().getSimpleName()+" do break");
    }

    @Override
    public void goHome() {
        Logger.getInstance().log(this.getClass().getSimpleName()+" go home");
    }

    @Override
    public String getPosition() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void run() {
        doWork();
        doBreak();
        goHome();
    }
    
}
