package com.company;

import com.company.Room;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Entity p, z, b;

        p = new Entity("Leon", "person","survivor", 100, 0);

        z = new Entity("Zombie", "zombie","enemy", 80, 0);
        b = new Entity("Mr. Birkin", "G-mutnant", "enemy", 300, 0);

        Weapeon.MATILDA_PISTOL.setAmmo(14);
        Weapeon.SHOTGUN.setAmmo(0);
        Weapeon.DEAGLE.setAmmo(0);
        Room room0 = new Room("Gas Station");
        room0.gasStation(p,z);

        Room room1 = new Room("Racoon City");
        room1.city(p,z);

        Room room2 = new Room("Main Hall");
        room2.hall(p,z);



    }

}
