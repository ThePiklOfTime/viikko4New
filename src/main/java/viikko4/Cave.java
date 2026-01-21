package viikko4;

import java.io.Serializable;
import java.util.ArrayList;

public class Cave implements Serializable{
    public ArrayList<Monster> monsters;
    public Player player;
    Cave(Player player) {
        this.monsters = new ArrayList<>();
        this.player = player;
    }

    public void addMonster(Monster monster) {
        this.monsters.add(monster);
    }

    public void listMonsters() {
        int i = 1;
        if (monsters.isEmpty()) {
            System.out.println("Luola on tyhjä.");
        } else {
            System.out.println("Luolan hirviöt:");
            for (Monster monster : monsters) {
                monster.printInfo(i);
                i++;
            }
        }
    }
}
