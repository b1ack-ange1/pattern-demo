/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.intelinvest.patterns;

import java.util.ArrayList;
import ru.intelinvest.patterns.builder.Company;
import ru.intelinvest.patterns.builder.GeneralBuilder;
import ru.intelinvest.patterns.factory.Director;
import ru.intelinvest.patterns.factory.Factory;
import ru.intelinvest.patterns.factory.Human;

/**
 *
 * @author Stanislav
 */
public class Test {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Human human = factory.getWorker("director");
        human.run();
        Director director = (Director) human;
        director.doCommand();
        human = factory.getWorker("accountant");
        human.run();
        human = factory.getWorker("secretary");
        human.run();
        System.out.println("------------------------------------");
        GeneralBuilder builder = new GeneralBuilder(310);
        Company myCompany = builder.buildCompany();

    }

    public static void showInfo() {
        System.out.println("------------------------------------");
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Byte(Byte.MAX_VALUE));
        list.add(new Short(Short.MAX_VALUE));
        list.add(new Integer(Integer.MAX_VALUE));
        list.add(new Long(Long.MAX_VALUE));
        list.add(new Float(Float.MAX_VALUE));
        list.add(new Double(Double.MAX_VALUE));
        list.add(new Boolean(true));
        list.add(new Character(Character.MAX_VALUE));
        for (Object o : list) {
            if (o instanceof Byte) {
                System.out.println(Byte.class.getSimpleName());
                System.out.println("MAX VALUE: " + Byte.MAX_VALUE);
                System.out.println("MIN VALUE: " + Byte.MIN_VALUE);
                System.out.println("SIZE: " + Byte.SIZE);
                System.out.println("BYTES: " + Byte.BYTES);
            } else if (o instanceof Short) {
                System.out.println(Short.class.getSimpleName());
                System.out.println("MAX VALUE: " + Short.MAX_VALUE);
                System.out.println("MIN VALUE: " + Short.MIN_VALUE);
                System.out.println("SIZE: " + Short.SIZE);
                System.out.println("BYTES: " + Short.BYTES);
            } else if (o instanceof Integer) {
                System.out.println(Integer.class.getSimpleName());
                System.out.println("MAX VALUE: " + Integer.MAX_VALUE);
                System.out.println("MIN VALUE: " + Integer.MIN_VALUE);
                System.out.println("SIZE: " + Integer.SIZE);
                System.out.println("BYTES: " + Integer.BYTES);
            } else if (o instanceof Long) {
                System.out.println(Long.class.getSimpleName());
                System.out.println("MAX VALUE: " + Long.MAX_VALUE);
                System.out.println("MIN VALUE: " + Long.MIN_VALUE);
                System.out.println("SIZE: " + Long.SIZE);
                System.out.println("BYTES: " + Long.BYTES);
            } else if (o instanceof Float) {
                System.out.println(Float.class.getSimpleName());
                System.out.println("MAX VALUE: " + Float.MAX_VALUE);
                System.out.println("MIN VALUE: " + Float.MIN_VALUE);
                System.out.println("SIZE: " + Float.SIZE);
                System.out.println("BYTES: " + Float.BYTES);
            } else if (o instanceof Double) {
                System.out.println(Double.class.getSimpleName());
                System.out.println("MAX VALUE: " + Double.MAX_VALUE);
                System.out.println("MIN VALUE: " + Double.MIN_VALUE);
                System.out.println("SIZE: " + Double.SIZE);
                System.out.println("BYTES: " + Double.BYTES);
            } else if (o instanceof Boolean) {
                System.out.println(Boolean.class.getSimpleName());
            } else if (o instanceof Character) {
                System.out.println(Character.class.getSimpleName());
                System.out.println("MAX VALUE: " + Character.MAX_VALUE);
                System.out.println("MIN VALUE: " + Character.MIN_VALUE);
                System.out.println("SIZE: " + Character.SIZE);
                System.out.println("BYTES: " + Character.BYTES);
            }
        }
    }

}
