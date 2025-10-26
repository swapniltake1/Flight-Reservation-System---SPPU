import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FlightReservationSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Flight> flights = new ArrayList<>();
    static ArrayList<Passenger> passengers = new ArrayList<>();

    // ---------------- ADD FLIGHT ----------------
    static void addFlight() {
        System.out.print("Enter Flight ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Source: ");
        String src = sc.nextLine();
        System.out.print("Enter Destination: ");
        String dest = sc.nextLine();
        System.out.print("Enter Time: ");
        String time = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Total Seats: ");
        int seats = sc.nextInt();

        flights.add(new Flight(id, src, dest, time, price, seats));
        System.out.println("Flight Added Successfully!\n");
    }

    // ---------------- DISPLAY ALL ----------------
    static void displayFlights() {
        if (flights.isEmpty()) {
            System.out.println("No Flights Available!\n");
            return;
        }

        System.out.printf("%-6s %-12s %-12s %-10s %-10s %-8s\n",
                "ID", "Source", "Destination", "Time", "Price", "Seats");
        for (Flight f : flights)
            f.display();
        System.out.println();
    }

    // ---------------- SEARCH ----------------
    static void searchFlight() {
        System.out.println("1. Search by Destination\n2. Search by Flight ID");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            System.out.print("Enter Destination: ");
            String dest = sc.nextLine();
            boolean found = false;
            for (Flight f : flights) {
                if (f.destination.equalsIgnoreCase(dest)) {
                    if (!found)
                        System.out.printf("%-6s %-12s %-12s %-10s %-10s %-8s\n",
                                "ID", "Source", "Destination", "Time", "Price", "Seats");
                    f.display();
                    found = true;
                }
            }
            if (!found) System.out.println("No flights found to " + dest);
        } else if (ch == 2) {
            System.out.print("Enter Flight ID: ");
            int id = sc.nextInt();
            boolean found = false;
            for (Flight f : flights) {
                if (f.id == id) {
                    System.out.printf("%-6s %-12s %-12s %-10s %-10s %-8s\n",
                            "ID", "Source", "Destination", "Time", "Price", "Seats");
                    f.display();
                    found = true;
                }
            }
            if (!found) System.out.println("Flight not found!");
        }
        System.out.println();
    }

    // ---------------- SORT ----------------
    static void sortFlightsByPrice() {
        for (int i = 0; i < flights.size() - 1; i++) {
            for (int j = 0; j < flights.size() - i - 1; j++) {
                if (flights.get(j).price > flights.get(j + 1).price) {
                    Collections.swap(flights, j, j + 1);
                }
            }
        }
        System.out.println("✅ Flights sorted by price (Bubble Sort applied)\n");
    }

    // ---------------- BOOK ----------------
    static void bookFlight() {
        if (flights.isEmpty()) {
            System.out.println("No Flights Available!\n");
            return;
        }

        displayFlights();
        System.out.print("Enter Flight ID to book: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Flight f : flights) {
            if (f.id == id) {
                if (f.availableSeats > 0) {
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    passengers.add(new Passenger(name, id));
                    f.availableSeats--;
                    System.out.println("✅ Booking Confirmed for " + name + " on Flight " + id + "\n");
                    return;
                } else {
                    System.out.println("No Seats Available on this Flight!\n");
                    return;
                }
            }
        }
        System.out.println("Invalid Flight ID!\n");
    }

    // ---------------- CANCEL ----------------
    static void cancelBooking() {
        System.out.print("Enter Passenger Name to cancel booking: ");
        sc.nextLine();
        String name = sc.nextLine();

        for (Passenger p : passengers) {
            if (p.name.equalsIgnoreCase(name)) {
                passengers.remove(p);
                for (Flight f : flights) {
                    if (f.id == p.flightId) {
                        f.availableSeats++;
                        break;
                    }
                }
                System.out.println("Booking Cancelled for " + name + "\n");
                return;
            }
        }
        System.out.println("No booking found for " + name + "\n");
    }

    // ---------------- SUMMARY ----------------
    static void showBookings() {
        if (passengers.isEmpty()) {
            System.out.println("No bookings yet!\n");
            return;
        }

        System.out.println("Passenger Booking Summary:");
        for (Passenger p : passengers) {
            System.out.println("- " + p.name + " (Flight ID: " + p.flightId + ")");
        }
        System.out.println();
    }

    // ---------------- MAIN MENU ----------------
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("========== FLIGHT RESERVATION SYSTEM ==========");
            System.out.println("1. Add Flight");
            System.out.println("2. Display Flights");
            System.out.println("3. Search Flights");
            System.out.println("4. Sort Flights by Price");
            System.out.println("5. Book Flight");
            System.out.println("6. Cancel Booking");
            System.out.println("7. Show All Bookings");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addFlight();
                case 2 -> displayFlights();
                case 3 -> searchFlight();
                case 4 -> sortFlightsByPrice();
                case 5 -> bookFlight();
                case 6 -> cancelBooking();
                case 7 -> showBookings();
                case 8 -> System.out.println("Thank you for using Flight Reservation System!");
                default -> System.out.println("Invalid Choice!\n");
            }
        } while (choice != 8);
    }
}