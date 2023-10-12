import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the first character: ");
                char char1 = scanner.next().charAt(0);
                System.out.print("Enter the second character: ");
                char char2 = scanner.next().charAt(0);
                System.out.print("Enter the third character: ");
                char char3 = scanner.next().charAt(0);

                // Call the combineChars function to combine the characters
                String combined = combineChars(char1, char2, char3);
                System.out.println("Combined result: " + combined);

            }

        // Function to combine three characters
        public static String combineChars(char char1, char char2, char char3) {
                // Combine the characters and return the result as a string
                return String.valueOf(char1) + String.valueOf(char2) + String.valueOf(char3);
            }
    }

