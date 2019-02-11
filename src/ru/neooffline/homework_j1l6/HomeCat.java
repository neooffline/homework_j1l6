package ru.neooffline.homework_j1l6;

public class HomeCat extends Cat implements FindFood {

    protected double minSearchArea =0.1;
    protected double maxSearchArea = 0.5;
    protected double currentSearchArea = mathRand(minSearchArea,maxSearchArea);
    HomeCat(String name, int runD, int jumpH, int swimD) {
        super(name, runD, jumpH, swimD);
    }

    HomeCat(String name) {
        super(name);
        this.type = "кот";
    }

    @Override
    public void findFood(double searchArea) {
        System.out.println("У домашнего кота по кличке \""+name+"\" область поиска ограничена квартирой (" +currentSearchArea+"км)");
        System.out.println(name + (currentSearchArea >= searchArea?" найдет":" не найдет") +
                " еду в области "+ searchArea+"км.");
        if (currentSearchArea<searchArea)
        System.out.println(name + " орет и просит покормить его.");
    }
}
