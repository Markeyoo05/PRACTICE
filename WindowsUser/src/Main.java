import java.util.Scanner;

class User {
        private String username;
        private String password;

        public User(String username, String password) {
                this.username = username;
                this.password = password;
            }

        public boolean verifyPassword(String inputPassword) {
                return password.equals(inputPassword);
            }

        public String getUsername() {
                return username;
            }

        // You can add more methods and properties for user management as needed
    }

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to User Account Creation!");
                System.out.print("Enter a username: ");
                String username = scanner.nextLine();
                System.out.print("Enter a password: ");
                String password = scanner.nextLine();

                User newUser = new User(username, password);
                System.out.println("User account created for: " + newUser.getUsername());

                // Simulate user login
                System.out.print("Enter your password to login: ");
                String inputPassword = scanner.nextLine();

                if (newUser.verifyPassword(inputPassword)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Login failed. Incorrect password.");
                    }

                scanner.close();
            }
    }

