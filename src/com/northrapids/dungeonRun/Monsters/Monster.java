package com.northrapids.dungeonRun.Monsters;

import com.northrapids.dungeonRun.ICombat;

public class Monster implements ICombat {

    private String name;
    private int health;
    private final int strength;
    private final int baseDamage;

    public Monster(int health, int strength, int baseDamage) {
        this.name = getClass().getSimpleName();
        this.health = health;
        this.strength = strength;
        this.baseDamage = baseDamage;
    }

    // ASCII art for each monster inside each class
    public void showMonsterImage(){

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public int fight() {

        return calculateDamage();
    }

    @Override
    public int calculateDamage() {

        int damage;

        if (getHealth() < 10) {
            damage = ((getStrength() + getBaseDamage()) / 4) * 4;
        } else {
            damage = ((getStrength() + getBaseDamage()) / 4) * 2;
        }

        return damage;
    }
}
