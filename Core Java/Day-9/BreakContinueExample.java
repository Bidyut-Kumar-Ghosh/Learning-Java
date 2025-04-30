public class BreakContinueExample {
    public static void main(String[] args) {
        // Break example - Find first even number divisible by 7
        System.out.println("Break example - Finding first even number divisible by 7:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                System.out.println("Found number: " + i);
                break;  // Exit loop once number is found
            }
        }
        
        // Continue example - Print odd numbers from 1 to 10
        System.out.println("\nContinue example - Printing odd numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.println(i);
        }
        
        // Nested loops with break
        System.out.println("\nNested loops with break example:");
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j > 4) {
                    System.out.println("Breaking at i=" + i + ", j=" + j);
                    break outerLoop;  // Break out of both loops
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}