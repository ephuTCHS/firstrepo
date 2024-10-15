public class WhileLoopsAlgorithmsDemo {
    public static void main(String[] args) {
//        int number = Integer.parseInt("10"); // converts a string to an integer
//        System.out.println(number > 5);

        int i = 1;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }
        while(true){
            if(i == 11){
                break; // terminates the loop
            }
            else if(i == 5){
                i++;
                continue; // skips the current iteration and goes to the next iteration.
            }
            System.out.println(i);
            i++;
        }
    }
}
