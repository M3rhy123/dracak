package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import com.company.Entity;


public class Room {

    private String name;
    private boolean isRunning;

    public Room(String name){this.name = name;}

    public void gasStation(Entity p, Entity z) throws InterruptedException{
        System.out.println("You arrived to gas station");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Nobody isn't here");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You are entering gas station");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Lights off, in back storage are some noises...");
        TimeUnit.MILLISECONDS.sleep(25);
        System.out.println("Going ot check it...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Some creature biting pollice officer");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("IT FOFUSED NO YOU!");
        while (isRunning == true) {
            fightOnlyKill(p, z);
        }
        System.out.println("You ran out of policie station and looking for fastest way to police station...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Police car...");
    }

    public void city(Entity p, Entity z) throws InterruptedException {
        z.setHp(10);
        System.out.println("Int front of you is blocade, you must walk...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Zombie in way");
        TimeUnit.SECONDS.sleep(1);
        while (isRunning = true){
            fightOnlyDoge(z,p);
        }
        System.out.println("Another zombie");
        TimeUnit.SECONDS.sleep(1);
        while (isRunning = true){
            fightOnlyDoge(z,p);
        }
        System.out.println("You see a police station");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Almost here...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Next annoying brain-eater");
        while (isRunning = true){
            fightOnlyDoge(z,p);
        }
        System.out.println("Gate is opened... welcome to Racoon city police station");
        TimeUnit.SECONDS.sleep(5);
    }

    public void hall(Entity p, Entity z) throws InterruptedException {
        System.out.println("You enterd the " + name);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("The place is really messed up, blod everywhere, nobody nowhere...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Ohh small ammo pacage");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("24 bullets to pistol");
        Weapeon.MATILDA_PISTOL.setAmmo(Weapeon.MATILDA_PISTOL.getAmmo()+24);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You are looking for anything other...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Pacage with 3 shotgun ammo");
        Weapeon.SHOTGUN.setAmmo(Weapeon.SHOTGUN.getAmmo()+3);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("There is one zomie ahead");
        TimeUnit.SECONDS.sleep(3);
        Weapeon.MATILDA_PISTOL.setAmmo(1);
        while (isRunning == true) {
            fight(p, z);
        }
    }


    public  void fight(Entity p, Entity z) throws InterruptedException {
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
                    isRunning = false;
                }else{
                    lowDistance(z,p);
                }
                return;
            }


        }

    }


    public  void fightOnlyKill(Entity p, Entity z) throws InterruptedException {
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

    public  void fightOnlyDoge(Entity p, Entity z) throws InterruptedException {
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


    public  void lowDistance(Entity z, Entity p) throws InterruptedException {
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

    public  boolean isPlayerDead(Entity p) {
        if (p.getHp() <= 0) {
            System.out.println("You were eaten");
            isRunning=false;
            return true;
        }
        return false;
    }

    public  boolean isEnemyDead( Entity z) {
        if (z.getHp() <= 0) {
            System.out.println("You killed that bastard!");
            isRunning=false;
            return true;
        }
        return false;
    }

    public boolean fightend(){
            isRunning=false;
            return true;
    }



}

