package com.northrapids.dungeonRun.Monsters;

public class Vampire extends Monster {

    public Vampire(int health, int strength, int baseDamage) {
        super(health, strength, baseDamage);
    }

    @Override
    public void showMonsterImage() {
        System.out.println("""
                \t\t   _________
                \t\t  |\\_     _/|
                \t\t|\\[ o) | (o ]/|
                \t\t \\_)  | |  (_/
                \t\t   ||  V  ||
                \t\t    \\\\v=v//\s
                \t\t  A\\ \\/=\\/ /A
                \t\t /  \\_| |_/  \\
                """);
    }
}
