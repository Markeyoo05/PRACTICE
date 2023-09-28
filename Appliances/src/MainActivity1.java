public class MainActivity1 {
        public static void main(String[] args) {
                // Create three Appliance objects
                Appliances appliance1 = new Appliances(" ", 0.0, " ");
                Appliances appliance2 = new Appliances(" ", 0.0, " ");
                Appliances appliance3 = new Appliances(" ", 0.0, " ");
                
                appliance1.setName(" Refrigerator "); 
                appliance1.setPrice(1500);
                appliance1.setCategory(" Kitchen Appliances"); 
                
                appliance2.setName(" Washing Machine"); 
                appliance2.setPrice(2000);
                appliance2.setCategory(" Laundry Appliances"); 
                
                appliance3.setName(" Microwave Oven "); 
                appliance3.setPrice(3000);
                appliance3.setCategory(" Kitchen Appliances"); 
                // Print information about selling appliances
                Appliances appliance = new Appliances();
                System.out.println("Appliance 1:");
                System.out.println("Name: " + appliance1.getName());
                System.out.println("Price: " + appliance1.getPrice());
                System.out.println("Category: " + appliance1.getCategory());
                System.out.println();

                System.out.println("Appliance 2:");
                System.out.println("Name: " + appliance2.getName());
                System.out.println("Price: " + appliance2.getPrice());
                System.out.println("Category: " + appliance2.getCategory());
                System.out.println();

                System.out.println("Appliance 3:");
                System.out.println("Name: " + appliance3.getName());
                System.out.println("Price:  " + appliance3.getPrice());
                System.out.println("Category: " + appliance3.getCategory());
            }
    }
