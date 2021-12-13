package com.company;

import java.util.ArrayList;

public class Entity {

    private String name;
    private String rasa;
    private String role;
    private double hp;
    private ArrayList<Weapeon> inv = new ArrayList<>();

    public Entity(String name, String rasa, String role, double hp, double damage) {
        this.name = name;
        this.rasa = rasa;
        this.role = role;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {this.hp = hp;
    }


}
