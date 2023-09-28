import java.util.Scanner;
public class MainActivity2 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("How many appliances do you want to input?: ");
                int numberOfAppliances = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                // Create an array to store Appliance objects
                Appliances[] appliances = new Appliances[numberOfAppliances];

                // Input appliance information in a loop
                for (int i = 0; i < numberOfAppliances; i++) { 
                        // Create an Appliance object and add it to the array
                       Appliances appl = new Appliances("",0.0,"");
                        System.out.println("Enter information for Appliance #" + (i + 1) + ":");
                        System.out.print("Name: ");
                        appl.setName(scanner.nextLine());
                        System.out.print("Price: ");
                        appl.setPrice(scanner.nextInt());
                        scanner.nextLine(); // add ka in.ani para newline purpose ani niya para maka input ang user  sa ubos ani
                        System.out.print("Category: ");
                        appl.setCategory(scanner.nextLine());

                  
                        appliances[i] = appl;
                    }

                // Print information about selling appliances
                Appliances appliance = new Appliances();
                for (int i = 0; i < numberOfAppliances; i++) {
                        System.out.println("Appliance " + (i + 1) + ":");
                        System.out.println("Name: " + appliances[i].getName());
                        System.out.println("Price: " + appliances[i].getPrice());
                        System.out.println("Category: " + appliances[i].getCategory());
                        System.out.println();
                    }
            }
    }
