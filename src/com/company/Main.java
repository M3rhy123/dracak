package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Player p = new Player("micha", "dwarft","warior", 18, 10, 1, 100, 0);
        Enemy e = new Enemy("zajda", "dwarft","warior", 17, 1, 0, 1, 10);

        Item i = Item.DIA_SWORD;
        Item i2 = Item.GOLDEN_AXE;

        e.setHp(e.getHp() - i.getDmg() -p.getDmg());
        p.setHp(p.getHp()- e.getDmg() -i.getDmg());

    }
}
