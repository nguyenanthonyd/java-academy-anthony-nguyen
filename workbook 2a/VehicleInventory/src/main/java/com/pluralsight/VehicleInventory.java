package com.pluralsight;
import  java.util.Scanner;


public class VehicleInventory {


        // 1. Array that can hold up to 20 vehicles
        private static final int MAX =20;
        private static final Vehicle[] vehicles = new Vehicle[MAX];
        private static int vehicleCount = 6; // start with 6 preloaded
         // start with 6 preloaded

        public static void main(String[] args) {
        preload();
        runMenu();

        }

    private static  void preload() {
        // 2.Preload array with 6 vehicles
        vehicles[0] = new Vehicle(101121, "Mazda RX-7", "White", 45000, 13500f);
        vehicles[1] = new Vehicle(101122, "Toyota Supra", "Black", 60000, 11000f);
        vehicles[2] = new Vehicle(101123, "Nissan Skyline R-34", "Blue", 50000, 9700f);
        vehicles[3] = new Vehicle(101124, "Honda Civic Type - R", "Yellow", 70000, 7500f);
        vehicles[4] = new Vehicle(101125, "Honda Integra Type - R", "White", 55000, 14500f);
        vehicles[5] = new Vehicle(101126, "Lexus IS300", "Gray", 30000, 16000f);

    }


    // Menu Loop
private  static void runMenu() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                printMenu();
                int command = safeInt(scanner);

                switch (command) {

                    case 1 -> listAllVehicles();
                    case 2 -> searchByMakeModel(scanner);
                    case 3 -> searchByPriceRange(scanner);
                    case 4 -> searchByColor(scanner);
                    case 5 -> addVehicle(scanner);
                    case 6 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Unknown option. Try 1-6.");
                }
                System.out.println();
                }
            }

            private static void printMenu() {
                System.out.println("What do you want to do?");
                System.out.println("1 - List all vehicles");
                System.out.println("2 - Search by make/model");
                System.out.println("3 - Search by price range");
                System.out.println("4 - Search by color");
                System.out.println("5 - Add a vehicle");
                System.out.println("6 - Quit");
                System.out.println("Enter your command:");
            }

            // Helpers to read safe numbers
private  static int safeInt(Scanner sc) {
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Please enter a number"); }
            return sc.nextInt();
}

private static long readLong(Scanner sc){
            while (!sc.hasNextLong()) {
                sc.next();
                System.out.print("Please enter a whole number:");
            }
            return sc.nextLong();
}

private static int readInt(Scanner sc) {
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Please enter a whole number:");
            }
            return sc.nextInt();
        }
        private static float readFloat (Scanner sc) {
            while  (!sc.hasNextFloat()) {
                sc.next();
                System.out.print("Please enter a decimal number:");
            }
            return sc.nextFloat();

        }
            // OPTION 1: LIST
            private static void listAllVehicles() {
                if (vehicleCount == 0) {
                    System.out.println("No vehicles in inventory yet.");
                    return;
                }
                System.out.println("ID | Make/Model | Color | Miles | Price");
                for (int i = 0; i < vehicleCount; i++) {
                    Vehicle v = vehicles[i];
                    System.out.printf("%d | %s | %s | %,d | $%.2f%n",
                            v.getVehicleId(), v.getMakeModel(), v.getColor(),
                            v.getOdometerReading(), v.getPrice());
                }
        }
            // OPTION 2: SEARCH BY MAKE/MODEL
            private static void searchByMakeModel(Scanner scanner) {
                System.out.print("Enter make/model term: ");
                scanner.nextLine(); // clear newline from last int
                String term = scanner.nextLine().toLowerCase();

                int hits = 0;
                for (int i = 0; i < vehicleCount; i++) {
                    if (vehicles[i].getMakeModel().toLowerCase().contains(term)) {
                        Vehicle v = vehicles[i];
                        System.out.printf("%d | %s | %s | %,d | $%.2f%n",
                                v.getVehicleId(), v.getMakeModel(), v.getColor(),
                                v.getOdometerReading(), v.getPrice());
                        hits++;
                    }
                }
                System.out.println(hits == 0 ? "No matches." : "Matches found: " + hits);
            }

            // ============ OPTION 5: ADD ============
            private static void addVehicle(Scanner scanner) {
                if (vehicleCount >= MAX) {
                    System.out.println("Lot full! Cannot add more vehicles.");
                    return;
                }

                System.out.println("Adding a new vehicle...");
                System.out.print("Vehicle ID (long): ");
                long id = readLong(scanner);

                // Duplicate ID CHECK
                for (int i = 0; i < vehicleCount; i++) {
                    if (vehicles[i].getVehicleId() == id) {
                        System.out.println("ID already exists. Vehicle not added.");
                        return;
                    }
                }


                scanner.nextLine(); // flush newline
                System.out.print("Make/Model: ");
                String mm = scanner.nextLine();

                System.out.print("Color: ");
                String color = scanner.nextLine();

                System.out.print("Odometer (int): ");
                int odo = readInt(scanner);

                System.out.print("Price (float): ");
                float price = readFloat(scanner);

                vehicles[vehicleCount++] = new Vehicle(id, mm, color, odo, price);
                System.out.println("Vehicle added!");
            }

            private  static void searchByColor( Scanner scanner) {
                System.out.println("Color to search:");
                scanner.nextLine();
                String want = scanner.nextLine().trim();

                int hits = 0;

                for (int i = 0; i < vehicleCount; i++) {
                    if (vehicles[i].getColor().equalsIgnoreCase(want)) {
                        Vehicle v = vehicles[i];
                        System.out.printf("%d | %s | %s | %,d | $%.2f%n");
                                v.getVehicleId(), v.getMakeModel(), v.getColor(),
                                v.getOdometerReading(), v.getPrice());
                        hits++;
                    }
                }
                System.out.println(hits == 0 ? "No matches." : "Matches found: " + hits);
            }

            // OPTION 3 : SEARCH BY PRICE RANGE

            private static  void searchByPriceRange(Scanner scanner)  {
                    System.out.print("Min price: ");
                    float min = readFloat(scanner);

                    System.out.print("Max price: ");
                    float max =readFloat(scanner);

                    if (min > max) { float t = min; min = t; }

                    int hits = 0;
                    for (int i = 0; i < vehicleCount; i++) {
                        float p = vehicles[i].getPrice();
                        if (p >= min && p <= max) {
                            Vehicle v = vehicles[i];
                            System.out.printf("%d | %s | %s | %,d | $%.2fn");
                                    v.getVehicleId(), v.getMakeModel(), v.getColor(),
                                            v.getOdometerReading(), v.getPrice());

                                hits++;

                        }
                    }
                        System.out.println(hits == 0 ? "No matches." : "Matches found:" + hits);


                    }

                }





























