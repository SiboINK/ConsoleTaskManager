import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class addList extends displayList{

    public static void main(String[] args) {

        System.out.println("Add a task to your list");

        

        try (FileWriter myFile = new FileWriter("filename.txt", true)){

            Scanner myScanner = new Scanner(System.in);
            String task = myScanner.nextLine();
            myFile.write("\n" + task);



        } catch (IOException e) {
            
            System.out.println("There was an error");
            e.printStackTrace();
        }
    }


    
}
