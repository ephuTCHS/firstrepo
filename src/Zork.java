import java.util.Scanner;
public class Zork {

    public static void kitchen(){
        System.out.println("You're in the kitchen.");
        Scanner keyboard = new Scanner(System.in);
        while(true){
            String userInput = keyboard.nextLine();
            if(userInput.equals("west")){
                livingRoom();
            }
            else{
                System.out.println("Not a valid input.");
            }
        }
    }

    public static void livingRoom(){
        System.out.println("You're in the living room.");
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            String userInput = keyboard.nextLine();
            if(userInput.equals("east")){
                kitchen();
            }
            else{
                System.out.println("Not a valid input.");
            }
        }
    }
    public static void main(String[] args) {
        kitchen();
    }
}
