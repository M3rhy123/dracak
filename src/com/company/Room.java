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
    
    public void start() throws InterruptedException{
        System.out.println("  ____                 _       _                  _       _____           _   _     ____  ");
        System.out.println(" |  _ \\    ___   ___  (_)   __| |   ___   _ __   | |_    | ____| __   __ (_) | |   |___ \\ ");
        System.out.println(" | |_) |  / _ \\ / __| | |  / _` |  / _ \\ | '_ \\  | __|   |  _|   \\ \\ / / | | | |     __) |");
        System.out.println(" |  _ <  |  __/ \\__ \\ | | | (_| | |  __/ | | | | | |_    | |___   \\ V /  | | | |    / __/ ");
        System.out.println(" |_| \\_\\  \\___| |___/ |_|  \\__,_|  \\___| |_| |_|  \\__|   |_____|   \\_/   |_| |_|   |_____|");
        System.out.println("*lidl version");
        TimeUnit.SECONDS.sleep(5);

    }

    public void gasStation(Entity p, Entity z) throws InterruptedException {
        System.out.println("You arrived to gas station");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Nobody isn't here");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You are entering gas station");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Lights off, in back storage are some noises...");
        TimeUnit.MILLISECONDS.sleep(50);
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
        z.setHp(73);
        System.out.println("You enterd the " + name);
        TimeUnit.SECONDS.sleep(5);
        System.out.println("The place is really messed up, blod everywhere, nobody nowhere...");
        TimeUnit.SECONDS.sleep(6);
        System.out.println("Ohh small ammo pacage");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("24 bullets to pistol");
        Weapeon.MATILDA_PISTOL.setAmmo(Weapeon.MATILDA_PISTOL.getAmmo() + 24);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You are looking for anything other...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Pacage with 3 shotgun ammo");
        Weapeon.SHOTGUN.setAmmo(Weapeon.SHOTGUN.getAmmo() + 3);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("There is one zomie ahead");
        TimeUnit.SECONDS.sleep(2);
        fight(p, z);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Doors to left west wing seems to be Unlockable");
        System.out.println("Going in");

    }
    public void leftCoridor(Entity p, Entity z) throws InterruptedException{
        System.out.println("Broken window, its raining");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Only silent here.... kinda suspicious");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Corner i hear steps");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Another zombie");
        TimeUnit.SECONDS.sleep(1);
        fight(p,z);
        System.out.println("He had a few Deagle bullets in pocket (8)");
        Weapeon.DEAGLE.setAmmo(Weapeon.DEAGLE.getAmmo()+8);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Some door..");
    }

    public static void saveRoom(Entity p) throws InterruptedException{
        System.out.println("Its save room");
        int x = Integer.parseInt(Utility.getInput());
        switch (x){
            case 1 -> System.exit(0);
            case 2 -> {
                System.out.println("work in peogress... next room isn't coded yet");
                System.exit(0);
            }
        }
    }


}
