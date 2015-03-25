/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns.builder;

import ru.intelinvest.patterns.factory.Human;
import ru.intelinvest.patterns.singleton.Logger;

/**
 *
 * @author Stanislav
 */
public class Company {
    private int countPeoples;

    public int getCountPeoples() {
        return countPeoples;
    }

    public void setCountPeoples(int countPeoples) {
        this.countPeoples = countPeoples;
    }
    
    public void setManager(Human human){
        Logger.getInstance().log("Set manager: "+human.getClass().getSimpleName()+" "+human.getName());
    }
    
    public void register(){
        Logger.getInstance().log("Register the company");
    }
    
    public void employ(int peoples){
        Logger.getInstance().log("Employ peoples "+peoples);
    }
    
    public void manage(){
        Logger.getInstance().log("Manage the company");
    }
}
