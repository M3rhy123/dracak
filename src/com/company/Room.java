package com.company;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import com.company.Entity;

public class Room {

    private String name;

    public Room(String name){this.name = name;}
    private boolean isRunning=true;

    public void hall(Entity p, Entity z) throws InterruptedException {
        System.out.println("You entred the main hall..");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("There is one zomie ahead");
        TimeUnit.SECONDS.sleep(3);
        while (isRunning == true) {
            fight(p, z);
        }
    }
    private void fight(Entity p, Entity z){
        System.out.println("1. Shot");
        System.out.println("2. Dodge");
        int num;
        int x;
        num = Integer.parseInt(Utility.getInput());
        try{
        switch (num) {
            case 1 -> {
                System.out.println("Choose gun");
                System.out.print("1 - ");
                Utility.printText(Weapeon.MATILDA_PISTOL.getName());
                System.out.print("2 - ");
                Utility.printText(Weapeon.SHOTGUN.getName());
                x = Integer.parseInt(Utility.getInput());
                int upperBound = 5;
                int lowerBound = 2;
                int d = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
                int distance = d;

                switch (x) {
                    case 1-> {
                        Utility.printText(p.getName());
                        System.out.print("fired from ");
                        Utility.printText(Weapeon.MATILDA_PISTOL.getName());
                        int shot = 1;
                        while(z.getHp() > 0 || distance!=0){
                            System.out.println("Shot " + shot);
                            z.setHp(Math.floor(z.getHp() - Weapeon.MATILDA_PISTOL.getDmg()));
                            Weapeon.MATILDA_PISTOL.setAmmo(Weapeon.MATILDA_PISTOL.getAmmo()-1);
                            shot++;
                            distance--;

                    }
                        isEnemyDead(z);
                        while(distance !=0){
                            System.out.println("Zombie got you");
                            System.out.print("1 -Use ");
                            Utility.printText(Weapeon.KNIFE.getName());
                            System.out.println("2 - I cant (game ent)");
                            int ch;
                            ch = Integer.parseInt(Utility.getInput());
                            switch(ch) {
                                case 1 -> {
                                    if(Weapeon.KNIFE.getCapacity()!=0){
                                        Weapeon.KNIFE.setCapacity(Weapeon.KNIFE.getCapacity()-1);
                                        System.out.print("You saved your life with");
                                        Utility.printText(Weapeon.KNIFE.getName());
                                        z.setHp(-1);
                                        isEnemyDead(z);
                                    }else{
                                        System.out.println("Knife is broken!");
                                        p.setHp(-1);
                                        isPlayerDead(p);
                                    }
                                    return;
                                }
                                case 2 ->{
                                    p.setHp(-1);
                                    isPlayerDead(p);
                                }
                            }
                            return;
                        }

                        }
                        case 2 -> {
                            Utility.printText(p.getName());
                            System.out.print("fired from ");
                            Utility.printText(Weapeon.SHOTGUN.getName());
                            int shot = 1;
                            while(z.getHp() > 0 || distance!=0){
                                System.out.println("Shot " + shot);
                                z.setHp(Math.floor(z.getHp() - Weapeon.SHOTGUN.getDmg()));
                                Weapeon.SHOTGUN.setAmmo(Weapeon.SHOTGUN.getAmmo()-1);
                                shot++;
                                distance--;
                            }
                            isEnemyDead(z);

                            while(distance !=0){
                                System.out.println("Zombie got you");
                                System.out.print("1 -Use ");
                                Utility.printText(Weapeon.KNIFE.getName());
                                System.out.println("2 - I cant (game ent)");
                                int ch;
                                ch = Integer.parseInt(Utility.getInput());
                                switch(ch) {
                                    case 1 -> {
                                        if(Weapeon.KNIFE.getCapacity()!=0){
                                            Weapeon.KNIFE.setCapacity(Weapeon.KNIFE.getCapacity()-1);
                                            System.out.print("You saved your life with");
                                            Utility.printText(Weapeon.KNIFE.getName());
                                            z.setHp(-1);
                                            isEnemyDead(z);
                                        }else{
                                            System.out.println("Knife is broken!");
                                            p.setHp(-1);
                                            isPlayerDead(p);
                                        }
                                        return;
                                    }
                                    case 2 ->{
                                        p.setHp(-1);
                                        isPlayerDead(p);
                                    }
                                }
                                return;
                            }

                        }
                }
            }
            case 2 -> {
                double rand = Math.random();
                if (rand < 0.75){
                    Utility.printText(p.getName());
                    System.out.println(" has sucesfully escaped");
                    isRunning = false;
                }else{
                    System.out.println("Zombie got you");
                    System.out.print("1 - Use ");
                    Utility.printText(Weapeon.KNIFE.getName());
                    System.out.println("2 - I cant (game ent)");
                    int ch;
                    ch = Integer.parseInt(Utility.getInput());
                    switch(ch) {
                        case 1 -> {
                            if(Weapeon.KNIFE.getCapacity()!=0){
                                Weapeon.KNIFE.setCapacity(Weapeon.KNIFE.getCapacity()-1);
                                System.out.print("You saved your life with");
                                Utility.printText(Weapeon.KNIFE.getName());
                                z.setHp(-1);
                                isEnemyDead(z);
                            }
                            else{
                                System.out.println("Knife is broken!");
                                p.setHp(-1);
                                isPlayerDead(p);
                        }return;
                        }
                        case 2 ->{
                            p.setHp(-1);
                            isPlayerDead(p);
                        }
                    }
                    return;
                }
                return;
            }

        }

        } catch (Exception e) {


        }
    }
    private boolean isPlayerDead(Entity p) {
        if (p.getHp() <= 0) {
            Utility.printText("You were eaten");
            isRunning=false;
            return true;
        }
        return false;
    }

    private boolean isEnemyDead( Entity z) {
        if (z.getHp() <= 0) {
            Utility.printText("You killed that bastard!");
            isRunning=false;
            return true;
        }
        return false;
    }


}

