
import java.util.Scanner;


public class Utility {
    Scanner input = new Scanner(System.in);
    Converter c = new Converter();
    public static void greetings(){
        System.out.println("                            ------------------------------------------------");
        System.out.println("                           |      WELCOME TO TEMPERATURE CONVERTION TOOL    |");
        System.out.println("                            ------------------------------------------------");
        System.out.println("                                        1. Celcius to Farhenheit       ");
        System.out.println("                                        2. Celcius to Kelvin           ");
        System.out.println("                                        3. Farhenheit to Celcius       ");
        System.out.println("                                        4. Kelvin to Celcius           ");
        System.out.println("                                        5. Farhenheit to Kelvin        ");
        System.out.println("                                        6. Kelvin to Farhenheit        ");
        System.out.print("\n                                        Enter Your Choice ==> ");
    }
    
    
    public static void cToF(){
        System.out.println("                            ------------------------------------------------");
        System.out.println("                           |               CELSIUS TO FARHENHEIT            |");
        System.out.println("                            ------------------------------------------------");
        System.out.print("\n                                    Enter Temperature(in Celcius) : ");
    }
    
    public static void cToK(){
        System.out.println("                            ------------------------------------------------");
        System.out.println("                           |                 CELSIUS TO KELVIN              |");
        System.out.println("                            ------------------------------------------------");
        System.out.print("\n                                    Enter Temperature(in Celcius) : ");
    }
    
    public static void fToC(){
        System.out.println("                            ------------------------------------------------");
        System.out.println("                           |               FARHENHEIT TO CELCIUS            |");
        System.out.println("                            ------------------------------------------------");
        System.out.print("\n                                    Enter Temperature(in Farhenheit) : ");
    }
    
    public static void kToC(){
        System.out.println("                            ------------------------------------------------");
        System.out.println("                           |                 KELVIN TO CELCIUS             |");
        System.out.println("                            ------------------------------------------------");
        System.out.print("\n                                    Enter Temperature(in Kelvin) : ");
    }
    
    public static void fToK(){
        System.out.println("                            ------------------------------------------------");
        System.out.println("                           |               FAHRENHEIT TO KELVIN            |");
        System.out.println("                            ------------------------------------------------");
        System.out.print("\n                                    Enter Temperature(in Farhenheit) : ");
    }
    
    public static void kToF(){
        System.out.println("                            ------------------------------------------------");
        System.out.println("                           |                KELVIN TO FARHENHEIT            |");
        System.out.println("                            ------------------------------------------------");
        System.out.print("\n                                    Enter Temperature(in Kelvin) : ");
    }
    
    
    public void choiceExecuter(int choice){
        switch(choice){
            case 1:{
                cToF();
                double  temperature = input.nextDouble();
                double convertedTemp =  c.celciusToFarenheit(temperature);
                System.out.println("                                    Temperature in Farhenheit = "+convertedTemp);
                break;
            }
            case 2:{
                cToK();
                double  temperature = input.nextDouble();
                double convertedTemp =  c.celciusToKelvin(temperature);
                System.out.println("                                    Temperature in Kelvin = "+convertedTemp);
                break;
            }
            case 3:{
                fToC();
                double  temperature = input.nextDouble();
                double convertedTemp =  c.farenheitToCelcius(temperature);
                System.out.println("                                    Temperature in Celcius = "+convertedTemp);
                break;
            }
            case 4:{
                kToC();
                double  temperature = input.nextDouble();
                double convertedTemp =  c.kelvinToCelcius(temperature);
                System.out.println("                                    Temperature in Celcius = "+convertedTemp);
                break;
            }
            case 5:{
                fToK();
                double  temperature = input.nextDouble();
                double convertedTemp =  c.farenheitToKelvin(temperature);
                System.out.println("                                    Temperature in Kelvin = "+convertedTemp);
                break;
            }
            case 6:{
                kToF();
                double  temperature = input.nextDouble();
                double convertedTemp =  c.kelvinToFarenheit(temperature);
                System.out.println("                                    Temperature in Farhenheit = "+convertedTemp);
                break;
            }
            default:{
                System.out.println("                                      Please Enter a valid input");
            }
        }
    }
    
    
    
}
