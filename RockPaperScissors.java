import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerMove = scanner.nextLine();
        int playerWin = 0;
        int computerWin = 0;

        if(playerMove.equals("r") || playerMove.equals("rock")  ) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);

        String computerMove = "";

        switch (computerRandomNumber) {
            case 1:
                computerMove = ROCK;
                break;
            case 2:
                computerMove = PAPER;
                break;
            case 0:
                computerMove = SCISSORS;
                break;
        }
        System.out.printf("The computer choose: %s.\n", computerMove);

        if ((computerMove.equals("Rock") && playerMove.equals("Scissors"))
                || (computerMove.equals("Scissors") && playerMove.equals("Paper"))
                || (computerMove.equals("Paper") && playerMove.equals("Rock"))) {
            System.out.println("You LOSE");
            computerWin++;
        } else if ((playerMove.equals("Rock") && computerMove.equals("Scissors"))
                || (playerMove.equals("Scissors") && computerMove.equals("Paper"))
                || (playerMove.equals("Paper") && computerMove.equals("Rock"))) {
            System.out.println("You WIN");
            playerWin++;
        } else
            System.out.println("DRAW");
        System.out.println(playerWin + ":" + computerWin);

        if (playerWin>computerWin)
            System.out.printf("You WIN the game with %d:%d", playerWin, computerWin);
        else System.out.printf("You LOST the game with %d:%d", playerWin, computerWin);


}
    }





