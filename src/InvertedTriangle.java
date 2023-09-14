import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            // Add spaces for the left side
            for (int k = 0; k <= (n - i); k++) {
                System.out.print(" ");
            }

            // Add asterisks
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
