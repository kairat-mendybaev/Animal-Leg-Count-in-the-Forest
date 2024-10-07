
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnimalLegCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 5 animals from the list: 'lion', 'deer', 'elephant', 'horse', 'dog', 'cat', 'monkey', 'parrot', 'ostrich', 'snake', 'worm', 'spider', 'ant', 'centipede'");

        ArrayList<String> arrayOfAnimals = new ArrayList<>();
        ArrayList<String> fourLegsAnimals = new ArrayList<>(Arrays.asList("lion", "deer", "elephant", "horse", "dog", "cat"));

        for (int i = 0; i < 5; i++) {
            arrayOfAnimals.add(scan.next());
        }

        System.out.println("Your list: " + arrayOfAnimals);

        arrayOfAnimals.retainAll(fourLegsAnimals);
        System.out.println("Only " + arrayOfAnimals + " have(s) 4 legs");
        System.out.println(arrayOfAnimals.size());
       }

    }
