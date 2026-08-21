package food.main;

import food.model.FoodOrder;
import food.model.PremiumOrder;
import food.model.RegularOrder;
import food.service.OrderService;

public class Main {

    public static void main(String[] args) {

        FoodOrder[] orders = new FoodOrder[6];

        orders[0] = new RegularOrder(101, "Rahul", 500);
        orders[1] = new PremiumOrder(102, "Aman", 800);
        orders[2] = new RegularOrder(103, "Riya", 600);
        orders[3] = new PremiumOrder(104, "Priya", 1000);
        orders[4] = new RegularOrder(105, "Karan", 700);
        orders[5] = new PremiumOrder(106, "Neha", 900);

        System.out.println("========================================");
        System.out.println("       FOOD DELIVERY MANAGEMENT");
        System.out.println("========================================");
        System.out.println("Restaurant: " + FoodOrder.getRestaurantName());

        for (FoodOrder order : orders) {
            OrderService.displayBill(order);
        }

        FoodOrder.displayTotalOrders();
    }
}
