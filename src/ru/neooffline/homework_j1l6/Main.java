package ru.neooffline.homework_j1l6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int catsCount = 10;
        Cat cat1 = new Cat("Жора");
        Dog dog1 = new Dog("Палкан");
        WildCat wildCat1 = new WildCat("Кокс");
        HomeCat homeCat = new HomeCat("Тошка");
        cat1.jump(2);
        cat1.run(1500);
        cat1.swim(10);
        System.out.println("-----------");
        dog1.jump(2.3);
        dog1.run(1000);
        dog1.swim(300);
        System.out.println("-----------");
        wildCat1.findFood(3);
        System.out.println("-----------");
        homeCat.findFood(0.2);
        System.out.println("-----------");
        HashMap<String, FindFood> cats = new HashMap<>();
        for (int i = 1; i <= catsCount; i++) {
            if (i%2==0){
                cats.put("Домашний кот номер " + i, new HomeCat("Подопытный " + i));
            } else {
                cats.put("Дикий кот номер " + i, new WildCat("Подопытный " + i));
            }
        }
        Iterator<Map.Entry<String,FindFood>> entryIterator = cats.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,FindFood> entry = entryIterator.next();
            entry.getValue().findFood(Math.floor
                    (ThreadLocalRandom.current().nextDouble(0.1,4)*100)/100);
        }
    }
}
