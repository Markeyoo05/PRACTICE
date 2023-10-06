import java.util.*;

public class Main
{
	public static void main(String[] args)
	{ 
        Scanner input = new Scanner(System.in);
		Information info = new Information(" ", 0);
        System.out.print("Enter name:  ");
        info.setName(input.nextLine()); 
        System.out.print("Enter age:  ");
        info.setAge(input.nextInt()); 
        
        System.out.println(info.getName());
        System.out.println(info.getAge());
        
        
	}
}
