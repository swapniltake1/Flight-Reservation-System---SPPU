import java.util.*;

class Flight {
    int id;
    String source, destination, time;
    double price;
    int totalSeats, availableSeats;

    Flight(int id, String source, String destination, String time, double price, int seats) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.price = price;
        this.totalSeats = seats;
        this.availableSeats = seats;
    }

    void display() {
        System.out.printf("%-6d %-12s %-12s %-10s %-10.2f %-8d\n",
                id, source, destination, time, price, availableSeats);
    }
}