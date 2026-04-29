import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class list extends displayList {
    
        
    public static void displayList(){

        File myObj = new File("filename.txt");
        
        

        try(Scanner myScanner = new Scanner(myObj)) {
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();

                System.out.print("\n" + data);
                
            }
        }catch(FileNotFoundException e) {
            System.out.println("There was an error");
            e.printStackTrace();
        }
        
        

        
    }

  
    
}
