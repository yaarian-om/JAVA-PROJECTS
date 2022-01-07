import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Utility {
    
//########################################## Class Attributes ############################################
    private static String USERNAME;
    private static String PASSWORD;
    public static String COACH_NO;
    
// ###################### Setter Getter Methods ########################
    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
//########################################### Class Methods ###########################################
    public void infoWriter(String line,String fileName){
        //password, username, name, number of people, seat selection, date, start,end cost
        try {
            FileWriter myWriter = new FileWriter(fileName,true);
            myWriter.write(line);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public String getPassword(String username) throws FileNotFoundException{
        
        String got_The_Full_info="";
        Scanner input = new Scanner(new FileInputStream("login.txt"));
        while(input.hasNextLine()) {
           String line = input.nextLine();
           //System.out.println(line);
           if(line.contains(username)) {
               //System.out.println(line);
              got_The_Full_info = line;
           }
        }
        
        String word[] = got_The_Full_info.split(",");
        //String username = word[0]; 
        String password = word[1];
        return password;
    }
    
    public void clearFile(String filepath){
        try {
            FileWriter myWriter = new FileWriter(filepath);
            myWriter.write("");
            myWriter.close();
            System.out.println("Successfully Clear the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    
    public String getRandomTrain(){
        String[] TRAIN_NAME = {"Suborno Express","Mohanagar Provati","Ekota Express","Tista Express"
        ,"Parabat Express","Upakul Express","Karatoya Express","Kapotaksha Express","Jayantika Express"
        ,"Paharika Express","Mohanagar Express","Udayan Express","Sundarban Express","Rupsha Express"
        ,"Meghna Express","Barendra Express","Titumir Express","Agnibina Express","Egarosindhur Provati"
        ,"Upaban Express","Turna Express","Brahmaputra Express","Jamuna Express","Simanta Express"
        ,"Egarosindhur Godhuli","Lalmoni Express","Silkcity Express","Madhumati Express","Drutojan Express"
        ,"Padma Express","Sagardari Express","Chitra Express","Nilsagar Express","Dolonchapa Express"
        ,"Dhumketu Express","Rangpur Express","Kalni Express","Sirajganj Express","Haor Express","Dhalarchar Express"
        ,"Kishoreganj Express","Tungipara Express","Bijoy Express","Shonar Bangla Express"
        ,"Mohanganj Express","Banalata Express","Panchagarh Express","Benapole Express","Kurigram Express","Jamalpur Express"
        ,"Chattala Express","Banglabandha Express"};
        
        int randomIndex = (int)(Math.random() * 51);
        return TRAIN_NAME[randomIndex];
    }
    
    public String[] getSeatNumbers(int passengerNumber){
        System.out.println("Passenger Number = "+passengerNumber);
        String[] All_Seats = new String[passengerNumber];
        int randomIndex = ((int)(Math.random() * 25)+65);
        char value = (char) randomIndex;
        COACH_NO = String.valueOf(value);
        int seatNo = ((int)(Math.random() * 46)+1);
        All_Seats[0] = String.valueOf(value)+String.valueOf(seatNo)+ "";
        for(int i=1;i<passengerNumber;i++){
            System.out.println("Inside For Loop");
            seatNo++;
            All_Seats[i] = String.valueOf(value)+String.valueOf(seatNo)+ "";
            System.out.println("Seat = "+All_Seats[i]);
            System.out.println("Storing");
        }
        System.out.println("Replying the req");
        return All_Seats;
    }
    
    public int[] getSeatHilghlighterNumber(String[] stringArray){
        System.out.println("Got the highlighter req");
        int[] HilghlighterNumber_Array = new int[stringArray.length];
        for(int i=0;i<stringArray.length;i++){
            System.out.println(i);
            HilghlighterNumber_Array[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println("Replying highlighter req");
        return HilghlighterNumber_Array;
    }
    
    public String[] getUserInfo(String username) throws FileNotFoundException{
        
        String got_The_Full_info="";
        Scanner input = new Scanner(new FileInputStream("login.txt"));
        while(input.hasNextLine()) {
           String line = input.nextLine();
           //System.out.println(line);
           if(line.contains(username)) {
               //System.out.println(line);
              got_The_Full_info = line;
           }
        }
        
        String word[] = null;
                word = got_The_Full_info.split(",");
        //String username = word[0]; 
        String password = word[1];
        return word;
    }
    
    
}
