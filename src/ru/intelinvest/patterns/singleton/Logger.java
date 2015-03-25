/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns.singleton;

/**
 *
 * @author Stanislav
 */
public class Logger {

    private Logger() {
    }
    private static Logger logger = null;

    public static Logger getInstance() {
        if (logger == null) {
            return new Logger();
        } else {
            return logger;
        }
    }
    
    public void log(String args){
        System.out.println(args);
    }
}
