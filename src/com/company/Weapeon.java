package com.company;

public enum Weapeon {
    KNIFE("Combat Knife", 20, 5),
    MATILDA_PISTOL("Matilda", 20, 14),
    SHOTGUN("W-870", 75, 4),
    DEAGLE("Lightning Hawk",100, 7),
    ROCKET_LAUNCHER("Anti tank Rocket", 150, 4);


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


    public void setName(String name) {
        this.name = name;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}
