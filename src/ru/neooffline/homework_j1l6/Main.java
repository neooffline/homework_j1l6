package ru.neooffline.homework_j1l6;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Жора");
        Dog dog1 = new Dog("Палкан");
        WildCat wildCat1 = new WildCat("Кокс");
        cat1.jump(2);
        cat1.run(1500);
        cat1.swim(10);
        System.out.println("-----------");
        dog1.jump(2.3);
        dog1.run(1000);
        dog1.swim(300);
        System.out.println("-----------");
        wildCat1.findFood(3);
    }
}
