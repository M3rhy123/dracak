package com.company;

import com.company.Room;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Entity p, z, b;

        p = new Entity("Leon", "person","survivor", 100, 0);

        z = new Entity("MrWong", "zombie","enemy", 80, 0);
        b = new Entity("Mr. Birkin", "G-mutnant", "enemy", 300, 0);

        Room room = new Room("Main Hall");
        room.hall(p,z);



    }

}
