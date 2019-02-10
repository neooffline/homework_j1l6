package ru.neooffline.homework_j1l6;

public class Dog extends Animal{
    private double minJH = 0.4;
    private double mamJH = 1.2;
    private int minRD = 750;
    private int maxRD = 1350;
    private int minSD = 200;
    private int maxSD = 1000;
    Dog(String name, int runD, int jumpH, int swimD) {
        super(name, runD, jumpH, swimD);
        this.type = "Псина";
    }
    Dog(String name){
        super(name);
        this.type = "Псина";
        this.minJumpHeight = minJH;
        this.maxJumpHeight = mamJH;
        this.minRunDistance = minRD;
        this.maxRunDistance = maxRD;
        this.minSwimDistance = minSD;
        this.maxSwimDistance = maxSD;
        this.permissibleJumpHeight = mathRand(minJumpHeight,maxJumpHeight);
        this.permissibleRunDistance = mathRand(minRunDistance,maxRunDistance);
        this.permissibleSwimDistance = mathRand(minSD,maxSD);
    }
}
