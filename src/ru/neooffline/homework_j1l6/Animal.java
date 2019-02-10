package ru.neooffline.homework_j1l6;

import java.util.concurrent.ThreadLocalRandom;

public class Animal {
    protected String name;
    protected String type;
    protected double permissibleRunDistance;
    protected double permissibleJumpHeight;
    protected double permissibleSwimDistance;
    protected double minJumpHeight;
    protected double maxJumpHeight;
    protected double minRunDistance;
    protected double maxRunDistance;
    protected int minSwimDistance;
    protected int maxSwimDistance;

    Animal(String name, int runD, int jumpH, int swimD){
        this.name = name;
        this.type = "животное";
        this.permissibleRunDistance = runD;
        this.permissibleJumpHeight = jumpH;
        this.permissibleSwimDistance = swimD;
    }
    Animal(String name){
        this.name = name;

    }
    public int mathRand(int min,int max){
        return ThreadLocalRandom.current().nextInt(min,max);
    }
    public double mathRand(double min,double max){
        return Math.floor(ThreadLocalRandom.current().nextDouble(min,max)*100)/100;
    }
    public void run(double runDistance){
        System.out.println(type+" "+name + (runDistance<= permissibleRunDistance ?"" +
                " может пробежать ":" не может пробежать ")+ runDistance +
                " (предел "+permissibleRunDistance+"м)");
    }
    public void jump(double height){
        System.out.println(type+" "+name + (height<=permissibleJumpHeight?"" +
                " может так высоко прыгнуть ":" не может так высоко прыгать ")+ height +
                " (передел "+permissibleJumpHeight+"м)");
    }
    public void swim(int length){
        System.out.println(type+" "+name + (length<= permissibleSwimDistance ?"" +
                " сможет проплыть - ":" не сможет проплыть - ")+ length +
                " (предел "+ permissibleSwimDistance +"м)");
    }
}
