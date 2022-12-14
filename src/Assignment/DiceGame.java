package Assignment;

import java.security.SecureRandom;

public class DiceGame {
    private enum Status {CONTINUE, WIN, LOSE}

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0;
        Status gameStatus;
        int sumOfdice = rollDIce();
        switch (sumOfdice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WIN;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOSE;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfdice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }
        while (gameStatus == Status.CONTINUE) {
            sumOfdice = rollDIce();
            if (sumOfdice == myPoint) {
                gameStatus = Status.WIN;
            } else {
                if (sumOfdice == SEVEN)
                    gameStatus = Status.LOSE;
            }
        }


        if (gameStatus == Status.WIN) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }

    }

    private static int rollDIce() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
