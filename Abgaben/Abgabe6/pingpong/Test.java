package pingpong;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rng = new Random();
        int oneToFive = rng.nextInt(5) + 1;
        System.out.println(oneToFive);
    }
}