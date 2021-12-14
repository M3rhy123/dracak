package com.company;

import java.util.concurrent.TimeUnit;

public class Fight {
    public static void fight(Entity p, Entity z) throws InterruptedException {
        System.out.println("1. Shot");
        System.out.println("2. Dodge");
        int num;
        int x;
        num = Integer.parseInt(Utility.getInput());
        switch (num) {
            case 1 -> {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Choose gun");
                System.out.print("1 - ");
                System.out.print(Weapeon.MATILDA_PISTOL.getName() + " DMG " + Weapeon.MATILDA_PISTOL.getDmg());
                System.out.println(" Ammo " + Weapeon.MATILDA_PISTOL.getAmmo());
                System.out.print("2 - ");
                System.out.print(Weapeon.SHOTGUN.getName() + " DMG " + Weapeon.SHOTGUN.getDmg());
                System.out.println(" Ammo " + Weapeon.SHOTGUN.getAmmo());
                System.out.print("3 - ");
                System.out.print(Weapeon.DEAGLE.getName() + " DMG " + Weapeon.DEAGLE.getDmg());
                System.out.println(" Ammo " + Weapeon.DEAGLE.getAmmo());
                x = Integer.parseInt(Utility.getInput());
                int upperBound = 5;
                int lowerBound = 2;
                int d = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
                int distance = d;

                switch (x) {
                    case 1-> {
                        System.out.println(p.getName());
                        System.out.print("fired from ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(Weapeon.MATILDA_PISTOL.getName());
                        int shot = 1;
                        while(z.getHp() > 0){
                            System.out.println("Shot " + shot);
                            TimeUnit.SECONDS.sleep(2);
                            z.setHp(Math.floor(z.getHp() - Weapeon.MATILDA_PISTOL.getDmg()));
                            Weapeon.MATILDA_PISTOL.setAmmo(Weapeon.MATILDA_PISTOL.getAmmo()-1);
                            if (Weapeon.MATILDA_PISTOL.getAmmo() == 0){
                                System.out.println("No ammo left");
                                distance = distance - 5;
                            }
                            shot++;
                            distance--;

                            while (distance <= 0){
                                lowDistance(z,p);
                                return;
                            }
                        }
                        return;


                    }
                    case 2 -> {
                        System.out.println(p.getName());
                        System.out.print("fireing from ");
                        System.out.println(Weapeon.SHOTGUN.getName());
                        TimeUnit.SECONDS.sleep(1);
                        int shot = 1;
                        while(z.getHp() > 0){
                            System.out.println("Shot " + shot);
                            TimeUnit.SECONDS.sleep(3);
                            z.setHp(z.getHp() - Weapeon.SHOTGUN.getDmg());
                            Weapeon.SHOTGUN.setAmmo(Weapeon.SHOTGUN.getAmmo()-1);
                            if (Weapeon.SHOTGUN.getAmmo() == 0){
                                distance = 0;
                            }
                            shot++;
                            distance--;
                        }

                        while (distance <= 0){
                            lowDistance(z,p);
                            distance = 10;
                        }
                    return;
                    }

                    case 3 -> {
                        System.out.println(p.getName());
                        System.out.print("fireing from ");
                        System.out.println(Weapeon.DEAGLE.getName());
                        TimeUnit.SECONDS.sleep(1);
                        int shot = 1;
                        while(z.getHp() > 0 && distance!=0){
                            System.out.println("Shot " + shot);
                            TimeUnit.SECONDS.sleep(3);
                            z.setHp(z.getHp() - Weapeon.DEAGLE.getDmg());
                            Weapeon.DEAGLE.setAmmo(Weapeon.DEAGLE.getAmmo()-1);
                            if (Weapeon.DEAGLE.getAmmo() == 0){
                                distance = 0;
                            }
                            shot++;
                            distance--;

                            while (distance <= 0){
                                lowDistance(z,p);
                                return;
                            }
                        }
                    }
                }
            }
            case 2 -> {
                double rand = Math.random();
                if (rand < 0.75){
                    System.out.println("You had sucesfully escaped");
                    return;
                }else{
                    lowDistance(z,p);
                }
                return;
            }


        }

    }


    public static void fightOnlyKill(Entity p, Entity z) throws InterruptedException {
        System.out.println("You must kill it");
        System.out.println("1. Shot");
        System.out.println("2. Use knife");
        System.out.println("Uses " + Weapeon.KNIFE.getAmmo());
        int num;
        int x;
        num = Integer.parseInt(Utility.getInput());
        switch (num) {
            case 1 -> {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Choose gun");
                System.out.print("1 - ");
                System.out.print(Weapeon.MATILDA_PISTOL.getName() + " DMG " + Weapeon.MATILDA_PISTOL.getDmg());
                System.out.println(" Ammo " + Weapeon.MATILDA_PISTOL.getAmmo());
                System.out.print("2 - ");
                System.out.print(Weapeon.SHOTGUN.getName() + " DMG " + Weapeon.SHOTGUN.getDmg());
                System.out.println(" Ammo " + Weapeon.SHOTGUN.getAmmo());
                System.out.print("3 - ");
                System.out.print(Weapeon.DEAGLE.getName() + " DMG " + Weapeon.DEAGLE.getDmg());
                System.out.println(" Ammo " + Weapeon.DEAGLE.getAmmo());
                x = Integer.parseInt(Utility.getInput());
                int upperBound = 5;
                int lowerBound = 2;
                int d = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
                int distance = d;

                switch (x) {
                    case 1-> {
                        System.out.println("You choosed");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(Weapeon.MATILDA_PISTOL.getName());
                        int shot = 1;
                        while(z.getHp() > 0){
                            System.out.println("Shot " + shot);
                            TimeUnit.SECONDS.sleep(2);
                            z.setHp(Math.floor(z.getHp() - Weapeon.MATILDA_PISTOL.getDmg()));
                            Weapeon.MATILDA_PISTOL.setAmmo(Weapeon.MATILDA_PISTOL.getAmmo()-1);
                            if (Weapeon.MATILDA_PISTOL.getAmmo() == 0){
                                System.out.println("No ammo left");
                                distance = distance - 5;
                            }
                            shot++;
                            distance--;

                            while (distance <= 0){
                                lowDistance(z,p);
                                return;
                            }
                            isEnemyDead(z);
                        }


                    }
                    case 2 -> {
                        System.out.print("You choosed ");
                        System.out.println(Weapeon.SHOTGUN.getName());
                        TimeUnit.SECONDS.sleep(1);
                        int shot = 1;
                        while(z.getHp() > 0){
                            System.out.println("Shot " + shot);
                            TimeUnit.SECONDS.sleep(3);
                            z.setHp(z.getHp() - Weapeon.SHOTGUN.getDmg());
                            Weapeon.SHOTGUN.setAmmo(Weapeon.SHOTGUN.getAmmo()-1);
                            if (Weapeon.SHOTGUN.getAmmo() == 0){
                                distance = 0;
                            }
                            shot++;
                            distance--;
                        }

                        while (distance <= 0){
                            lowDistance(z,p);
                            distance = 10;
                        }
                        isEnemyDead(z);
                    }


                    case 3 -> {
                        System.out.println("You choosed");
                        System.out.println(Weapeon.DEAGLE.getName());
                        TimeUnit.SECONDS.sleep(1);
                        int shot = 1;
                        while(z.getHp() > 0 && distance!=0){
                            System.out.println("Shot " + shot);
                            TimeUnit.SECONDS.sleep(3);
                            z.setHp(z.getHp() - Weapeon.DEAGLE.getDmg());
                            Weapeon.DEAGLE.setAmmo(Weapeon.DEAGLE.getAmmo()-1);
                            if (Weapeon.DEAGLE.getAmmo() == 0){
                                distance = 0;
                            }
                            shot++;
                            distance--;

                            while (distance <= 0){
                                lowDistance(z,p);
                                return;
                            }
                        }
                        isEnemyDead(z);
                    }
                }
            }
            case 2 -> lowDistance(z,p);



        }

    }

    public static void fightOnlyDoge(Entity p, Entity z) throws InterruptedException {
        System.out.println("1. Shot");
        System.out.println("2. Dodge - recommended");
        int num;
        num = Integer.parseInt(Utility.getInput());
        switch (num) {
            case 1 -> lowDistance(z, p);

            case 2 -> fightend();

        }
        return;
    }


    public static void lowDistance(Entity z, Entity p) throws InterruptedException {
        System.out.println("Zombie got you");
        System.out.print("1 -Use ");
        System.out.println(Weapeon.KNIFE.getName());
        System.out.println("Uses " + Weapeon.KNIFE.getCapacity());
        System.out.println("2 - I cant (game ent)");
        int ch;
        ch = Integer.parseInt(Utility.getInput());
        switch(ch) {
            case 1 -> {
                if(Weapeon.KNIFE.getCapacity()!=0){
                    Weapeon.KNIFE.setCapacity(Weapeon.KNIFE.getCapacity()-1);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.print("You saved your life with");
                    System.out.println(Weapeon.KNIFE.getName());
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

    public static boolean isPlayerDead(Entity p) {
        if (p.getHp() <= 0) {
            System.out.println("You were eaten");
            return true;
        }
        return false;
    }

    public static boolean isEnemyDead(Entity z) {
        if (z.getHp() <= 0) {
            System.out.println("You killed that bastard!");
            return true;
        }
        return false;
    }

    public static boolean fightend(){
        return true;
    }



}

