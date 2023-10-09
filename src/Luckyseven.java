import java.util.Random;

public class Luckyseven {
    public static void main(String[] args) {
        // Creating a random number for the game
        Random random = new Random();

        // Generating 3 numbers from 1 to 10
        int number1 = random.nextInt(10) + 1;
        int number2 = random.nextInt(10) + 1;
        int number3 = random.nextInt(10) + 1;

        // Printing the random numbers
        System.out.println("Random numbers: " + number1 + ", " + number2 + ", " + number3);

        // Checking the input number is 7
        if (number1 == 7 || number2 == 7 || number3 == 7) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }
    }
}
