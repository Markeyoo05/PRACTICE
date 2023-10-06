import java.util.*;

public class MathOperations
{
	public static void main(String[] args)
	{      
       //int choice ;
  do {
		System.out.println(" [ 1 ] Addition "); 
        System.out.println(" [ 2 ] Subtraction "); 
        System.out.println(" [ 3 ] Multiplication "); 
        System.out.println(" [ 4 ] Division ");  
        System.out.println(" [ 0 ] Exit "); 
        
        Operations operation = new Operations();
		Scanner input = new Scanner(System.in);
        System.out.print("Input Operation: ");
         int choice  = input.nextInt();
		 
         switch(choice) {
            case 1: 
                 System.out.print(" Input first number: "); 
                 int a = input.nextInt();
                 System.out.print(" Input first number: "); 
                  int b = input.nextInt();  
                  operation.setAddition(a,b);
                  break;
            
            case 2 : 
                System.out.print(" Input first number: "); 
                int a1= input.nextInt();
                System.out.print(" Input first number: "); 
                int b1 = input.nextInt();  
                operation.setSubtraction(a1,b1);
                 break;
            
              case 3:
                System.out.print(" Input first number: "); 
                int a2= input.nextInt();
                System.out.print(" Input first number: "); 
                int b2 = input.nextInt();  
                operation.setmultiplication(a2,b2);
                break;
		     
            case 4 :
                System.out.print(" Input first number: "); 
                int a3 = input.nextInt();
                System.out.print(" Input first number: "); 
                int b3  = input.nextInt();  
                operation.setdivision(a3,b3); 
                break;
             default:
                  System.out.println("Program terminated, Goodbye! ");
                
             }
             System.out.print("Continue [1 - yes , 0 - no ? ] ");
             int input1 = input.nextInt();
             
             if (input1 !=1){ 
             break;
                 }
             
         }while (true);
             System.out.println("Program terminated , Goodbye! ");
        }
}
