
import java.util.Scanner;

class ElectricityBill
{
		Scanner input = new Scanner(System.in);

		public ElectricityBill() {}

	       public void calculate(float watts_Per_Hour,float per_Unit_Rate,int day)
	       {
		System.out.println("Electricity Bill = "+(watts_Per_Hour*per_Unit_Rate*day));
	       }

}
