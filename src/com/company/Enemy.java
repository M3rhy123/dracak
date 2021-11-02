package com.company;

public class Enemy extends Entity implements Ifight {


    public Enemy(String name, String rasa, String role, int lvl, double hp, double damage, double mana, double money) {
        super(name, rasa, role, lvl, hp, damage, mana, money);
    }

    @Override
    public void attack() {

    }

    @Override
    public void def() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void useItem() {

    }

    @Override
    public void runAway() {

    }
}
