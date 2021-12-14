package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import com.company.Entity;

import static com.company.Fight.*;


public class Room {

    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void gasStation(Entity p, Entity z) throws InterruptedException {
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
        fightOnlyKill(p, z);
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
        fightOnlyDoge(z, p);
        System.out.println("Another zombie");
        TimeUnit.SECONDS.sleep(1);
        fightOnlyDoge(z, p);
        System.out.println("You see a police station");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Almost here...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Next annoying brain-eater");
        fightOnlyDoge(z, p);
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
        Weapeon.MATILDA_PISTOL.setAmmo(Weapeon.MATILDA_PISTOL.getAmmo() + 24);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You are looking for anything other...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Pacage with 3 shotgun ammo");
        Weapeon.SHOTGUN.setAmmo(Weapeon.SHOTGUN.getAmmo() + 3);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("There is one zomie ahead");
        TimeUnit.SECONDS.sleep(3);
        Weapeon.MATILDA_PISTOL.setAmmo(1);
        fight(p, z);

    }


}