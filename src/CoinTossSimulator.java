import java.util.Scanner;

public class CoinTossSimulator {
    public static void main(String[] args) {
        // Write a program that simulates flipping a coin a specified number
        // of times. The program asks the user how many times they want to
        // flip the coin. Calculate and print the total number of heads
        // and tails as well as the percentages of landing heads and tails.

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many times do you want to flip the coin? ");
        int flips = keyboard.nextInt();

        int heads = 0;
        int tails = 0;
        int counter = 0;
        while(counter < flips){
            int randomNumber = (int)(Math.random() * 2); // [0, 1]
            if(randomNumber == 0){
                heads++;
            }
            else{
                tails++;
            }
            counter++;
        }

        System.out.println("You flipped heads %s times.".formatted(heads));
        System.out.println("You flipped tails %s times.".formatted(tails));

        double headsPercentage = (double) heads / flips * 100;
        double tailsPercentage = (double) tails / flips * 100;

        System.out.println("Percentage of heads %.2f".formatted(headsPercentage));
        System.out.println("Percentage of tails %.2f".formatted(tailsPercentage));

    }
}
