
// Calculator program
import java.util.Scanner;
public class new {
  public static void main(String args[]) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter a number:");
    int num1=input.nextInt();
     System.out.println("Enter a number:");
    int num2=input.nextInt();
     input.nextLine();
     System.out.println("Enter the symbol of the mathematical operation:");
    String symbol=input.nextLine();
    
    switch (symbol)
    {
        case "+":
            int sum=num1+num2;
            System.out.println("Sum of two numbers is: "+ sum);
            break;
         case "-":
            int sub=num1-num2;
            System.out.println("Subraction of two numbers is: "+ sub);
            break;
         case "*":
            int mul=num1*num2;
            System.out.println("multiplication of two numbers is: "+ mul);
            break;
         case "/":
            int div=num1/num2;
            System.out.println("Division of two numbers is: "+ div);
            break;
        default:
            System.out.println("Symbol doesnot matches");
            break;
        
    }
      
      
      
  }
}