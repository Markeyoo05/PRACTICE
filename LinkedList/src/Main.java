import java.util.LinkedList;

class Main {
        public static void main(String[] args){

                // create linkedlist
                LinkedList<String> animals = new LinkedList<>();

                // Add elements to LinkedList
                animals.add("Dog");
                animals.add("Cat");
                animals.add("Cow"); 
                animals.set(0, "olaa");
              System.out.println("LinkedList: " + animals);
                
            }
    }
