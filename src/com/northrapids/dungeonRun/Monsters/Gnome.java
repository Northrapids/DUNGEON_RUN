package com.northrapids.dungeonRun.Monsters;

public class Gnome extends Monster {

    public Gnome(int health, int strength, int baseDamage) {
        super(health, strength, baseDamage);
    }

    @Override
    public void showMonsterImage() {
        System.out.println("""
                \t\t       A
                \t\t      /x\\
                \t\t     /+x+\\
                \t\t    /+x+x+\\
                \t\t   /+x+x+x+\\
                \t\t  /xxx---xxx\\
                \t\t /===========\\
                \t\t@)o> (, ,) <o(@
                \t\t}}\\(v-----v)/{{
                \t\t   ((((-))))
                   """);
    }
}
