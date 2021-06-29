
import java.util.Scanner;

public class Area 
{
    Scanner input = new Scanner(System.in);
    
    public void Areacalc(int x2)
    {
        
        switch(x2)
        {
            case 1:
            {
                // Rectangle
                System.out.print("Enter Length : ");
                float a = input.nextFloat();
                System.out.print("Enter Width : ");
                float b = input.nextFloat();
                System.out.println("Area = "+(a*b));  
                break;
            }
            case 2:
            {
                // Square
                System.out.print("Enter Length : ");
                float a = input.nextFloat();
                System.out.println("Area = "+(a*a));
                break;
            }
            case 3:
            {
                // Trapizium
                System.out.print("Enter Similar arm 1 : ");
                float a = input.nextFloat();
                System.out.print("Enter Similar arm 2 : ");
                float b = input.nextFloat();
                System.out.print("Enter Height : ");
                float h = input.nextFloat();
                System.out.println("Area = "+(0.5*(a+b)*h));
                break;
            }
            case 4:
            {
                // Triangle
                System.out.println("1. Base and Height");
                System.out.println("2. 3 Arms\n");
                System.out.print("Enter Choice : ");
                int x = input.nextInt();
                System.out.println("\n");
                
                switch(x)
                {
                    case 1:
                    {
                        /// 1 arm 1 base
                        System.out.print("Enter Base : ");
                        float b = input.nextFloat();
                        System.out.print("Enter Height : ");
                        float h = input.nextFloat();
                        System.out.println("Area = "+(0.5*b*h));
                        break;
                        
                    }
                    case 2:
                    {
                        /// 3 Arms
                        System.out.print("Enter Arm a : ");
                        float a = input.nextFloat();
                        System.out.print("Enter Arm b : ");
                        float b = input.nextFloat();
                        System.out.print("Enter Arm b : ");
                        float c = input.nextFloat();
                        float s = (float) ((a+b+c)/2.0);
                        System.out.println("Area = "+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
                        break;
                    }
                    
                }
                
                break;
            }
            case 5:
            {
                /// Circle
                System.out.print("Enter Redius : ");
                float r = input.nextFloat();
                System.out.println("Area = "+(3.1416*r*r));
                
                
                break;
            }
                
            
            
            
        }
        
        
    }
    
    
    

    
    
    
    
}
