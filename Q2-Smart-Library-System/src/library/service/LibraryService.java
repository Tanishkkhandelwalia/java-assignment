package library.service;

import library.model.LibraryResource;
import library.model.Printable;
import library.util.InputValidator;

public final class LibraryService {

    private LibraryService() {
    }

    public static void displayResources(LibraryResource[] resources) {
        for (LibraryResource resource : resources) {
            Printable printable = (Printable) resource;
            printable.printDetails();
            System.out.println();
        }
    }

    public static double calculateTotalFine(
            LibraryResource[] resources,
            int[] overdueDays) {

        double totalFine = 0.0;

        for (int i = 0; i < resources.length; i++) {

            if (!InputValidator.validateResourceId(
                    resources[i].getResourceId())) {
                System.out.println("Invalid Resource ID.");
                continue;
            }

            if (!InputValidator.validateFineDays(overdueDays[i])) {
                System.out.println("Invalid overdue days.");
                continue;
            }

            totalFine += resources[i].calculateFine(overdueDays[i]);
        }

        return totalFine;
    }
}
