package com.northrapids.dungeonRun;

import com.northrapids.dungeonRun.Monsters.Monster;
import com.northrapids.dungeonRun.Monsters.MonsterList;

import java.util.Random;
import java.util.Scanner;

public class CombatSequence {

    Monster monster;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void combat(Player player) {

        MonsterList ml = new MonsterList();

        // calls random monster from monster list class
        monster = ml.randomizeMonster();

        System.out.println("\tYou encounter a " + monster.getName() + "!\n");

        boolean isFighting = true;

        do {
            // shows ASCII art
            monster.showMonsterImage();
            // Player and Monster HP before fight
            System.out.println(monster.getName() + "\nHP: " + monster.getHealth());
            System.out.println(player.getName() + "\nHP: " + player.getHealth());
            // Fight menu
            System.out.println("""                    
                    ********************************
                    ******* Fighting Monster *******
                    ********************************
                    1   ->        Fight        <-  1
                    0   ->        Run          <-  0
                    ********************************
                    """);

            switch (scanner.next()) {
                case "1" -> {
                    System.out.println("You attack " + monster.getName() + " and deals " + player.fight() + " in damage!");

                    player.dodge(monster);

                    monster.setHealth(monster.getHealth() - player.fight());

                    if(player.getHealth() <= 0) {
                        player.lose(monster);
                    } else if (monster.getHealth() <= 0) {
                        player.win(monster);
                        player.levelUp();
                        isFighting = false;
                    }
                }
                case "0" -> {
                    if(player.getIntelligence() + player.getAgility() > random.nextInt(5,30)) {
                        System.out.println("With quick thinking and nimble feet \nyou where able to gracefully yet \ncowardly run away from the " + monster.getName());
                        isFighting = false;
                    } else {
                        System.out.println("The " + monster.getName() + " could easily predict \nyour move and quickly managed \nto stop your escape attempt!\n");
                    }
                }
                default -> System.out.println("Invalid input! Try again!");
            }
        } while (isFighting);

    }
}
