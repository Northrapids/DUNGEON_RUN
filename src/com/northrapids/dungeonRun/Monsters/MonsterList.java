package com.northrapids.dungeonRun.Monsters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonsterList {

    // List of Monster
    private final List<Monster> listOfMonsters = new ArrayList<>();

    // method for generating random monster
    public Monster randomizeMonster() {

        // populates list of monster
        listOfMonsters.add(new Gnome(50,5,10));
        listOfMonsters.add(new Golem(200,10,30));
        listOfMonsters.add(new Hobgoblin(75,5,15));
        listOfMonsters.add(new Skeleton(100,10,20));
        listOfMonsters.add(new Vampire(90,15,25));
        listOfMonsters.add(new Witch(120,10,25));

        // randomize monster from list of monster
        Collections.shuffle(listOfMonsters);

        return listOfMonsters.get(0);
    }

}
