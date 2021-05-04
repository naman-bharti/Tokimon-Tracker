package TokimonPackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TokimonManager class creates creates an array of tokimons to use it in several functions inside the class.
 * The class contains functions for displaying Main Menu, all Tokimons, as well as adding and removing tokimons
 * from the tokimons array.
 */

public class TokimonManager {
    private ArrayList <Tokimon> tokimons = new ArrayList<>();
    private int size;

    public void displayMainMenu() {
        System.out.println("Main Menu");
        System.out.println("1. List Tokimons");
        System.out.println("2. Add a new Tokimon");
        System.out.println("3. Remove a Tokimon");
        System.out.println("4. Change Tokimon strength");
        System.out.println("5. DEBUG: Dump objects (toString)");
        System.out.println("6. Exit");
    }

    public void displayAllTokis() {
        if (size == 0) {
            System.out.println("There are no Tokimons.");
        }
        else {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + tokimons.get(i).getName() + ", " +
                        tokimons.get(i).getHeight() + "m, " + tokimons.get(i).getWeight() + "lb, " +
                        tokimons.get(i).getType() + " ability, " + tokimons.get(i).getStrength() + " strength");
            }
        }
    }

    public void addNewToki() {
        if (size > 299) {
            System.out.println("Sorry, the list if full");
            return;
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Tokimon's name: ");
        String newName = in.nextLine();
        System.out.print("Enter Tokimon's type: ");
        String newType = in.nextLine();
        System.out.print("Enter Tokimon's height (in metres): ");
        double newHeight = in.nextDouble();
        System.out.print("Enter Tokimon's weight (in pounds): ");
        double newWeight = in.nextDouble();
        System.out.print("Enter Tokimon's strength (Enter a number between 0 to 100): ");
        int newStrength = in.nextInt();
        while (newStrength < 0 || newStrength > 100) {
            System.out.print("Enter valid strength (Between 0 to 100): ");
            newStrength = in.nextInt();
        }
        System.out.println("");
        Tokimon tokimon = new Tokimon(newName, newType, newHeight, newWeight, newStrength);
        tokimons.add(tokimon);
        size++;
        System.out.println(tokimon.getName() + " has been added!");
    }

    public void deleteToki() {
        displayAllTokis();
        System.out.println("(Enter 0 to cancel)");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        System.out.println("");
        while (number < 0 || number > size) {
            System.out.print("Enter a valid number: ");
            number = in.nextInt();
            System.out.println("");
        }
        if (number == 0) {
            return;
        }
        Tokimon tokimon = tokimons.get(number - 1);
        tokimons.remove(number - 1);
        size--;
        System.out.println(tokimon.getName() + " has been deleted");
    }

    public void alterToki() {
        displayAllTokis();
        System.out.println("(Enter 0 to cancel)");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        System.out.println("");
        while (number < 0 || number > size) {
            System.out.print("Enter a valid number: ");
            number = in.nextInt();
            System.out.println("");
        }
        if (number == 0) {
            return;
        }
        System.out.print("Enter new strength: ");
        int newStrength = in.nextInt();
        System.out.println("");
        while (newStrength < 0 || newStrength > 100) {
            System.out.print("Enter valid strength: ");
            newStrength = in.nextInt();
            System.out.println("");
        }
        tokimons.get(number - 1).setStrength(newStrength);
        System.out.println(tokimons.get(number - 1).getName() + " now has strength " + newStrength + "!");
    }

    public void displayToString() {
        if (size == 0) {
            System.out.println("There are no Tokimons.");
        }
        else {
            System.out.println("All Tokimon Objects:");
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + tokimons.get(i).toString());
            }
        }
    }
}
