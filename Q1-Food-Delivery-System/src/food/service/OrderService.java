package food.service;

import food.model.Discountable;
import food.model.FoodOrder;
import food.utility.OrderUtility;

public final class OrderService {

    private OrderService() {
    }

    public static void displayBill(FoodOrder order) {

        if (!OrderUtility.validateAmount(order.getAmount())) {
            System.out.println("Invalid amount.");
            return;
        }

        if (!OrderUtility.validateCustomerName(order.getCustomerName())) {
            System.out.println("Invalid customer name.");
            return;
        }

        Discountable discountable = (Discountable) order;

        double discount = discountable.applyDiscount();
        double deliveryCharge = order.calculateDeliveryCharge();

        OrderUtility.generateOrderSummary(
                order.getOrderId(),
                order.getCustomerName(),
                order.getAmount(),
                discount,
                deliveryCharge
        );
    }
}
