package com.company;

public enum Weapeon {
    KNIFE("Combat Knife", 0, 5),
    MATILDA_PISTOL("Matilda", 21, 14),
    SHOTGUN("W-870 (SHOTGUN)", 75, 4),
    DEAGLE("Lightning Hawk",100, 7);

    private int ammo;
    private String name;
    private double dmg;
    private double capacity;

    Weapeon(String name, double dmg, double capacity) {
        this.name = name;
        this.dmg = dmg;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public double getDmg() {
        return dmg;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setAmmo(int munice) {
        this.ammo = munice;
    }
}
