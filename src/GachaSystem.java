import java.util.Scanner;

public class GachaSystem {
    static int totalPulls = 0;

    public static void main(String[] args) {
        // Write a program that simulates a gacha system, a popular game mechanic where players can pull random items with varying rarity levels.
        // Each pull results in one of three types of items: "Ultra Rare", "Rare", or "Common".
        // The probabilities are as follows: 1% Ultra Rare, 10% Rare, and 89% Common.

        // The program displays the following menu with 4 options:
        // (a) - pull once
        // (b) - pull 10 times
        // (c) - show results
        // (d) - quit

        // When the user selects option (a), the program simulates a single random pull and shows the result.
        // When the user selects option (b), the program simulates 10 random pulls and shows each result.
        // When the user selects option (c), the program displays the total number of pulls and the counts of each rarity level pulled.
        // When the user selects option (d), the program ends.

        // The user can continuously choose options (a), (b), and (c). If the user chooses option (d), the program quits.

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the gacha simulator!");
        System.out.println("(a) - Simulate one pull");
        System.out.println("(b) - Simulate 10 pulls");
        System.out.println("(c) - Show results");
        System.out.println("(d) - Quit");
        System.out.print("Enter a command: ");
        String userInput = keyboard.nextLine();

        // Initialize variables for each rarity level
        int ultraRareCount = 0;
        int rareCount = 0;
        int commonCount = 0;

        while (!userInput.equals("d")) {
            int pulls = 0;
            if(userInput.equals("a")){
                System.out.println("Simulating 1 pull: ");
                pulls = 1;
            }
            else if(userInput.equals("b")){
                System.out.println("Simulating 10 pulls: ");
                pulls = 10;
            }
            else if(userInput.equals("c")){
                System.out.println("Total Pulls: " + totalPulls);
                System.out.println("Ultra Rare items: %s, Rare Items: %s, Common items: %s.".formatted(ultraRareCount, rareCount, commonCount));
            }
            else{
                System.out.println("Invalid input.");
            }

            while(pulls > 0){
                int randomValue = (int) (Math.random() * 100) + 1; // [1, 100]
                if (randomValue == 1) { // 1% Ultra Rare
                    System.out.println("You pulled an ULTRA RARE ITEM!");
                    ultraRareCount++;
                }
                else if (randomValue <= 11) { // 10% Rare [2, 11], 10 numbers
                    System.out.println("You pulled a rare item!");
                    rareCount++;
                }
                else { // 89%  Common [12, 100]
                    System.out.println("You pulled a common item");
                    commonCount++;
                }
                pulls--;
                totalPulls++;
            }
            System.out.print("\nEnter a command: ");
            userInput = keyboard.nextLine();
        }

        System.out.println("Exiting program");
    }
}
