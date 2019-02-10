package ru.neooffline.homework_j1l6;

public class Cat extends Animal {
    private double minJH = 2.5;
    private double mamJH = 4.2;
    private int minRD = 250;
    private int maxRD = 350;
    Cat(String name, int runD, int jumpH, int swimD) {
        super(name, runD, jumpH, swimD);
        this.type = "Кот";
    }
    Cat(String name){
        super(name);
        this.type = "Кот";
        this.minJumpHeight = minJH;
        this.maxJumpHeight = mamJH;
        this.minRunDistance = minRD;
        this.maxRunDistance = maxRD;
        this.permissibleJumpHeight = mathRand(minJumpHeight,maxJumpHeight);
        this.permissibleRunDistance = mathRand(minRunDistance,maxRunDistance);
    }
    @Override
    public void swim(int length){
            System.out.println(type+" "+name + " вообще не плавает");
        }
    }
