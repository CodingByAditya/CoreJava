import java.util.*;

class Room {
    int roomNumber;
    String type;
    boolean isBooked;
    String customerName;

    Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = false;
        this.customerName = "";
    }

    public void bookRoom(String customerName) {
        if (!isBooked) {
            this.isBooked = true;
            this.customerName = customerName;
            System.out.println("? Room " + roomNumber + " booked successfully by " + customerName);
        } else {
            System.out.println("? Room " + roomNumber + " is already booked.");
        }
    }

    public void checkout() {
        if (isBooked) {
            System.out.println("? Room " + roomNumber + " checked out. (Customer: " + customerName + ")");
            this.isBooked = false;
            this.customerName = "";
        } else {
            System.out.println("? Room " + roomNumber + " is not booked.");
        }
    }

    public void showStatus() {
        System.out.println("Room " + roomNumber + " (" + type + ") - " 
                           + (isBooked ? "Booked by " + customerName : "Available"));
    }
}

public class HotelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample rooms
        Room[] rooms = {
            new Room(101, "Single"),
            new Room(102, "Double"),
            new Room(103, "Suite")
        };

        while (true) {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Checkout Room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Room r : rooms) r.showStatus();
                    break;

                case 2:
                    System.out.print("Enter Room Number: ");
                    int rno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    boolean found = false;
                    for (Room r : rooms) {
                        if (r.roomNumber == rno) {
                            r.bookRoom(name);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("? Room not found.");
                    break;

                case 3:
                    System.out.print("Enter Room Number: ");
                    int rnum = sc.nextInt();
                    found = false;
                    for (Room r : rooms) {
                        if (r.roomNumber == rnum) {
                            r.checkout();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("? Room not found.");
                    break;

                case 4:
                    System.out.println("?? Exiting Hotel Management System. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("? Invalid choice. Try again.");
            }
        }
    }
}
