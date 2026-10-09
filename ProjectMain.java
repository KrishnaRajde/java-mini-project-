
import java.util.*;

 class ProjectMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" AIRLINE RESERVATION SYSTEM ");
            System.out.println("1. User Login");
            System.out.println("2. Admin Login");
            System.out.println("3. Register");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("User Login Selected");
                    break;

                case 2:
                    System.out.println("Admin Login Selected");
                    break;

                case 3:
                    System.out.println("User Registration Selected");
                    break;

                case 4:
                    System.out.println("Exiting Airline Reservation System...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        
    }
}
