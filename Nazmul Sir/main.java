
import java.util.Scanner;


public class main
{
	public static void main(String[] args)
	{
		
		
	Scanner input = new Scanner(System.in);

do{
		System.out.println("1. Developper Info");
	System.out.println("2. Leap Year Checking");
	System.out.println("3. Swap Numbers");
	System.out.println("4. Electricity Bill");
	System.out.println("5. Simple Calculator");
	System.out.println("6. Area Calculator");
	System.out.println("7. CGPA Percentage");
	System.out.println("8. Vowel or Consonant Checking");
        System.out.println("\n\n");
	System.out.print(" Enter Your Choice : ");
        
	
	int x1 = input.nextInt();
	System.out.println("\n\n");
	switch(x1)
	{
		case 1:
		{
			// Show Details

			ShowDetails sd = new ShowDetails();	
			break;
			
			
		}
		case 2:
		{
			// Leap Year
			//Scanner input = new Scanner(System.in);
			LeapYear ly = new LeapYear();
			System.out.print("Enter Year : ");
	                int year = input.nextInt();		
			ly.check(year);
                        break;
			
		}
		case 3:
		{
			// Swap
			//Scanner input = new Scanner(System.in);
			
			
			System.out.print("Enter 1st Number : ");
                        int x;
                         x = input.nextInt();
	
	                System.out.print("Enter 2nd Number : ");
		        int y = input.nextInt();
			int z;
			Swap s = new Swap(x,y);
			s.swapNow(x,y);
                        break;
			
		}
		case 4:
		{
			//Scanner input = new Scanner(System.in);
			ElectricityBill e = new ElectricityBill();
			float watts_Per_Hour,per_Unit_Rate;
		    int day;
			System.out.print("Enter watts Per Hour : ");
		    watts_Per_Hour = input.nextFloat();
		
		    System.out.print("Enter per Unit Rate : ");
		    per_Unit_Rate = input.nextFloat();
		
		    System.out.print("Enter Days : ");
		    day = input.nextInt();
			
			e.calculate(watts_Per_Hour,per_Unit_Rate,day);
                        break;
	
		} 
		case 5:
		{
			// Simple Calculator
			
                    SimpleCalculator sc = new SimpleCalculator();
                    System.out.print("Enter Inputs : ");
                    float num1 = input.nextFloat();
                    char $ = input.next().charAt(0);
                    float num2 = input.nextFloat();
                    sc.calculate(num1, $, num2);
                    break;
			
		}
                
		case 6:
		{
			//Area 
			
                    System.out.println("1. Rectangle");
                    System.out.println("2. Square");
                    System.out.println("3. Trapizium");
                    System.out.println("4. Triangle");
                    System.out.println("5. Circle\n");
                    System.out.print("Enter Choice : ");
                    int x2 = input.nextInt();
                    Area a = new Area();
                    a.Areacalc(x2);
			
		       break;	
		}
                
		case 7:
		{
			// CGPA Percentage
                        CGPA cg = new CGPA(); 
			System.out.print("Enter Marks : ");
                        float d = input.nextFloat();
                        cg.cgCount(d);
                        break;
			
		}
                
		case 8:
		{
			//Vowel or Consonant Checking
                    VowelChecking vc = new VowelChecking();
		    System.out.print("Enter an Alphabet : ");
                    char $ = input.next().charAt(0);
                        vc.volCheck($);
			
			
		} 
			
		
	}
	System.out.print("");
	System.out.print("");
	System.out.print("");
	System.out.print("");
	
		
	}while(true);

}

	

	
}
