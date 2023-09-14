package com.northrapids.dungeonRun.Monsters;

public class Witch extends Monster{

    public Witch(int health, int strength, int baseDamage) {
        super(health, strength, baseDamage);
    }

    @Override
    public void showMonsterImage() {
        System.out.println("""
                \t\t     |\\
                \t\t     | \\
                \t\t     |  \\
                \t\t     |-(o\\
                \t\t<===============>
                \t\t  (( >0  x< ))
                \t\t  @\\   ,\\  /@
                \t\t  (([ |nn| ]))
                \t\t  )(||vvvv||)(
                \t\t     \\___,/
                   """);
    }

}
