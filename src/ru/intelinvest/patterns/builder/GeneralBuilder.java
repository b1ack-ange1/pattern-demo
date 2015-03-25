/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns.builder;

/**
 *
 * @author Stanislav
 */
public class GeneralBuilder {
    private int countPeoples;
    private Builder builder;

    public GeneralBuilder(int countPeoples) {
        this.countPeoples = countPeoples;
        if (countPeoples < 100) {
            builder = new InvestCompanyBuilder();
        } else {
            builder = new BankCompanyBuilder();
        }
    }

    public Company buildCompany() {
        return builder.buildCompany(countPeoples);
    }
}
