import java.util.*;

public class Main
{ 
   private String name;
   private int age;
    Main(String name,  int age){
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
	public static void main(String[] args)
	{  
       Scanner in = new Scanner(System.in);
        Main info = new Main(" ", 0);
		 
        
     System.out.print("Enter name: ");
        info.setName(in.nextLine());
     System.out.print("Enter age: "); 
       info.setAge(in.nextInt());
       
       System.out.println("Information ");
       System.out.println("Name: " + info.getName());
       System.out.println("Age: " + info.getAge());
	}
}
