
import java.util.Scanner;

class Swap
{
	Scanner input = new Scanner(System.in);

	
	public Swap(int x, int y)
	{

	System.out.println("Before Swap : ");
	System.out.println("X = "+x);
	System.out.println("Y = "+y);
	
	}
	
	public void swapNow(int x,int y)
	{
            int z;
            z = x;
            x = y;
            y = z;

	
	
            System.out.println("After Swap : ");
            System.out.println("X = "+x);
            System.out.println("Y = "+y);

		
	}
	
	
	
}