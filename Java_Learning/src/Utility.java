import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Utility {

    public String read(String filepath) {
        System.out.println("Got File Path");
        String line = "", temp;
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filepath)));
            System.out.println("Buffered Reader Done");
            System.out.println("Entering While Loop");
            while ((temp = br.readLine()) != null) {
                
                line = line + temp + "\n";
            }
            
            System.out.println("Buffered Reader Done");
            
            System.out.println("While Loop Done");
            br.close();
            System.out.println("Exiting Utility try block");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "File read Error = " + e);
        }
        return line;
    }
}
