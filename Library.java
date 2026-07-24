import java.util.ArrayList;
import java.util.Scanner;

public class Library{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String> books = new ArrayList<>();

        int choice;
        do {
            System.out.println("LIBRARY MANAGEMENT SYSTEM");
            System.out.println("Add Book");
            System.out.println("View Books");
            System.out.println("Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the book name: ");
                    String book = sc.nextLine();
                    books.add(book);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books in the library.");
                    } else {
                        System.out.println("Books in the library:");
                        for (String b : books) {
                            System.out.println("- " + b);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}