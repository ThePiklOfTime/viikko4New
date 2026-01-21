package viikko4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            
            for (Monster monster : monsters) {
                monster.printInfo(i);
                i++;
            }
        }
    }
    public void saveGame(String filename) {
        
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
                out.writeObject(this.monsters);
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Peli tallennettiin tiedostoon " + filename);
       
        }
    public void loadGame(String filename) {
        
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            this.monsters = (ArrayList<Monster>) in.readObject();
            in.close(); 

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        System.out.println("Peli ladattu tiedostosta " + filename + ". Tervetuloa takaisin, " + this.player.name + ".") ;
    } 

}
