// A command-line app where you can add, complete, and delete tasks, saved to a file so they persist between runs.
import java.util.Scanner;


// main page
public class Main{

    public static void main(String[] args) {

        System.out.println("1. View List");
        System.out.println("2. Add to Task");
        System.out.println("3. Complete Task");
        System.out.println("4. Delete Task\n" );

        System.out.println("\nEnter option: ");

        Scanner myScanner = new Scanner(System.in);
        int option = myScanner.nextInt();

        if (option == 1) {
            list.displayList();
            
        }else if (option == 2) {
            System.out.println("You picked 2. Add to Task");
            
        }else if (option == 3) {
            System.out.println("You picked 3. Complete Task");

        }else if (option == 4) {
            System.out.println("You picked 4. Delete Task");

        } else {
            System.out.println("Please enter a valid option");
        }


    }

}


// displays current list
//     ( calls a class to display the saved list )

//      menu options
//      add / complete / delete
//          use command line to decide that to use
//              ( modifies the called list )

// 