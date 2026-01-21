package viikko4;

import java.util.ArrayList;

public class Cave {
    private ArrayList<Monster> monsters;
    private Player player;
    Cave(Player player) {
        this.monsters = new ArrayList<>();
        this.player = player;
    }

    void addMonster(Monster monster) {
        this.monsters.add(monster);
    }
}
