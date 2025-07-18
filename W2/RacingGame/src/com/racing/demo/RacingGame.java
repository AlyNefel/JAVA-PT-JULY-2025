package com.racing.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingGame {
    public static void main(String[] args) {
        ArrayList<Vehicle> racers = new ArrayList<>();
        racers.add(new Car("Speedster"));
        racers.add(new Bike("Zoomer"));
        racers.add(new Truck("Hauler"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("🏁 Welcome to the Racing Game!");

        for (int round = 1; round <= 3; round++) {
            System.out.println("\n--- Round " + round + " ---");
            for (Vehicle v : racers) {
                System.out.println("Choose action for " + v.name + ":");
                System.out.println("1. Accelerate");
                System.out.println("2. Brake");
                if (v instanceof Boostable) {
                    System.out.println("3. Boost");
                }

                System.out.print("Your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                case 1:
                    v.accelerate();
                    break;
                case 2:
                    v.brake();
                    break;
                case 3:
                    if (v instanceof Boostable) {
                        ((Boostable) v).boost();
                    } else {
                        System.out.println(v.name + " cannot boost!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

                System.out.println(v.getStatus());
            }
        }

        System.out.println("\n🏆 Final Speeds:");
        for (Vehicle v : racers) {
            System.out.println(v.getStatus());
        }
    }
}
