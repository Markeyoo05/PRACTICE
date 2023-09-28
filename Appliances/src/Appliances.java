class Appliances{
        private String name;
        private double price;
        private String category;
       
         
        Appliances(){
                System.out.println("Selling Appliances Information:\n");
        }
        // Constructor
        public Appliances(String name, double price, String category) {
                this.name = name;
                this.price = price;
                this.category = category;
            }

        // Setters
        public void setName(String name) {
                this.name = name;
            }

        public void setPrice(double price) {
                this.price = price;
            }

        public void setCategory(String category) {
                this.category = category;
            }

        // Getters
        public String getName() {
                return name;
            }

        public double getPrice() {
                return price;
            }

        public String getCategory() {
                return category;
            }
    }
