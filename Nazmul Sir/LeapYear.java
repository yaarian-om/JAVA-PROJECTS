
import java.util.Scanner;

class LeapYear
{	
	Scanner input = new Scanner(System.in);

	LeapYear() {}

	public void check(int year)
	{
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println(year+" is a Leap year !");
		}
		else
		{
			System.out.println(year+" is not a Leap year !");
		}
	
	}
	

	
}
