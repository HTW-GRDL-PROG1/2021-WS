package pingpong;

//import abgabe6.Player;

public class Game {

    public static void main(String[] args) {
        Player ping = new Player("Ping", 24);
        Player pong = new Player("Pong", 23);

        ping.startGame(pong);
        pong.acceptGame(ping);
        boolean gameOver = false;
        int pointsOfPing = 0;
        int pointsOfPong = 0;
        // add eingabe und wiederhole solange eingabe == was ich will
        while (!gameOver) {
            pointsOfPong += pong.throwBall();
            pointsOfPing += ping.throwBall();
            System.out.println("Pong has points: " + pointsOfPong);
            System.out.println("Ping has points: " + pointsOfPing);
            if (pointsOfPing >= 25 && pointsOfPong >= 25) {
                ping.drawGame();
                pong.drawGame();
                System.out.println("a draw!");
                gameOver = true;
            } else if (pointsOfPing >= 25) {
                ping.winGame();
                System.out.println("ping won!");
                gameOver = true;
            } else if (pointsOfPong >= 25) {
                pong.winGame();
                System.out.println("pong won!");
                gameOver = true;
            }
        }

    }
}
