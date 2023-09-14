package com.northrapids.dungeonRun;

import com.northrapids.dungeonRun.Monsters.Monster;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class DungeonTest {

    Player player;
    Monster monster;

    @Test
    @BeforeEach
    public void start() {
         player = new Player("",5,100,0,1,10,10,10);
         monster = new Monster(100,10,20);
    }

    @Test
    @DisplayName("Can player can level up")
    public void levelUpTest() {

        player.setExperience(player.getExperience() + 100);
        if (player.getExperience() >= 100) {
            player.setLevel(player.getLevel() + 1);
        }
        assertEquals(player.getLevel(),2);
        System.out.println("Player can level up!");
    }

    @Test
    @DisplayName("Can player die?")
    public void playerLoseTest() {

        int playerTestHealth = 100;
        int monstertestAttack = 20;

        player.setHealth(player.getHealth() - monstertestAttack);
        assertTrue(player.getHealth() < playerTestHealth);
        System.out.println("Player can die!");
    }

    @Test
    @DisplayName("Can player deal damage?")
    public void playerDamageTest() {

        int playerDamage = player.calculateDamage();

        assertEquals(playerDamage,30);
        System.out.println("Player can deal damage!");
    }

}
