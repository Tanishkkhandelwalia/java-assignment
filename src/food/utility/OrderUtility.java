package food.utility;

public final class OrderUtility {

    private OrderUtility() {
    }

    public static boolean validateAmount(double amount) {
        return amount > 0;
    }

    public static boolean validateCustomerName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static void generateOrderSummary(
            int orderId,
            String customerName,
            double amount,
            double discount,
            double deliveryCharge) {

        double finalAmount = amount - discount + deliveryCharge;

        System.out.println("----------------------------------------");
        System.out.println("Order ID        : " + orderId);
        System.out.println("Customer Name   : " + customerName);
        System.out.printf("Order Amount    : Rs. %.2f%n", amount);
        System.out.printf("Discount        : Rs. %.2f%n", discount);
        System.out.printf("Delivery Charge : Rs. %.2f%n", deliveryCharge);
        System.out.printf("Final Payable   : Rs. %.2f%n", finalAmount);
        System.out.println("----------------------------------------");
    }
}
