import java.util.Scanner;

public class WhileLoopsAlgorithmsKEY {
    public static void algorithm1() {
        // Write a method that accepts one integer at a time from the user.
        // The method continuously takes input from the user and counts how many positive and negative numbers are entered.
        // It keeps looping until the user enters q, at which point it displays the total number of positive and negative numbers and then terminates.
        Scanner keyboard = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;

        System.out.print("Enter any integer. Enter q to quit: ");
        String userInput = keyboard.nextLine();

        while(!userInput.equals("q")){
            int number = Integer.parseInt(userInput);
            if(number > 0){
                positives++;
            }
            else if(number < 0){
                negatives++;
            }
            System.out.print("Enter any integer. Enter q to quit: ");
            userInput = keyboard.nextLine();
        }

//        while(true){
//            System.out.print("Enter any integer. Enter q to quit: ");
//            String userInput = keyboard.nextLine();
//            if(userInput.equals("quit")){
//                break;
//            }
//            int number = Integer.parseInt(userInput);
//            if(number > 0){
//                positives++;
//            }
//            else if(number < 0){
//                negatives++;
//            }
//            else if(number == 0){
//                break;
//            }
//        }
        System.out.println("Positive integers: " + positives);
        System.out.println("Negative integers: " + negatives);
    }

    public static void algorithm2() {
        // Write a method that accepts one integer at a time from the user.
        // The method continuously takes input from the user and keeps track of the sum and average of the integers.
        // When the user enters q, the program prints the sum and average of the numbers and exits the program.
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.print("Enter any integer. Enter q to quit: ");
            String userInput = keyboard.nextLine();
            if(userInput.equals("q")){
                break;
            }
            int number = Integer.parseInt(userInput);
            sum += number;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum/count);
    }

    public static void algorithm3() {
        // Write a method that accepts one integer at a time from the user.
        // The method continuously takes input from the user and keeps track of the highest integer entered.
        // When the user inputs q, the method displays the highest integer and then terminates.
        // Consider using Integer.MIN_VALUE, which returns the smallest number an integer can store.
        // You can assume that the user will not start by typing q.
        Scanner keyboard = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.print("Enter any integer. Enter q to quit: ");
            String userInput = keyboard.nextLine();
            if(userInput.equals("q")){
                System.out.println("Maximum integer: " + max);
                break;
            }
            int number = Integer.parseInt(userInput);
            if(number > max){
                max = number;
            }
        }
    }

    public static void algorithm4() {
        // Write a method that asks the user to enter a positive integer and prints the sum of the individual digits.
        // You may assume that the user will enter a positive integer.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = keyboard.nextInt();
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }

    public static void algorithm5() {
        // The Fibonacci Sequence is a series of numbers where each term is the sum of the two preceding terms.
        // The sequence begins as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, ...
        // Write a method that prompts the user to enter a positive integer, specifying the number of terms from the Fibonacci sequence they wish to generate.
        // Then print the desired number of terms from the Fibonacci Sequence.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many terms from the Fibonacci Sequence would you like to see? ");
        int numberOfTerms = keyboard.nextInt();
        int n1 = 0; // first term
        int n2 = 1; // second term;
        int sum;
        if(numberOfTerms == 1){
            System.out.println(n1);
        }
        else if(numberOfTerms == 2){
            System.out.print(n1 + " " + n2);
        }
        else{ // 3 or more terms
            System.out.print(n1 + " " + n2 + " ");
            while(numberOfTerms > 2){
                sum = n1 + n2;
                System.out.print(sum + " ");
                n1 = n2;
                n2 = sum;
                numberOfTerms--;
            }
        }

    }

    public static void main(String[] args) {
        algorithm1();
//            algorithm2();
//            algorithm3();
//            algorithm4();
//            algorithm5();
    }
}