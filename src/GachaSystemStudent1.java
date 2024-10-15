import java.util.Scanner;
public class GachaSystemStudent1 {
    static int commons = 0;
    static int rares = 0;
    static int ultras = 0;

    public static void main(String[] args) {
        System.out.println("(a) - Simulate one pull \n" +
                "(b) - Simulate 10 pulls\n" +
                "(c) - Show results\n" +
                "(d) - Quit");

        Scanner keyboard = new Scanner(System.in);
        boolean inGame = true;
        int totalSpins = 0;
        while (inGame == true){
            String playerInput = keyboard.nextLine();
            if (playerInput.equals("a")){
                gachaPull(1);
                totalSpins = totalSpins + 1;
            }
            if (playerInput.equals("b")){
                gachaPull(10);
                totalSpins = totalSpins + 10;
            }
            if (playerInput.equals("c")){
               System.out.println(totalSpins);
               System.out.println("Commons: " + commons);
                System.out.println("Rares: " + rares);
                System.out.println("Ultra-Rares: " + ultras);
            }
            if (playerInput.equals("d")){
                System.out.println("Thanks for playing!");
                inGame = false;
            }
        }

    }

    public static void gachaPull(int numberSpins){
        int counter = 0;
        while (counter < numberSpins){
            int gacha = (int)(Math.random()*100);
            if (gacha <= 88){
                System.out.println("Common");
                commons++;
            }
            else if (gacha <= 98){
                System.out.println("Rare");
                rares++;
            }
            else{
                System.out.println("Ultra Rare");
                ultras++;
            }
            counter++;
        }

    }
}
