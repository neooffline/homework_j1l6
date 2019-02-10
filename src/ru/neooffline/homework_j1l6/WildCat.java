package ru.neooffline.homework_j1l6;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.concurrent.ThreadLocalRandom;

public class WildCat extends Cat implements FindFood {
    protected int minSearchArea =1;
    protected int maxSearchArea = 5;
    protected double currentSearchArea = mathRand(minSearchArea,maxSearchArea);
    WildCat(String name, int runD, int jumpH, int swimD) {
        super(name, runD, jumpH, swimD);
    }

    WildCat(String name) {
        super(name);
    }

    @Override
    public void findFood(int searchArea) {
        System.out.println("У дикого кота по кличке \""+ name +"\" область поиска составляет " + currentSearchArea +"км.");
        System.out.println(name + (currentSearchArea>=searchArea?" найдет":" не найдет") +
                " еду в области "+ searchArea+"км.");
    }
}
