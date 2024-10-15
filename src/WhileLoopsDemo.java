public class WhileLoopsDemo {
    public static void main(String[] args) {
//        int x = 1;
//        while(x <= 5){
//            System.out.println(x);
//            x += 2;
//        }

//        int number = 10;
//        int total = 0;
//        while(number % 2 == 0){
//            total += number;
//            if(total > 30){
//                number++;
//            }
//            else{
//                number += 2;
//            }
//        }
//        System.out.println(number + " " + total);

        // Q1: Use a while loop to print the sum of even integers
        //     from 0 to 100. (0 + 2 + 4 + 6 + ... + 100)
        int sum = 0;
        int evenNumber = 0;
        while(evenNumber <= 100){
            sum += evenNumber;
//            evenNumber += 2;
            System.out.println(sum);
        }
        System.out.println(sum);

    }
}
