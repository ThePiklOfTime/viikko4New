package viikko4;

import java.io.Serializable;

public class Player implements Serializable{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean attack(Monster monster) {
        int damage = 10;
        System.out.println(name + " hyökkää " + monster.getType() + " hirviöön!");
        boolean isDead = monster.takeDamage(damage);

        if (isDead) {
            System.out.println("Hirviö " + monster.getType() + " on kuollut!");
            return true;
        }
        System.out.println("Hirviöllä on " + monster.getHealth() + " elämää jäljellä.");

        return false;


    }
}
