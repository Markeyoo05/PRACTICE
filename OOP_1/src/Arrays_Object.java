import java.util.Scanner;
public class Arrays_Object
{ 
    private String name;
    private int age;
    Arrays_Object( String name , int age){ 
         this.name = name;
         this.age = age;
    } 
    public void setName(String name){
         this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String [] args){
         Scanner input = new Scanner( System.in);
         System.out.print("How many student you want to input: ");
         int size = input.nextInt();
         input.nextLine();
         
         Arrays_Object[] info = new Arrays_Object[size]; 
         
         for ( int i = 0 ; i < size ;i++){
             Arrays_Object example = new Arrays_Object(" ",0);
             System.out.println("Student Information " + (i +1));
             System.out.println("Enter Name: ");
             example.setName(input.nextLine());
             System.out.println("Enter Age: ");
             example.setAge(input.nextInt());
             input.nextLine();
             
             info[i]=example;
         }
         for ( int i = 0 ; i <size ; i++){
             System.out.println("\ninformation: "+ (i +1)); 
             System.out.println("Name : " +info[i].getName());
             System.out.println("Age: " + info[i].getAge());
         }
    }
}
