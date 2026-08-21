package library.main;

import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import library.service.LibraryService;

public class Main {

    public static void main(String[] args) {

        LibraryResource[] resources = new LibraryResource[5];

        resources[0] = new Book(
                101,
                "Java Programming",
                "James Gosling"
        );

        resources[1] = new Book(
                102,
                "Data Structures",
                "Mark Allen"
        );

        resources[2] = new DigitalResource(
                103,
                "Artificial Intelligence",
                "Stuart Russell"
        );

        resources[3] = new DigitalResource(
                104,
                "Machine Learning",
                "Tom Mitchell"
        );

        resources[4] = new Book(
                105,
                "Operating Systems",
                "Abraham Silberschatz"
        );

        int[] overdueDays = {5, 3, 10, 7, 0};

        System.out.println("========================================");
        System.out.println("     SMART LIBRARY RESOURCE SYSTEM");
        System.out.println("========================================");
        System.out.println("Library: " + LibraryResource.getLibraryName());

        System.out.println("\n========== RESOURCE DETAILS ==========");

        LibraryService.displayResources(resources);

        double totalFine = LibraryService.calculateTotalFine(
                resources,
                overdueDays
        );

        System.out.println("========================================");
        System.out.printf("Total Fine: Rs. %.2f%n", totalFine);
        System.out.println("========================================");

        LibraryResource.displayTotalResources();
    }
}
