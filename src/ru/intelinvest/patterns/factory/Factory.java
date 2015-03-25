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
public class Factory {
    /*
    * Set the value
    *@param to get instance of worker
    *@return new instance of worker
    */
    public Human getWorker(String value){
        Human human = null;
        switch(value.toLowerCase()){
            case "director":
                human = new Director();
                break;
            case "accountant":
                human = new Accountant();
                break;
            case "secretary":
                human = new Secretary();
                break;
            case "":
                human = new Human();
        }
        return human;
    }
}
