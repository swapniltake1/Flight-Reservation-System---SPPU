

# ✈️ Flight Reservation System (Java DSA Mini Project)

## 🧾 Overview
The **Flight Reservation System** is a console-based Java application developed as part of the **Data Structures and Algorithms (DSA)** mini-project for **SPPU (Savitribai Phule Pune University)** second-year Computer Engineering curriculum.

This project demonstrates real-world application of **searching and sorting algorithms**, with additional features such as flight booking, cancellation, and passenger record management.  
It is a great example of combining **Object-Oriented Programming (OOP)** and **core DSA concepts** in an interactive system.

---

## 🎯 Objectives
- To implement searching and sorting algorithms using real-world data.
- To simulate a mini airline reservation system.
- To apply core concepts of **OOP**, **DSA**, and **Algorithm Analysis**.
- To build a modular, console-based Java application.

---

## ⚙️ Features

| Feature | Description | Algorithm / Concept |
|----------|--------------|--------------------|
| ✈️ Add Flight | Add flight details to the system | Object Array / ArrayList |
| 🔍 Search Flight | Search by ID or destination | Linear Search |
| 📊 Sort Flights | Sort by price (ascending) | Bubble Sort |
| 🧍‍♂️ Book Flight | Reserve a seat for a passenger | Data update logic |
| ❌ Cancel Booking | Cancel an existing passenger booking | Array manipulation |
| 📋 Show Bookings | Display all booked passengers | Iteration / Traversal |
| 💾 Exit | Gracefully exit the program | — |

---

## 🧠 Data Structures Used
- `ArrayList<Flight>` → stores all available flights  
- `ArrayList<Passenger>` → stores passenger bookings  
- Manual implementation of:
  - **Linear Search**
  - **Bubble Sort**
  - (Optional) Binary Search for sorted price-based search

---

## 🧩 Class Diagram

```text
+-----------------------+
|       Flight          |
+-----------------------+
| int id                |
| String source          |
| String destination      |
| String time            |
| double price           |
| int totalSeats         |
| int availableSeats     |
+-----------------------+
| display()              |
+-----------------------+

+-----------------------+
|      Passenger        |
+-----------------------+
| String name           |
| int flightId          |
+-----------------------+

+-----------------------+
| FlightReservationSystem|
+-----------------------+
| addFlight()           |
| displayFlights()      |
| searchFlight()        |
| sortFlightsByPrice()  |
| bookFlight()          |
| cancelBooking()       |
| showBookings()        |
+-----------------------+
````

---

## 🧰 Technologies Used

* **Language:** Java
* **Version:** JDK 8 or higher
* **IDE:** IntelliJ IDEA / Eclipse / VS Code
* **Algorithm Focus:** Linear Search, Bubble Sort

---

## 📂 Folder Structure

```
FlightReservationSystem/
│
├── src/
│   ├── Flight.java
│   ├── Passenger.java
│   └── FlightReservationSystem.java
│
├── README.md
└── Project_Report.docx
```

---

## 🚀 How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/<your-username>/FlightReservationSystem.git
   ```
2. Open the project in your IDE (IntelliJ, Eclipse, or VS Code).
3. Compile and run the program:

   ```bash
   javac FlightReservationSystem.java
   java FlightReservationSystem
   ```
4. Follow the on-screen menu to add, search, sort, and book flights.

---

## 🧪 Sample Output

```
========== FLIGHT RESERVATION SYSTEM ==========
1. Add Flight
2. Display Flights
3. Search Flights
4. Sort Flights by Price
5. Book Flight
6. Cancel Booking
7. Show All Bookings
8. Exit

Enter your choice: 1
Enter Flight ID: 101
Enter Source: Pune
Enter Destination: Delhi
Enter Time: 10:30 AM
Enter Price: 4500
Enter Total Seats: 5
✅ Flight Added Successfully!
```

---

## 🧮 Algorithm Complexity

| Algorithm     | Best Case | Worst Case | Space Complexity |
| ------------- | --------- | ---------- | ---------------- |
| Linear Search | O(1)      | O(n)       | O(1)             |
| Bubble Sort   | O(n)      | O(n²)      | O(1)             |

---

## 💡 Future Enhancements

* Integration with **MySQL Database** for persistence.
* Add **GUI (Swing / JavaFX)** for improved user experience.
* Implement **Binary Search** for faster flight lookup.
* Add **Admin/User authentication**.

---

## 👨‍💻 Author

**Swapnil Take**
🎓 B.E. Computer Engineering – SPPU
💼 Application Developer | Java | AWS | Data Engineering Enthusiast
📧 Email: [swapniltake1@outlook.com](mailto:swapniltake1@outlook.com)
🌐 GitHub: [swapniltake1](https://github.com/swapniltake1)

---

## 📝 License

This project is open-source and available under the [MIT License](LICENSE).

