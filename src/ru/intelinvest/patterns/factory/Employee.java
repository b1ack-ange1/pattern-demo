/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns.factory;

/**
 *
 * @author Stanislav
 */
public interface Employee {
    public void doWork();
    public void doBreak();
    public void goHome();
    public String getPosition();
    public void run();
}
