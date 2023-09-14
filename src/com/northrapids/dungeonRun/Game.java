package com.northrapids.dungeonRun;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    Player player = new Player("",5,100,0,1,5,10,10);
    CombatSequence cs = new CombatSequence();

    boolean isPlaying = true;
    public void startGame() {

        System.out.println("""
                 ___    __ __  ____    ____    ___   ___   ____       ____  __ __  ____
                |   \\  |  |  ||    \\  /    |  /  _] /   \\ |    \\     |    \\|  |  ||    \\
                |    \\ |  |  ||  _  ||   __| /  [_ |     ||  _  |    |  D  )  |  ||  _  |
                |  D  ||  |  ||  |  ||  |  ||    _]|  O  ||  |  |    |    /|  |  ||  |  |
                |     ||  :  ||  |  ||  |_ ||   [_ |     ||  |  |    |    \\|  :  ||  |  |
                |     ||     ||  |  ||     ||     ||     ||  |  |    |  .  \\     ||  |  |
                |_____| \\__,_||__|__||___,_||_____| \\___/ |__|__|    |__|\\_|\\__,_||__|__|""");

        System.out.println("\nEnter Your name:");

        player.setName(scanner.next());

        System.out.println("\nWelcome to the Dungeon " + player.getName() + "!");

        do {
            System.out.println("""                    
                    \n********************************
                    ********* DUNGEON RUN! *********
                    ** What would you like to do? **
                    ********************************
                    1   ->   Fight Monsters    <-  1
                    2   ->   Player Status     <-  2
                    0   ->   Quit Game         <-  0
                    ********************************
                    """);

            switch (scanner.next()) {
                case "1" -> cs.combat(player);
                case "2" -> player.stats();
                case "0" -> {
                    System.out.println("Quiting Game!");
                    isPlaying = false;
                }
                default -> System.out.println("Invalid input! Try again!");
            }
        } while (isPlaying);

    }
}
