/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns.builder;

import ru.intelinvest.patterns.factory.Accountant;
import ru.intelinvest.patterns.factory.Director;
import ru.intelinvest.patterns.factory.Factory;

/**
 *
 * @author Stanislav
 */
public class BankCompanyBuilder extends Builder{
    public BankCompanyBuilder(){
        company = new Company();
    }
    
    @Override
    public Company buildCompany(int countPeoples) {
        Factory factory = new Factory();
        Accountant accountant = (Accountant) factory.getWorker("accountant");
        accountant.setName("Marry Swansen");
        accountant.setAge(37);
        company.register();
        company.employ(countPeoples);
        company.setManager(accountant);
        company.manage();
        return company;
    }
    
}
