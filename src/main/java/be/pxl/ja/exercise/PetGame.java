package be.pxl.ja.exercise;

import java.util.Scanner;

public class PetGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a new pet with initial energy
        boolean gameRunning = true;

        System.out.println("Welcome to the Virtual Pet Care Game!");
        System.out.println("Take care of your pet by feeding and playing with it!");

        // Create game loop
        System.out.println("\nYour pet's current energy: 20/100");
        System.out.println("What would you like to do?");
        System.out.println("1. Feed the pet");
        System.out.println("2. Play with the pet");
        System.out.println("3. Exit game");

        int choice = scanner.nextInt();
        // Use switch to handle the player's choice

        System.out.println("Thank you for playing the Virtual Pet Care Game!");
        System.out.println("Invalid choice. Please select a valid option.");

        scanner.close();
    }
}
