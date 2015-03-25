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
public abstract class Builder {
    protected Company company;
    
    public abstract Company buildCompany(int countPeoples);
}
