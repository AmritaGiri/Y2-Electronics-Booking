package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MainApp {
        public static void main(String[] args) {
                System.out.println(" WELCOME TO COMPUTER BOOKING APP : ");
                try (Scanner keyboard = new Scanner(System.in)) {
                        // STUDENT DATABASE CODE
                        StudentDB studentdb = new StudentDB();
                        // studentdb.loadStudentFromFile();

                        // ADD
                        studentdb.addStudent(
                                        new Student("Ben Walker", "D001228292", "ben.walker@dkit.ie", "083-3399778",
                                                        "DKIT-DP-24101"));
                        studentdb.addStudent(
                                        new Student("Daniel Scott", "D001228293", "daniel.scott@dkit.ie", "083-4499779",
                                                        "DKIT-DP-24102"));
                        studentdb.addStudent(new Student("Sarah Williams", "D001228294", "sarah.williams@dkit.ie",
                                        "083-5599780",
                                        "DKIT-RB-24111"));
                        studentdb.addStudent(new Student("Phillis Kings", "D001228295", "phillis.kings@dkit.ie",
                                        "083-6699781",
                                        "DKIT-RB-24112"));
                        studentdb.addStudent(
                                        new Student("Richard Ross", "D001228296", "richard.ross@dkit.ie", "083-7799782",
                                                        "DKIT-LP-24141"));

                        // studentdb.loadStudentFromFile();
                        // studentdb.saveStudentToFile();

                        // BOOKING DATABASE CODE
                        BookingDB bookingdb = new BookingDB();
                        // bookingdb.loadBookingFromFile();

                        bookingdb.AddBooking(
                                        new Booking("1001", "11/12/20 01:25", "21/12/20 01:25", "Desktop",
                                                        "DKIT-DP-24101", "D001228292"));
                        bookingdb.AddBooking(
                                        new Booking("1002", "13/12/20 12:25", "23/12/20 12:25", "Desktop",
                                                        "DKIT-DP-24102", "D001228293"));
                        bookingdb.AddBooking(
                                        new Booking("1003", "15/12/20 13:25", "25/12/20 13:25", "Laptop",
                                                        "DKIT-LP-24141", "D001228294"));
                        // bookingdb.AddBooking(new Booking("1004","17/12/20 14:25","27/12/20
                        // 14:25","Laptop","DKIT-LP-24142","D001228295"));
                        // bookingdb.AddBooking(new Booking("1005","19/12/20 15:25","29/12/20
                        // 15:25","RasberryPi","DKIT-RB-24111","D001228296"));

                        // bookingdb.loadBookingFromFile();
                        // bookingdb.saveBookingToFile();

                        // COMPUTER DATABASE CODE
                        ComputerDB computerdb = new ComputerDB();
                        computerdb.addComputer((new Laptops("Dell", "Intel Core i5 9th Gen", "8 GB", "512 GB", "1.2",
                                        "DKIT-LP-24141", "11/22/2020", "14 inches", 10)));
                        computerdb.addComputer((new Laptops("Dell", "Intel Core i5 9th Gen", "8 GB", "512 GB", "1.2",
                                        "DKIT-LP-24142", "11/22/2020", "14 inches", 10)));
                        computerdb.addComputer((new Laptops("Dell", "Intel Core i5 9th Gen", "8 GB", "512 GB", "1.2",
                                        "DKIT-LP-24143", "11/22/2020", "14 inches", 10)));
                        computerdb.addComputer((new Laptops("Dell", "Intel Core i5 9th Gen", "8 GB", "512 GB", "1.2",
                                        "DKIT-LP-24144", "11/22/2020", "14 inches", 10)));
                        computerdb.addComputer((new Laptops("Dell", "Intel Core i5 9th Gen", "8 GB", "512 GB", "1.2",
                                        "DKIT-LP-24145", "11/22/2020", "14 inches", 10)));

                        computerdb.addComputer(
                                        (new RasberryPi("Sony", "Sony Pi4", "8 GB", "64 GB", "0.31", "DKIT-RB-24111",
                                                        "11/20/2020", 40, "8GB")));
                        computerdb.addComputer(
                                        (new RasberryPi("Sony", "Sony Pi4", "8 GB", "64 GB", "0.31", "DKIT-RB-24112",
                                                        "11/20/2020", 40, "8GB")));
                        computerdb.addComputer(
                                        (new RasberryPi("Sony", "Sony Pi4", "8 GB", "64 GB", "0.31", "DKIT-RB-24113",
                                                        "11/20/2020", 40, "8GB")));
                        computerdb.addComputer(
                                        (new RasberryPi("Sony", "Sony Pi4", "8 GB", "64 GB", "0.31", "DKIT-RB-24114",
                                                        "11/20/2020", 40, "8GB")));
                        computerdb.addComputer(
                                        (new RasberryPi("Sony", "Sony Pi4", "8 GB", "64 GB", "0.31", "DKIT-RB-24115",
                                                        "11/20/2020", 40, "8GB")));

                        computerdb.addComputer((new Desktops("Dell", "Intel Core i5 9th Gen", "8 GB", "1 TB", "3.5",
                                        "DKIT-DP-24101", "11/18/2020", "acer")));
                        computerdb.addComputer((new Desktops("Dell", "Intel Core i5 9th Gen", "8 GB", "1 TB", "3.5",
                                        "DKIT-DP-24102", "11/18/2020", "acer")));
                        computerdb.addComputer((new Desktops("Dell", "Intel Core i5 9th Gen", "8 GB", "1 TB", "3.5",
                                        "DKIT-DP-24103", "11/18/2020", "acer")));
                        computerdb.addComputer((new Desktops("Dell", "Intel Core i5 9th Gen", "8 GB", "1 TB", "3.5",
                                        "DKIT-DP-24104", "11/18/2020", "acer")));
                        computerdb.addComputer((new Desktops("Dell", "Intel Core i5 9th Gen", "8 GB", "1 TB", "3.5",
                                        "DKIT-DP-24105", "11/18/2020", "acer")));

                        int option;

                        printMenu();
                        System.out.print("\nPlease enter option:");
                        option = keyboard.nextInt();
                        while (option != 10) {
                                switch (option) {
                                        case 1: {
                                                Student s = new Student("alex", "D00226037", "alex.walker@gmail.com",
                                                                "0857351449", "laptop");
                                                System.out.println("Student: " + s);
                                                studentdb.addStudent(s);
                                                System.out.println(s.toString());
                                                break;
                                        }
                                        case 2: {
                                                // s.setName("Alexa");
                                                // System.out.println(s);
                                                 break;
                                        }
                                        case 3: {
                                                // s.removeStudentByID("D00226037");
                                                // break;
                                        }
                                        case 4: {
                                                Booking b = new Booking("1005", "1/11/20", "11/12/20", "rasberryPi",
                                                                "DKIT-RB-24116",
                                                                "D001228302");
                                                System.out.println(" Booking: " + b);
                                                bookingdb.AddBooking(b);
                                                System.out.println(b.toString());
                                                break;
                                        }

                                        case 5: {
                                                bookingdb.displayBookingofStudent("D001228302");
                                                break;
                                        }

                                        case 6: {
                                                bookingdb.displayAllBooking();
                                                break;
                                        }

                                        case 7: {
                                                int avg = bookingdb.displayAverageLengthofBooking();
                                                break;
                                        }

                                        case 8: {
                                                bookingdb.numberOfComputersBooked();
                                                break;
                                        }
                                        case 9: {
                                                computerdb.displayAllComputers();
                                                break;
                                        }
                                        case 10: {
                                                System.out.println("..........EXITING..........");
                                        }

                                        default:
                                                System.out.println("please enter valid option [1,10]");
                                                break;
                                }
                                printMenu();
                                System.out.print("Please enter option:");
                                option = keyboard.nextInt();
                        }
                }

        }

        public static void printMenu() {
                System.out.println("1. ADD_NEW_STUDENT");
                System.out.println("2. EDIT_STUDENT ");
                System.out.println("3. DELETE_STUDENT");
                System.out.println("4. ADD_BOOKING");
                System.out.println("5. DISPLAY BOOKING OF PATICULAR STUDENT ");
                System.out.println("6. PRINT ALL BOOKINGS ");
                System.out.println("7. AVERAGE_LENGTH_BOOKING");
                System.out.println("8. PRINT_STATISTICS ON NUMBER OF DESKTOP, LAPTOP AND  RASBERRY PI BOOKED TO DATE.");
                System.out.println("9. DISPLAY ALL COMPUTERS");
                System.out.println("10. EXIT");

        }

}
