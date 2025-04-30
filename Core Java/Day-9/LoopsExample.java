public class LoopsExample {
    public static void main(String[] args) {
        // For loop example - Print multiplication table of 5
        System.out.println("Multiplication table of 5 using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        
        // While loop example - Count down from 5
        System.out.println("\nCountdown using while loop:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        
        // Do-while loop example - Menu system
        System.out.println("\nDo-while loop example (Menu):");
        int choice = 1;
        do {
            System.out.println("1. Continue");
            System.out.println("0. Exit");
            // In a real program, we would get user input here
            choice--;
        } while (choice > 0);
        
        System.out.println("Program ended!");
    }
}