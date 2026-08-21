package library.util;

public final class InputValidator {

    private InputValidator() {
    }

    public static boolean validateResourceId(int resourceId) {
        return resourceId > 0;
    }

    public static boolean validateFineDays(int overdueDays) {
        return overdueDays >= 0;
    }
}
