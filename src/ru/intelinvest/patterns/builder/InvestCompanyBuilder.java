/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns.builder;

import ru.intelinvest.patterns.factory.Director;
import ru.intelinvest.patterns.factory.Factory;

/**
 *
 * @author Stanislav
 */
public class InvestCompanyBuilder extends Builder{
    
    public InvestCompanyBuilder(){
        company = new Company();
    }

    @Override
    public Company buildCompany(int countPeoples) {
        Factory factory = new Factory();
        Director director = (Director) factory.getWorker("director");
        director.setName("Jhon Pana");
        director.setAge(45);
        company.register();
        company.employ(countPeoples);
        company.setManager(director);
        company.manage();
        return company;
    }
    
}
