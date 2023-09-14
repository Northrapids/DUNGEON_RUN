package com.northrapids.dungeonRun.Monsters;

public class Skeleton extends Monster {

    public Skeleton(int health, int strength, int baseDamage) {
        super(health, strength, baseDamage);
    }

    @Override
    public void showMonsterImage() {
        System.out.println("""
                \t\t   _.---._
                \t\t .'    /  '.
                \t\t :)   Y   (:
                \t\t \\ (@) (@) /
                \t\t  \\   A   /
                \t\t   ).: :.(
                \t\t   \\""\"""/
                \t\t    '._.'
                \t\t@-==.|=|.==-@
                """);
    }

}
