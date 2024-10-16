import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get patient information from user
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter street address: ");
        String streetAddress = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String state = scanner.nextLine();
        System.out.print("Enter ZIP code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.print("Enter emergency contact phone: ");
        String emergencyContactPhone = scanner.nextLine();

        // Create patient object
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone);
        
        // Create procedure instances
        Procedure procedure1 = new Procedure("X-Ray", "06/12/2023", "Dr. Smith", 150.00);
        Procedure procedure2 = new Procedure("Blood Test", "07/15/2023");
        procedure2.setPractitionerName("Nurse Johnson");
        procedure2.setCharges(75.00);
        procedure2.setDate("07/15/2023");
        Procedure procedure3 = new Procedure("Physical Exam", "08/01/2023", "Dr. Lee", 200.00);

        // Display patient information
        displayPatient(patient);

        // Display procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges
        double totalCharges = calculateTotalCharges(procedure1.getCharges(), procedure2.getCharges(), procedure3.getCharges());
        System.out.printf("Total Charges: $%.2f%n", totalCharges);

        // Developer information
        System.out.println("The program was developed by a Student: <Your Name> <07/27/24>");
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
        System.out.println();
    }

    public static double calculateTotalCharges(double... charges) {
        double total = 0;
        for (double charge : charges) {
            total += charge;
        }
        return total;
    }
}
