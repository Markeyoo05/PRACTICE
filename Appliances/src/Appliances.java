/**
      @The Siblings 
 @ Authors : Kfritz R. Lima
                    Rolando R. Lima Jr.
*/

class Appliances{
        private String name;
        private double price;
        private String category;
       
         //default constructor
        Appliances(){
                System.out.println("Selling Appliances Information:\n");
        }
        // Constructor
        public Appliances(String name, double price, String category) {
                this.name = name;
                this.price = price;
                this.category = category;
            }

        // Setters for name
        public void setName(String name) {
                this.name = name;
            }
        // Setters for price
        public void setPrice(double price) {
                this.price = price;
            }
        // Setters for category
        public void setCategory(String category) {
                this.category = category;
            }

        // Getters paras name
        public String getName() {
                return name;
            }
        // Getters paras price
        public double getPrice() {
                return price;
            }
        // Getters paras category
        public String getCategory() {
                return category;
            }
    }
