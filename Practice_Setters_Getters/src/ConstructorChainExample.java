import java.util.Scanner;

public class ConstructorChainExample {

        private String name,dep;
        private int age;

        // Default constructor
        public ConstructorChainExample(String name, int age) {
                // Call the parameterized constructor with default values
                this(name,age,"wala");
            }

        // Parameterized constructor
        public ConstructorChainExample(String name, int age, String dep) {
                this.name = name;
                this.age = age;
                this.dep =dep;
            }

        public void displayInfo() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Name: " + dep);
            }

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your name: ");
                String userName = scanner.nextLine();

                System.out.print("Enter your age: ");
                int userAge = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter your Nick: ");
                String dep= scanner.nextLine();
                ConstructorChainExample person = new ConstructorChainExample(userName, userAge);
                // Create an instance using the parameterized constructor with user input
                ConstructorChainExample person1= new ConstructorChainExample(userName, userAge, dep);

                // Display the information for the user
                System.out.println("\nUser Information:");
                person.displayInfo();

                scanner.close();
            }
    }

