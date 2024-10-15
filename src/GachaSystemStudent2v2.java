import java.util.Scanner;

public class GachaSystemStudent2v2 {
    public static void main(String[] args) {
        boolean loop = true;
        String menu = "\n(a) - Simulate one pull \n" +
                "(b) - Simulate 10 pulls\n" +
                "(c) - Show results\n" +
                "(d) - Quit\n" +
                "Enter a command: ";
        Scanner keyboard = new Scanner(System.in);
        int commonitem = 0;
        int rareitem = 0;
        int ultratateitem = 0;
        int totalpulls = 0;
        while (loop){
            System.out.print(menu);
            String choice = keyboard.nextLine();

            if (choice.equals("a")){
                System.out.println("simulating one pull:");
                int times = 1;
                int count = 0;
                while (count < times){
                    int chance = (int)(Math.random()* 100) + 1;

                    if (chance <= 89){
                        commonitem += 1;
                        System.out.println("you pulled a common item");
                    }
                    else if (chance <= 99){
                        rareitem += 1;
                        System.out.println("you pulled a rare item");
                    }
                    else{
                        ultratateitem += 1;
                        System.out.println("you pulled an ultra rare item");
                    }
                    count += 1;
                    totalpulls += 1;
                }
            }
            else if (choice.equals("b")){
                System.out.println("simulating 10 pulls:");
                int times = 10;
                int count = 0;
                while (count < times){
                    int chance = (int)(Math.random()* 100) + 1;

                    if (chance <= 89){
                        commonitem += 1;
                        System.out.println("you pulled a common item");
                    }
                    else if (chance <= 99){
                        rareitem += 1;
                        System.out.println("you pulled a rare item");
                    }
                    else{
                        ultratateitem += 1;
                        System.out.println("you pulled an ultra rare item");
                    }
                    count += 1;
                    totalpulls += 1;
                }
            }
            else if (choice.equals("c")){
                System.out.println("total pulls: " + totalpulls);
                System.out.println("ultra rare items: " + ultratateitem + ", rare items: " + rareitem + ", common items: " + commonitem);
            }
            else{
                System.out.println("exiting program");
                loop = false;
            }
        }
    }
}
