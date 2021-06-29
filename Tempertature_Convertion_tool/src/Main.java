
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Converter c = new Converter();
        Utility util = new Utility();
        int k =0;
        do{
            Utility.greetings();        
           int choice = input.nextInt();
           util.choiceExecuter(choice);
           System.out.print("\n                                    Press 0 to return to main menu ");
           k = input.nextInt();
        }while(k==0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
