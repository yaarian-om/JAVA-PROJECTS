import java.util.Calendar;

public class Utility {

    public static void greetings(){
        String months[] = { "Jan",  "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Calendar calendar = Calendar.getInstance();


        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project ***               ");
        System.out.println("                       *** Spring_20_21_OOP1_H_G02 ***            ");
        System.out.println("Project completed by:-");
        System.out.println("Name                            ID");
        System.out.println("Fatima Zohra Aneen              20-43649-2");
        System.out.println("Marina Afroj                    20-44121-2");
        System.out.println("MD Sabit Hasan                  20-43703-2");
        System.out.println("Tawaz Rahman                    20-43961-2");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

    }




}
