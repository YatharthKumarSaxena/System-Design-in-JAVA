package Mini_Projects.Vehicle_Renting_System_Project;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_House_Interface;

import java.util.List;

/* Singleton Design Pattern is Used */
/* Our Design is modelled to work for Individual Company */

// SRP is followed

/* Use of Composite Design Pattern as Company consist of collection of Renting Houses
 * This treats the collection of Renting Houses as Single Entity
 * If we have different type of Renting Houses then they are treated as Single Entity */

// Use of LSP is done here

/* If we create additional types of Renting Houses (e.g., PremiumHouse, VIPHouse),
 * as long as they implement the Renting_House interface, they can be added to the
 * Vehicle_Renting_Company without breaking any existing functionality. This is a direct
 * application of LSP: new types of Renting House can be substituted into the system
 * without modifying the existing code. */

public class Vehicle_Renting_Company {

        // Data Members
        private String name;
        private List<Renting_House_Interface> rentingHouses;

        // Private static instance to ensure a single instance
        private static Vehicle_Renting_Company instance;

        // Private Constructor to prevent instantiation
        private Vehicle_Renting_Company(String name, List<Renting_House_Interface> rentingHouses) {
            this.name = name;
            this.rentingHouses = rentingHouses;
        }

        // To ensure one thread execution in order to avoid multiple instance creation
        // JAVA is a multithreaded language
        // So when two threads are trying to call the get instance method
        // We might have the multiple instances created
        // To avoid the multiple object creation at the same time synchronized keyword is used
        // Synchronized Keyword ensures that At a moment only one thread executes the whole entire method
        // This will ensure single instance creation of user database here

        // Public method to get the instance of the class
        public static synchronized Vehicle_Renting_Company getInstance(String name, List<Renting_House_Interface> rentingHouses) {
            if (instance == null) {
                instance = new Vehicle_Renting_Company(name, rentingHouses);
            }
            return instance;
        }

        public String getName() {
            return this.name;
        }

        public List<Renting_House_Interface> getRentingHouses() {
            return this.rentingHouses;
        }

        public int getNumberOfEmptySlots() {
            int emptySlots = 0;
            for (Renting_House_Interface A : rentingHouses) {
                emptySlots += A.getNumberOfEmptySlots();
            }
            return emptySlots;
        }

        public int getNumberOfFilledSlots() {
            int filledSlots = 0;
            for (Renting_House_Interface A : rentingHouses) {
                filledSlots += A.getNumberOfFilledSlots();
            }
            return filledSlots;
        }

        public int getTotalSlots() {
            return this.getNumberOfFilledSlots() + this.getNumberOfEmptySlots();
        }

        public void get_Rating(){
            System.out.println("Our "+this.name+" has a rating of "+ 4.1+"/"+5);
        }

        public int get_TotalValue(){
            int totalValue = 0;
            for(Renting_House_Interface rentingHouse : rentingHouses){
                totalValue += rentingHouse.getValue();
            }
            return totalValue;
        }
    }
