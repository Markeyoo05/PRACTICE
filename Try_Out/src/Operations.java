public class Operations
{   
     private int a,b ;
     
     public void setAddition(int a , int b ){ 
               this.a =a;
               this.b =b;
               int sum = a + b;
               System.out.println( " Sum of "+ a + " and "+ b + " is "+sum);
     } 
      public void setSubtraction ( int a , int b){
              this.a =a;
              this.b =b;
               int subtract = a - b;
              System.out.println( " Difference of "+ a + " and "+ b + " is "+subtract);
               
      }
        public void setmultiplication ( int a , int b){
                this.a =a;
                this.b =b;
                int mul = a  * b;
                System.out.println( " Product of "+ a + " and "+ b + " is "+mul);
                }
        public void setdivision( int a , int b){
                this.a =a;
                this.b =b;
                int div= a / b;
                System.out.println( " Quotient of "+ a + " and "+ b + " is "+div);
                }
}
