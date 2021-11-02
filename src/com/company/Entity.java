package com.company;

import java.util.ArrayList;

public class Entity {

    private String name;
    private String rasa;
    private String role;
    private int lvl;
    private double hp;
    private double dmg;
    private double mana;
    private double money;
    private ArrayList<Item> inv = new ArrayList<>();

    public Entity(String name, String rasa, String role, int lvl, double hp, double damage, double mana, double money) {
        this.name = name;
        this.rasa = rasa;
        this.role = role;
        this.lvl = lvl;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
