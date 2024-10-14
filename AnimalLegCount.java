import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalLegCount {

    // List of animals with four legs
    private static final List<String> fourLeggedAnimals = Arrays.asList("lion", "deer", "elephant", "horse", "dog", "cat");

    // Method to get animal input from the user
    public static List<String> getAnimalInput() {
        Scanner scan = new Scanner(System.in);
        List<String> inputAnimals = new ArrayList<>();

        System.out.println("Enter any 5 animals from the list: 'lion', 'deer', 'elephant', 'horse', 'dog', 'cat', 'monkey', 'parrot', 'ostrich', 'snake', 'worm', 'spider', 'ant', 'centipede'");

        for (int i = 0; i < 5; i++) {
            inputAnimals.add(scan.next());
        }

        return inputAnimals;
    }

    // Method to filter animals with four legs
    public static List<String> filterFourLeggedAnimals(List<String> animals) {
        List<String> fourLeggedList = new ArrayList<>(animals);
        fourLeggedList.retainAll(fourLeggedAnimals); // Retain only animals with four legs
        return fourLeggedList;
    }

    // Method to count animals with four legs
    public static int countFourLeggedAnimals(List<String> animals) {
        return filterFourLeggedAnimals(animals).size();
    }

    // Main method to run the program
    public static void main(String[] args) {
        List<String> animals = getAnimalInput();
        System.out.println("Your list: " + animals);

        List<String> fourLegged = filterFourLeggedAnimals(animals);
        System.out.println("Only " + fourLegged + " have(s) 4 legs");
        System.out.println("Count of animals with 4 legs: " + fourLegged.size());
    }
}
