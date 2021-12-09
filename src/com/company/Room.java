package com.company;

import java.util.concurrent.TimeUnit;
import com.company.Entity;

public class Room {

    private String name;

    public Room(String name){this.name = name;}

    public class Hall{

    public void hall(Entity p, Entity z) throws InterruptedException {
        System.out.println("You entred the main hall..");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("There is one zomie ahead");
        TimeUnit.SECONDS.sleep(2);
        fight(p, z);

    }
}
    private void fight(Entity p, Entity z){
        System.out.println("1. Shot");
        System.out.println("2. Dodge");
        int num;
        int x;
        num = Integer.parseInt(Utility.getInput());
        x = Integer.parseInt(Utility.getInput());
        switch (num) {
            case 1 -> {
                System.out.println("Choose gun");
                System.out.println("1 - " + Utility.printText(););
                x = Integer.parseInt(Utility.getInput());
                switch (x) {

                }
                Utility.printText(p.getName() + "");
            }
        }


    }


}
