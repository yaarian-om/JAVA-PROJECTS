
import java.util.Scanner;

public class SimpleCalculator 
{
    Scanner input = new Scanner(System.in);
    
    public void calculate(float num1, char $,float num2)
    {
        
        switch($)
        {
            case '+' :
            {
                System.out.println("Addition = "+(num1+num2));
                break;
            }
            
            case '-' :
            {
                System.out.println("Subtraction = "+(num1-num2));
                break;
            }
            
            case '*' :
            {
                System.out.println("Multiplication = "+(num1*num2));
                break;
            }
            
            case '/' :
            {
                System.out.println("Division = "+(num1/num2));
                break;
            }
            
            case '%' :
            {
                System.out.println("Modulus = "+(num1%num2));
                break;
            }
            
            
            
            
            
            
            
        }
        
        
    }

    
    
    
}
