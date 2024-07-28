class DeliveryService extends RestaurantServiceWorkflow {
    @Override
    protected void takeOrder() {
        System.out.println("Taking delivery order online.");
    }
    @Override
    protected void prepareFood() {
        System.out.println("Preparing food for delivery.");
    }
}