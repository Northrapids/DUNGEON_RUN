package com.northrapids.dungeonRun.Monsters;

public class Golem extends Monster{

    public Golem(int health, int strength, int baseDamage) {
        super(health, strength, baseDamage);
    }

    @Override
    public void showMonsterImage() {
        System.out.println("""                   
                   \t\t   __________
                   \t\t  / |  ||  | \\
                   \t\t [= =      = =]
                   \t\t@[ O        O ]@
                   \t\t  [   [""]   ]
                   \t\t  \\|        |/
                   \t\t  [. =-==-= .]
                   \t\t   [_ ==== _]
                   """);
    }
}
