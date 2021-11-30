package com.company;

public class Enemy extends Entity implements Ifight {


    public Enemy(String name, String rasa, String role, double hp, double damage) {
        super(name, rasa, role, hp, damage);
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
