package com.northrapids.dungeonRun.Monsters;

public class Hobgoblin extends Monster {

    public Hobgoblin(int health, int strength, int baseDamage) {
        super(health, strength, baseDamage);
    }

    @Override
    public void showMonsterImage() {
        System.out.println("""
                \t\t   /||\\+/||\\
                \t\t ,{ __\\ /__ },
                \t\t/\\.-{O   o}-./\\
                \t\t\\@\\ =(   )= /@/
                \t\t \\/\\,  u  ,/\\/
                \t\t    \\=====/
                \t\t +___| U |___+
                 """);
    }
}
