package com.northrapids.dungeonRun;

import com.northrapids.dungeonRun.Monsters.Monster;

import java.util.Random;
import java.util.Scanner;

public class Player implements ICombat{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private String name;
    private int damage;
    private int health;
    private int experience;
    private int level;
    private int strength;
    private int intelligence;
    private int agility;

    public Player(String name, int damage, int health, int experience, int level, int strength, int intelligence, int agility) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.experience = experience;
        this.level = level;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
    }

    public void levelUp(){

        if (getExperience() >= 100) {

                setHealth(getHealth() + 10);
                setStrength(getStrength() + 2);
                setAgility(getAgility() + 2);
                setIntelligence(getIntelligence() + 2);
                setDamage(getDamage() + 1);
                setLevel(getLevel() + 1);
                setExperience(getExperience() - 100);
                System.out.println("LEVEL UP! You are now level " + getLevel());
        }
    }

    public void stats() {

        boolean checkingStats = true;

        do {

        System.out.println("""
                \n********************************
                ********* PLAYER STATS *********
                ********************************
                NAME:\t\t\t\t""" + getName() +
                """
                \nLEVEL:\t\t\t\t""" + getLevel() +
                """
                \nEXPERIENCE:\t\t\t""" + getExperience() +
                """
                \nHEALTH:\t\t\t\t""" + getHealth() +
                """
                \nSTRENGTH:\t\t\t""" + getStrength() +
                """
                \nDAMAGE:\t\t\t\t""" + getDamage() +
                """
                \nAGILITY:\t\t\t""" + getAgility() +
                """
                \nINTELLIGENCE:\t\t""" + getIntelligence() +
                """
                \n********************************
                1   ->  Back to main menu  <-  1
                ********************************
                """);


            if ("1".equals(scanner.next())) {
                checkingStats = false;
            } else {
                System.out.println("Invalid input! Input 1 to go back to main menu");
            }

        } while (checkingStats);
    }

    public void dodge(Monster monster) {

        if (random.nextInt(5,20) < getAgility()) {
            System.out.println("You dodged the " + monster.getName() + "'s attack!\n");
        } else {
            System.out.println(monster.getName() + " Retaliates and deals " + monster.fight() + " in damage!\n");
            setHealth(getHealth() - monster.fight());
        }
    }

    public void win(Monster monster) {


        System.out.println("You defeated the " + monster.getName() + "!");

        setExperience(getExperience() + random.nextInt(25,75));

        System.out.println("Your experience is now " + getExperience());

    }

    public void lose(Monster monster) {

        System.out.println("You where killed by the " + monster.getName() + "\nGame Over!\n");
        System.out.println("""
                                \t\t       :
                                \t\t     :=|=:
                                \t\t       |
                                \t\t    .-~~~-.
                                \t\t  .'       '.
                                \t\t  :         :
                                \t\t  |  R I P  |
                                \t\t  |         |
                                \t\t  |         |
                                \t\t\\\\|,,,,,,,,,|//""");
        System.exit(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public int fight() {

        return calculateDamage();

    }

    @Override
    public int calculateDamage() {

        if(getHealth() < 10) {
            return ((damage + strength) * 2) * 2;
        } else {
            return (damage + strength) * 2;
        }
    }
}
