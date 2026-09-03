package DSA;

import java.util.Scanner;

//---------- Pet class: holds data and behavior of the virtual pet ----------
class Pet {
 private String name;
 private int hunger;     // 0 = starving, 100 = full
 private int energy;     // 0 = exhausted, 100 = fully rested
 private int happiness;  // 0 = sad, 100 = very happy
 private boolean alive;

 public Pet(String name) {
     this.name = name;
     this.hunger = 70;
     this.energy = 70;
     this.happiness = 70;
     this.alive = true;
 }

 // Feed the pet: increases hunger stat, slightly reduces energy
 public void feed() {
     hunger = Math.min(100, hunger + 20);
     energy = Math.max(0, energy - 5);
     System.out.println(name + " has been fed. Yum!");
 }

 // Play with the pet: increases happiness, reduces energy and hunger
 public void play() {
     if (energy < 15) {
         System.out.println(name + " is too tired to play right now.");
         return;
     }
     happiness = Math.min(100, happiness + 20);
     energy = Math.max(0, energy - 15);
     hunger = Math.max(0, hunger - 10);
     System.out.println(name + " had fun playing!");
 }

 // Let the pet sleep: restores energy
 public void sleep() {
     energy = Math.min(100, energy + 30);
     hunger = Math.max(0, hunger - 5);
     System.out.println(name + " took a nice nap.");
 }

 // Simulates time passing — stats naturally decay each turn
 public void decayStats() {
     hunger = Math.max(0, hunger - 8);
     energy = Math.max(0, energy - 5);
     happiness = Math.max(0, happiness - 6);
     checkHealth();
 }

 // Checks if pet is still okay based on stats
 private void checkHealth() {
     if (hunger == 0 || energy == 0 || happiness == 0) {
         alive = false;
     }
 }

 public boolean isAlive() {
     return alive;
 }

 // Displays current stats to the user
 public void showStatus() {
     System.out.println("\n----- " + name + "'s Status -----");
     System.out.println("Hunger    : " + hunger + "/100");
     System.out.println("Energy    : " + energy + "/100");
     System.out.println("Happiness : " + happiness + "/100");
     System.out.println("--------------------------------");
 }
}

//---------- Main class: runs the game menu ----------
public class VirtualPetGame {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter your pet's name: ");
     String petName = sc.nextLine();
     Pet myPet = new Pet(petName);

     int choice = 0;

     while (myPet.isAlive() && choice != 5) {
         myPet.showStatus();
         System.out.println("\nWhat do you want to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Check Status");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");

         // Basic input validation
         while (!sc.hasNextInt()) {
             System.out.println("Please enter a number between 1-5.");
             sc.next();
         }
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 myPet.feed();
                 break;
             case 2:
                 myPet.play();
                 break;
             case 3:
                 myPet.sleep();
                 break;
             case 4:
                 myPet.showStatus();
                 break;
             case 5:
                 System.out.println("Thanks for playing! Goodbye.");
                 break;
             default:
                 System.out.println("Invalid choice, try again.");
         }

         // Time passes after every action (except exit)
         if (choice != 5) {
             myPet.decayStats();
         }

         if (!myPet.isAlive()) {
             System.out.println("\nOh no! " + petName + " is not doing well anymore. Game Over.");
         }
     }

     sc.close();
 }
}

