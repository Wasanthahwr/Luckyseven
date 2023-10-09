import java.util.Random;
import java.util.Scanner;

public class Luckyseven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerMoney = 5;

        while (playerMoney > 0) {
            // Deduct 1€ from the player's money for playing the game
            playerMoney--;

            // Generating 3 numbers from 1 to 10
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int num3 = random.nextInt(10) + 1;

            System.out.println("Generated numbers: " + num1 + ", " + num2 + ", " + num3);

            // Checking the input number is 7
            if (num1 == 7 || num2 == 7 || num3 == 7) {
                if (num1 == 7 && num2 == 7 && num3 == 7) {
                    // Player wins 10€ if all three numbers are 7
                    playerMoney += 10;
                    System.out.println("You won 10€!");
                } else if (num1 == 7 || num2 == 7 || num3 == 7) {
                    // Player wins 5€ if two of the numbers are 7
                    playerMoney += 5;
                    System.out.println("You won 5€!");
                } else {
                    // Player wins 3€ if one of the numbers is 7
                    playerMoney += 3;
                    System.out.println("You won 3€!");
                }
            } else {
                System.out.println("You lost.");
            }

            // Print the remaining money
            System.out.println("Remaining money: " + playerMoney + "€");

            // Ask if the player wants to play another round
            if (playerMoney > 0) {
                System.out.print("Play another round? (yes/no): ");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                }
            } else {
                System.out.println("You have no money left. Game over!");
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
