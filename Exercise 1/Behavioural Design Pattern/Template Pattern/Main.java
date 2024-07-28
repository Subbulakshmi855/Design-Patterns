public class Main {
    public static void main(String[] args) {
        RestaurantServiceWorkflow dineIn = new DineInService();
        RestaurantServiceWorkflow takeout = new TakeoutService();
        RestaurantServiceWorkflow delivery = new DeliveryService();
        System.out.println("Executing Dine-In Service:");
        dineIn.serveCustomer();
        System.out.println();
        System.out.println("Executing Takeout Service:");
        takeout.serveCustomer();
        System.out.println();
        System.out.println("Executing Delivery Service:");
        delivery.serveCustomer();
    }
}
