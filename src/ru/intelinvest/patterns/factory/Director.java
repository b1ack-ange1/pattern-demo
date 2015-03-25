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
public class Director extends Human implements Employee{
    
    public void doCommand(){
        Logger.getInstance().log(this.getClass().getSimpleName()+" command");
    }
}
