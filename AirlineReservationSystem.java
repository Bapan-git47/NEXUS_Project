import java.util.Scanner;

public class FlightBookingSystem {

    private static int[][] nationalSeats = new int[10][10];
    private static int[][] internationalSeats = new int[10][10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Online Flight Booking System");
            System.out.println("1. Check Seat Availability");
            System.out.println("2. Get Flight Details");
            System.out.println("3. Reserve Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkSeatAvailability();
                    break;
                case 2:
                    getFlightDetails();
                    break;
                case 3:
                    reserveSeats();
                    break;
                case 4:
                    System.out.println("Thank you for using the Flight Booking System. Have a safe journey!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void checkSeatAvailability() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCheck Seat Availability:");
        System.out.print("Enter flight type (1 for National, 2 for International): ");
        int flightType = scanner.nextInt();

        int[][] seats;
        if (flightType == 1) {
            seats = nationalSeats;
        } else if (flightType == 2) {
            seats = internationalSeats;
        } else {
            System.out.println("Invalid flight type.");
            return;
        }

        int availableSeats = 0;
        for (int[] row : seats) {
            for (int seat : row) {
                if (seat == 0) {
                    availableSeats++;
                }
            }
        }

        System.out.println("Available seats: " + availableSeats);
    }

    private static void getFlightDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nGet Flight Details:");
        System.out.print("Enter flight type (1 for National, 2 for International): ");
        int flightType = scanner.nextInt();

        if (flightType == 1) {
            System.out.println("National Flight Details");
            // Add national flight details here
        } else if (flightType == 2) {
            System.out.println("International Flight Details");
            // Add international flight details here
        } else {
            System.out.println("Invalid flight type.");
        }
    }

    private static void reserveSeats() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nReserve Seats:");
        System.out.print("Enter flight type (1 for National, 2 for International): ");
        int flightType = scanner.nextInt();

        int[][] seats;
        if (flightType == 1) {
            seats = nationalSeats;
        } else if (flightType == 2) {
            seats = internationalSeats;
        } else {
            System.out.println("Invalid flight type.");
            return;
        }

        System.out.print("Enter the number of seats to reserve: ");
        int numSeats = scanner.nextInt();

        int reservedSeats = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    seats[i][j] = 1;
                    reservedSeats++;
                }

                if (reservedSeats == numSeats) {
                    System.out.println("Seats reserved successfully.");
                    return;
                }
            }
        }

        System.out.println("Sorry, not enough seats available.");
    }
}
