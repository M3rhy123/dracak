package com.company;

import javax.crypto.ExemptionMechanism;

public class Main {

    public static void main(String[] args) {

        Player p = new Player("Leon", "person","survivor", 100, 0);

        Enemy z = new Enemy("MrWong", "zombie","enemy", 80, 25);
        Enemy b = new Enemy("Mr. Birkin", "G-mutnant", "enemy", 300, 35);

        Weapeon knife = Weapeon.KNIFE;
        Weapeon Matilda = Weapeon.MATILDA_PISTOL;
        Weapeon Shotgun = Weapeon.SHOTGUN;
        Weapeon Deagle = Weapeon.DEAGLE;
        Weapeon Rocket_Launcher = Weapeon.ROCKET_LAUNCHER;



       // e.setHp(e.getHp() - knife.getDmg() -p.getDmg());
       // p.setHp(p.getHp()- e.getDmg() -knife.getDmg());

    }
}
