// Megan Wheeler
// Assignment 2
// 19 January 2025
import java.util.Random;
import java.util.Scanner;

// Play rock, paper, scissors against the computer
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            // Get player's choice
            System.out.println("Rock, paper, scissors, shoot!" +
            "(Enter 1 for rock, 2 for paper, or 3 for scissors to play)");
            String playerNumberChoice = scanner.nextLine();
            String playerChoice;

            // Test player's input for accuracy
            if (!playerNumberChoice.equals("1") && !playerNumberChoice.equals("2") && !playerNumberChoice.equals("3")) {
                System.out.println("That's not quite right... Please try again.");
                continue;
            }

            // Assign rock, paper, or scissors based on player's input
            if (playerNumberChoice.equals("1")) {
                playerChoice = "rock";
            } else if (playerNumberChoice.equals("2") ) {
                playerChoice = "paper";
            } else {
                playerChoice = "scissors";
            }

            // Generate the computer's choice
            int computerChoiceNumber = random.nextInt(3) + 1;
            String computerChoice;
            if (computerChoiceNumber == 0) {
                computerChoice = "rock";
            } else if (computerChoiceNumber == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            // Display computer's choice
            System.out.println("The computer chose " + computerChoice + ".");

            // Display player's choice
            System.out.println("You chose " + playerChoice + ".");

            // Determine game result and display result
            if (computerChoice.equals(playerChoice)) {
                System.out.println("You tied!");
            } else if (computerChoice.equals("rock") && playerChoice.equals("paper") || 
                        computerChoice.equals("paper") && playerChoice.equals("scissors") || 
                        computerChoice.equals("scissors") && playerChoice.equals("rock")) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Sorry! Computer wins!");
            }

            // Ask if player wants to play again or quit
            System.out.println("Would you like to play again? (Enter yes or no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thank you for playing!");
                break;
            }
        
        }

        scanner.close();
    }
}