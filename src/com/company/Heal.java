package com.company;

public enum Heal {
    HEALING_SPRAY("First Aid Spray", 100),
    HERBG("Herb Green", 25),
    HERBS("Mixed Herbs G+B+R", 100);


    private String name;
    private double hp;

    Heal(String name, double dmg) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
