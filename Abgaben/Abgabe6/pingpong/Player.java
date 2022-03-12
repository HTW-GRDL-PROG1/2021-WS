package pingpong;

import java.util.Random;

public class Player {
    private String name;
    private int age;
    private int gamesWon;
    private int gamesLost;
    private int gamesDraw;

    public Player(String name, int age) {
        this.setName(name);
        this.age = age;
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.gamesDraw = 0;
    }

    public int throwBall() {
        Random random = new Random();
        int randomValue = random.nextInt(6);
        System.out.println("Player: " + this.getName() + " has thrown: " + randomValue);
        return randomValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void winGame() {

    }

    public void looseGame() {
        this.gamesLost += 1;
    }

    public void drawGame() {
        this.gamesDraw += 1;
    }

    public void startGame(Player p) {
        System.out.println(p.getName() + ", ich fordere Dich zum Spiel auf!");
    }

    public void acceptGame(Player p) {
        System.out.println(p.getName() + ", ich nehme das Spiel an!");
    }

}
