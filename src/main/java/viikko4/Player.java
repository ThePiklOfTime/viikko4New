package viikko4;

import java.io.Serializable;

public class Player implements Serializable{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean attack(Monster monster) {
        int damage = 10;
        System.out.println(name + " hyökkää hirviöön " + monster.getType() + " hirviöön!");
        boolean isDead = monster.takeDamage(damage);
        if (isDead) {
            System.out.println("Hirviö " + monster.getType() + " on tapettu!");
            return true;
        }
        return false;


    }
}
