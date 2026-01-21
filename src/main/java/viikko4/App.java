package viikko4;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syötä pelaajan nimi: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        Cave cave = new Cave(player);
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää luolaan hirviö \n2) Listaa hirviöt \n3) Hyökkää hirviöön \n4) Tallenna peli \n5) Lataa peli \n0) Lopeta peli");
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Anna hirviön tyyppi: ");
                    String type = scanner.nextLine();
                    System.out.println("Anna hirviön elämän määrä numerona: ");
                    int health = Integer.parseInt(scanner.nextLine());
                    Monster monster = new Monster(type, health);
                    cave.addMonster(monster);
                    break;
                case 2:
                    System.out.println("Luolan hirviöt:");
                    cave.listMonsters();
                    break;
                case 3:
                    System.out.println("Valitse hirviö, johon hyökätä: ");
                    cave.listMonsters();
                    int monsterIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    if (cave.player.attack(cave.monsters.get(monsterIndex))) {
                        cave.monsters.remove(monsterIndex);
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            
            
                }
        }
    }
    System.out.println("Peli päättyy. Kiitos pelaamisesta!");
    scanner.close();
    }
}
