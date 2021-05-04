package TokimonPackage;

import java.util.Scanner;

/**
 * Launches application.
 */

public class Main {

    public static void main(String[] args) {
        TokimonManager manager = new TokimonManager();
        Scanner in = new Scanner(System.in);
        int enteredNumber;
        while(true) {
            manager.displayMainMenu();
            System.out.print("Enter a number: ");
            enteredNumber = in.nextInt();
            System.out.println("");
            while (enteredNumber < 1 || enteredNumber > 6 ) {
                System.out.print("Enter a valid number: ");
                System.out.println("");
                enteredNumber = in.nextInt();
            }
            if(enteredNumber == 1) {
                manager.displayAllTokis();
                System.out.println("");
            }
            if(enteredNumber == 2) {
                manager.addNewToki();
                System.out.println("");
            }
            if(enteredNumber == 3) {
                manager.deleteToki();
                System.out.println("");
            }
            if(enteredNumber == 4) {
                manager.alterToki();
                System.out.println("");
            }
            if(enteredNumber == 5) {
                manager.displayToString();
                System.out.println("");
            }
            if(enteredNumber == 6) {
                System.out.println("BYE");
                break;
            }
        }
    }
}
