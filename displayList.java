import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class displayList {
    public static void main(String[] args) {
        
   

    File myObj = new File("filename.txt");

    try(Scanner myScanner = new Scanner(myObj)) {
        while (myScanner.hasNextLine()) {
            String data = myScanner.nextLine();

            System.out.print(data);
            
        }
    }catch(FileNotFoundException e) {
        System.out.println("There was an error");
        e.printStackTrace();
    }

  }
    
}
